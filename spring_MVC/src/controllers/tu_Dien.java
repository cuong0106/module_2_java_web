package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class tu_Dien {
    @RequestMapping("/tu_Dien")
    public String view_Tu_Dien(){
        return "tu_Dien";
    }
    @RequestMapping("/kq_Tu_Dien")
    public String kq_Tu_Dien(@RequestParam String txtSearch, Model model) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple", "quả táo");
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("cat", "con mèo");
        dictionary.put("dog", "con chó");

        String result = dictionary.get(txtSearch);
        String error="Không có từ này";
        if (result!=null){
            model.addAttribute("result",result);
            model.addAttribute("word",txtSearch);
        }else {
            model.addAttribute("error",error);
        }
        return "kq_Tu_Dien";
    }
}
