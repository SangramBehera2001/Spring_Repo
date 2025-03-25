package com.sangram.sangramschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/Home")
    public String dsiplayHomePage() {
        return "Home.html";
    }
}
