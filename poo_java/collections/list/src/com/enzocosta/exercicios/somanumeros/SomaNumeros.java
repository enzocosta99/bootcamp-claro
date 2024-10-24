package com.enzocosta.exercicios.somanumeros;

import java.util.ArrayList;

public class SomaNumeros {

    ArrayList<Integer> numerosInteirosList = new ArrayList<>();

    public void adicionarNumero(Integer numero) {
        numerosInteirosList.add(numero);
    }

    public Integer calcularSoma() {
        Integer soma = 0;
        for (Integer numero : numerosInteirosList) {
            soma += numero;
        }
        return soma;
    }

    public Integer encontrarMaiorNumero() {
        Integer maior = 0;
        int cont = 0;
        for (Integer numero : numerosInteirosList) {
            if (cont == 0) {
                maior = numero;
                cont++;
            } else if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public Integer encontrarMenorNumero() {
        Integer menor = 0;
        int cont = 0;
        for (Integer numero : numerosInteirosList) {
            if (cont == 0) {
                menor = numero;
                cont++;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public ArrayList<Integer> exibirNumeros() {
        return numerosInteirosList;
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        System.out.println("Soma de todos os números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Lista com todos os números: " + somaNumeros.exibirNumeros());

    }

}
