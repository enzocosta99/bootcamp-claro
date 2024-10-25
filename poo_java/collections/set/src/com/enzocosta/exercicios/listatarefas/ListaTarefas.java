package com.enzocosta.exercicios.listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefaSet = new HashSet<>();

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefaSet.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefaSet) {
            System.out.println(tarefa);
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidasSet.add(tarefa);
            }
        }
        return tarefasConcluidasSet;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentesSet = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentesSet.add(tarefa);
            }
        }
        return tarefasPendentesSet;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        listaTarefas.adicionarTarefa("Tarefa 4");
        listaTarefas.adicionarTarefa("Tarefa 5");

        listaTarefas.removerTarefa("Tarefa 1");

        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 5");

        listaTarefas.marcarTarefaPendente("Tarefa 5");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

    }

}
