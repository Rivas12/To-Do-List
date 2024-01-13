package com.br.todolist.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class index {
    @RequestMapping("/")
    public String Index(Model model) {
        model.addAttribute("mensagem", "hello");
        return "index";
    }
}
