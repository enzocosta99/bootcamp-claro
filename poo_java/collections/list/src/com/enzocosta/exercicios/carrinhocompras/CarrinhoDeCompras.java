package com.enzocosta.exercicios.carrinhocompras;

import java.util.ArrayList;
import java.util.Objects;

public class CarrinhoDeCompras {

    ArrayList<Item> itemList = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
        System.out.println("ITEM ADICIONADO...");
    }

    public void removerItem(String nome) {
        int cont = 0;
        for (Item item : itemList) {
            if (Objects.equals(item.getNome(), nome)) {
                itemList.remove(item);
                System.out.println("ITEM REMOVIDO...");
                break;
            } else if (cont <= itemList.size() - 1) {
                cont++;
            } else {
                System.out.println("ITEM NÃO EXISTE!");
            }
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        for (Item item : itemList) {
            System.out.println("Nome: " + item.getNome());
            System.out.println("Preço: " + item.getPreco());
            System.out.println("Quantidade: " + item.getQuantidade());
        }
    }

}
