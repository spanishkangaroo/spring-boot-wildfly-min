package com.example.demo.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
    @GetMapping("/jsp")
    String jspPage(Model model) {
        return "jsp/demo";
    }

}
