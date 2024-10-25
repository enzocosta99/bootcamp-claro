package com.enzocosta.exercicios.agendacontatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatosMap = new HashMap<>();

    public void adicionarContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        contatosMap.remove(nome);
    }

    public void exibirContatos() {
//        contatosMap.forEach((key, value) -> {
//            System.out.println("Nome: " + key + " Telefone: " + value);
//        });
        System.out.println(contatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if (!contatosMap.isEmpty()) {
            return contatosMap.get(nome);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Enzo", 981179861);
        agendaContatos.adicionarContato("Pedro", 40028922);
        agendaContatos.adicionarContato("Carlos", 998810927);
        agendaContatos.adicionarContato("Luisa", 981189209);
        agendaContatos.adicionarContato("Ana", 997466282);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Carlos");
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Enzo"));

    }

}
