package com.enzocosta.exercicios.estoqueprodutos;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap = new HashMap<>();

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produtoMaisCaro == null) {
                produtoMaisCaro = produto;
            } else if (produto.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produtoMaisBarato == null) {
                produtoMaisBarato = produto;
            } else if (produto.getPreco() < produtoMaisBarato.getPreco()) {
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeNoEstoque() {
        Produto produtoMaiorQuantidade = null;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produtoMaiorQuantidade == null) {
                produtoMaiorQuantidade = produto;
            } else if (produto.getQuantidade() > produtoMaiorQuantidade.getQuantidade()) {
                produtoMaiorQuantidade = produto;
            }
        }
        return produtoMaiorQuantidade;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto 1", 35, 1.99);
        estoqueProdutos.adicionarProduto(2L, "Produto 2", 50, 2.59);
        estoqueProdutos.adicionarProduto(3L, "Produto 3", 10, 5.49);
        estoqueProdutos.adicionarProduto(4L, "Produto 4", 20, 3.19);
        estoqueProdutos.adicionarProduto(5L, "Produto 5", 15, 4.49);

        estoqueProdutos.exibirProdutos();

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("VALOR TOTAL DO ESTOQUE: R$" + df.format(estoqueProdutos.calcularValorTotalEstoque()));

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto com maior quantidade em estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeNoEstoque());

    }

}
