package com.br.todolist.controller;

import com.br.todolist.models.entities.TarefaEntity;
import com.br.todolist.services.ToDoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Index {

    private final ToDoService toDoService;

    public Index(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/")
    public String showIndexPage(Model model) {
        List<TarefaEntity> toDoList = toDoService.getAllToDos();

        model.addAttribute("toDoList", toDoList);
        return "index";
    }
}
