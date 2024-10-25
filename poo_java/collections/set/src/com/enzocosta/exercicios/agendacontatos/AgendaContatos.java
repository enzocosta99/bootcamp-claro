package com.enzocosta.exercicios.agendacontatos;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatoSet = new HashSet<>();

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        for (Contato contato : contatoSet) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosEncontradosSet = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (Objects.equals(contato.getNome(), nome)) {
                contatosEncontradosSet.add(contato);
            }
        }
        return contatosEncontradosSet;
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato contato : contatoSet) {
            if (Objects.equals(contato.getNome(), nome)) {
                contato.setNumeroTelefone(novoNumero);
            }
        }
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Enzo", 981179861);
        agendaContatos.adicionarContato("Enzo", 40028922);
        agendaContatos.adicionarContato("Paulo", 981982011);
        agendaContatos.adicionarContato("Maria", 990289176);
        agendaContatos.adicionarContato("Julia", 991892033);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Enzo"));

        agendaContatos.atualizarNumeroContato("Paulo", 997228099);

        agendaContatos.exibirContatos();

    }

}
