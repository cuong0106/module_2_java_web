package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class chuyen_Doi_Tien_Te {
    @RequestMapping("/chuyen_Doi_Tien_Te")
    public String chuyen_Doi_Tien_Te(){
        return "chuyen_Doi_Tien_Te";
    }
    @RequestMapping("/kqchuyen_Doi_Tien_Te")
    public String converter(@RequestParam String usd, @RequestParam String rate, Model model){
        float a=Float.parseFloat(usd);
        float b=Float.parseFloat(rate);
        float vnd=a*b;
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        model.addAttribute("vnd",vnd);
        return "kq_Chuyen_Doi_Tien_Te";
    }

}
