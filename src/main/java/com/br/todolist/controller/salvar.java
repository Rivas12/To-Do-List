package com.br.todolist.controller;

import com.br.todolist.models.dto.TarefaDTO;
import com.br.todolist.models.entities.TarefaEntity;
import com.br.todolist.services.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class salvar {

    private final ToDoService toDoService;

    public salvar(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    // Endpoint para criar uma nova tarefa via POST
    @PostMapping("/salvar")
    public TarefaEntity createToDo(@RequestBody TarefaDTO tarefaDTO) {
        TarefaEntity novaTarefa = new TarefaEntity();
        novaTarefa.setMembro_nome(tarefaDTO.getMembro_nome());
        novaTarefa.setMembro_avatar(tarefaDTO.getMembro_avatar());
        novaTarefa.setTask_nome(tarefaDTO.getTask_nome());
        novaTarefa.setPrioridade(novaTarefa.getPrioridade());
        System.out.print((novaTarefa));
        return toDoService.saveToDo(novaTarefa);
    }
}