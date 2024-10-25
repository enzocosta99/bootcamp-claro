package com.enzocosta.exercicios.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    Map<String, String> dicionarioMap = new HashMap<>();

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        return dicionarioMap.get(palavra);
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra", "Palavra é isso, aquilo e tal.");
        dicionario.adicionarPalavra("Futebol", "Futebol é um esporte bem legal.");
        dicionario.adicionarPalavra("Banana", "Banana é uma fruta.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Palavra");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Futebol"));

    }

}
