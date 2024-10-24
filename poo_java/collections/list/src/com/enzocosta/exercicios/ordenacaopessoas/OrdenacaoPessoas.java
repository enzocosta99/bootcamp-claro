package com.enzocosta.exercicios.ordenacaopessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList = new ArrayList<>();

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdadeList = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdadeList);
        return pessoasPorIdadeList;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAlturaList = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAlturaList, new ComparatorPorAltura());
        return pessoasPorAlturaList;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.60);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 22, 1.75);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 18, 1.59);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 19, 1.63);
        ordenacaoPessoas.adicionarPessoa("Nome 5", 20, 1.70);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }

}
