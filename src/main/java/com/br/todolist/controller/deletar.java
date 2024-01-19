package com.br.todolist.controller;

import com.br.todolist.services.ToDoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deletar")
public class deletar {

    private final ToDoService toDoService;

    public deletar(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    // Endpoint para deletar uma tarefa via POST
    // Endpoint para deletar uma tarefa por ID
    @DeleteMapping("/{id}")
    public String deleteToDo(@PathVariable("id") Long id) {
        return toDoService.deleteToDo(id);
    }
}