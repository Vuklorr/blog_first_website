package com.vuklorr.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FAQController {
    @GetMapping("/faq")
    public String faqMain(Model model) {
        model.addAttribute("title","faq");
        return "faq-main";
    }
}
