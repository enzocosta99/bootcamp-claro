package com.enzocosta.exercicios.catalogolivros;

import java.util.ArrayList;
import java.util.Objects;

public class CatalogoLivros {

    ArrayList<Livro> livroList = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public ArrayList<Livro> pesquisarPorAutor(String autor) {
        ArrayList<Livro> livrosEncontradosList = new ArrayList<>();
        for (Livro livro : livroList) {
            if (Objects.equals(livro.getAutor(), autor)) {
                livrosEncontradosList.add(livro);
            }
        }
        return livrosEncontradosList;
    }

    public ArrayList<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        ArrayList<Livro> livrosEncontradosList = new ArrayList<>();
        for (Livro livro : livroList) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosEncontradosList.add(livro);
            }
        }
        return livrosEncontradosList;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        int cont = 0;
        for (Livro livro : livroList) {
            if (Objects.equals(livro.getTitulo(), titulo)) {
                System.out.println("LIVRO ENCONTRADO...");
                return livro;
            } else if (cont <= livroList.size() - 1) {
                cont++;
            }
        }
        System.out.println("LIVRO NÃO ENCONTRADO...");
        return null;
    }

}
