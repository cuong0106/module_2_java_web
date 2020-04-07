package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class chon_Menu {
    @RequestMapping("/chon_menu")
    public String greeting(@RequestParam String chuong_Trinh){
        return chuong_Trinh;
    }
}
