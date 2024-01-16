package com.br.todolist.controller;

import com.br.todolist.models.dto.TarefaDTO;
import com.br.todolist.models.entities.TarefaEntity;
import com.br.todolist.services.ToDoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salvar")
public class Salvar {

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
        novaTarefa.setPrioridade(novaTarefa.getPrioridade());
        return toDoService.saveToDo(novaTarefa);
    }
}