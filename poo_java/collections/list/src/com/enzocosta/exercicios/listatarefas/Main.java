package com.enzocosta.exercicios.listatarefas;

public class Main {

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");

        listaTarefas.removerTarefa("Tarefa 2");

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        System.out.println(listaTarefas.obterDescricoesTarefas());

    }

}