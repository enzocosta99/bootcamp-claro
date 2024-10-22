package com.enzocosta.aparelhos;

import com.enzocosta.funcionalidades.AparelhoTelefonico;
import com.enzocosta.funcionalidades.NavegadorNaInternet;
import com.enzocosta.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO: " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("ALÔ!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA DA URL: " + url + "...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("TOCANDO MÚSICA...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("MÚSICA PAUSADA...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO A MÚSICA: " + musica + "...");
    }

}
