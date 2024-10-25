package com.enzocosta.exercicios.conjuntopalavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoPalavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for (String p : conjuntoPalavrasUnicasSet) {
            if (p.equals(palavra)) {
                conjuntoPalavrasUnicasSet.remove(p);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        for (String p : conjuntoPalavrasUnicasSet) {
            if (p.equals(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        for (String p : conjuntoPalavrasUnicasSet) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
//        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 5");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
