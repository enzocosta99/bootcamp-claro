package com.enzocosta.exercicios.catalogolivros;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 1", 1998);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 1999);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 2007);
        catalogoLivros.adicionarLivro("Livro 6", "Autor 5", 2001);
        catalogoLivros.adicionarLivro("Livro 7", "Autor 5", 1996);

        System.out.println("PESQUISA DE LIVROS DO AUTOR 1");
        ArrayList<Livro> livrosDoAutor1List = catalogoLivros.pesquisarPorAutor("Autor 1");
        for (Livro livro : livrosDoAutor1List) {
            System.out.println(livro.getTitulo());
        }

        System.out.println("\nPESQUISA DE LIVROS PUBLICADOS ENTRE 1999 E 2002");
        ArrayList<Livro> livrosEntre1999E2002 = catalogoLivros.pesquisarPorIntervaloAnos(1999, 2002);
        for (Livro livro : livrosEntre1999E2002) {
            System.out.println(livro.getTitulo());
        }

        System.out.println("\nPESQUISA POR TÍTULO 'Livro 1'...");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1").getTitulo());

    }

}
