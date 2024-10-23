package com.enzocosta.exercicios.carrinhocompras;

public class Main {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Mostarda", 10, 1);
        carrinhoDeCompras.adicionarItem("Chocolate", 8, 2);
        carrinhoDeCompras.adicionarItem("Escova de Dente", 20, 1);

        carrinhoDeCompras.removerItem("Mostarda");

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();

    }

}
