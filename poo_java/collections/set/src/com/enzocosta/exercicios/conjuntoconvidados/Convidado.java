package com.enzocosta.exercicios.conjuntoconvidados;

import java.util.Objects;

public class Convidado {

    private String nome;
    private Integer codigoConvite;

    public Convidado(String nome, Integer codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return Objects.equals(codigoConvite, convidado.codigoConvite);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }
}
