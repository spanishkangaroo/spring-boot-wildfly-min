package com.example.demo.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

	@GetMapping("/th")
    String thymeleafPage(Model model) {
        return "thymeleaf/demo";
    }
}
