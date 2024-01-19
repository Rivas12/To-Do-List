package com.br.todolist.controller;

import com.br.todolist.models.dto.TarefaDTO;
import com.br.todolist.models.entities.TarefaEntity;
import com.br.todolist.services.ToDoService;
<<<<<<< HEAD:src/main/java/com/br/todolist/controller/salvar.java
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/salvar")
public class salvar {
=======
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salvar")
public class Salvar {
>>>>>>> origin/main:src/main/java/com/br/todolist/controller/Salvar.java

    private final ToDoService toDoService;

    public Salvar(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    // Endpoint para criar uma nova tarefa via POST
    @PostMapping
    public TarefaEntity createToDo(@RequestBody TarefaDTO tarefaDTO) {
        TarefaEntity novaTarefa = new TarefaEntity();
        novaTarefa.setMembro_nome(tarefaDTO.getMembro_nome());
        novaTarefa.setMembro_avatar(tarefaDTO.getMembro_avatar());
        novaTarefa.setTask_nome(tarefaDTO.getTask_nome());
<<<<<<< HEAD:src/main/java/com/br/todolist/controller/salvar.java
        novaTarefa.setPrioridade(tarefaDTO.getPrioridade());
=======
        novaTarefa.setPrioridade(novaTarefa.getPrioridade());
>>>>>>> origin/main:src/main/java/com/br/todolist/controller/Salvar.java
        return toDoService.saveToDo(novaTarefa);
    }
}