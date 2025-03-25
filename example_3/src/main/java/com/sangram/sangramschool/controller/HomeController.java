package com.sangram.sangramschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value ={"" , "/", "Home"})
    public String dsiplayHomePage(Model model) {
        model.addAttribute("username", "Harry Bro");
        return "Home.html";
    }
}
