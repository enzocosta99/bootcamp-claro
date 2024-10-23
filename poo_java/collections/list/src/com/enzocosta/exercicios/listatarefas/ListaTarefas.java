package com.enzocosta.exercicios.listatarefas;

import java.util.ArrayList;
import java.util.Objects;

public class ListaTarefas {

    ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
        System.out.println("TAREFA ADICIONADA...");
    }

    public void removerTarefa(String descricao) {
        int cont = 0;
        for(Tarefa tarefa : listaTarefas) {
            if (Objects.equals(descricao, tarefa.descricao)) {
                listaTarefas.remove(tarefa);
                System.out.println("TAREFA REMOVIDA...");
                break;
            } else if (cont == listaTarefas.size() - 1) {
                System.out.println("TAREFA NÃO EXISTE!");
            } else {
                cont++;
            }
        }
    }

    public int obterNumeroTotalTarefas() {
        int cont = 0;
        for (Tarefa tarefa : listaTarefas) {
            cont++;
        }
        return cont;
    }

    public ArrayList<String> obterDescricoesTarefas() {
        ArrayList<String> listaDescricoes = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas) {
            listaDescricoes.add(tarefa.descricao);
        }
        return listaDescricoes;
    }

}
