package com.sistema.gpon.controller;

import com.sun.tools.javac.Main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping("/index")
    public String index(){
        return "main/index";
    }
}
