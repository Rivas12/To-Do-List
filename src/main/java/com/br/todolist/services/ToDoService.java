package com.br.todolist.services;

import com.br.todolist.models.entities.TarefaEntity;
import com.br.todolist.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    // Método para obter todos os registros do banco de dados
    public List<TarefaEntity> getAllToDos() {
        return toDoRepository.findAll();
    }

}
