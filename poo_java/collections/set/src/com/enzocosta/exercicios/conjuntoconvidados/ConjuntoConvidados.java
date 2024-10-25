package com.enzocosta.exercicios.conjuntoconvidados;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite().equals(codigoConvite)) {
                convidadoSet.remove(convidado);
                break;
            }
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Nome 1", 1);
        conjuntoConvidados.adicionarConvidado("Nome 2", 2);
        conjuntoConvidados.adicionarConvidado("Nome 3", 3);
        conjuntoConvidados.adicionarConvidado("Nome 4", 4);
        conjuntoConvidados.adicionarConvidado("Nome 5", 5);

        //conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        //conjuntoConvidados.exibirConvidados();

        System.out.println("Número total de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();

    }

}
