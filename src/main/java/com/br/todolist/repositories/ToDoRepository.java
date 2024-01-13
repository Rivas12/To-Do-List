package com.br.todolist.repositories;

import com.br.todolist.models.entities.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<TarefaEntity, Long> {

}