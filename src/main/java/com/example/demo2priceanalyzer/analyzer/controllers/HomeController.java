package com.example.demo2priceanalyzer.analyzer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class HomeController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
