package com.br.todolist.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TarefaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String membro_nome;
    private String membro_avatar;
    private String task_nome;
    private String prioridade;

    public String getMembro_nome() {
        return membro_nome;
    }

    public void setMembro_nome(String membro_nome) {
        this.membro_nome = membro_nome;
    }

    public String getMembro_avatar() {
        return membro_avatar;
    }

    public void setMembro_avatar(String membro_avatar) {
        this.membro_avatar = membro_avatar;
    }

    public String getTask_nome() {
        return task_nome;
    }

    public void setTask_nome(String task_nome) {
        this.task_nome = task_nome;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
