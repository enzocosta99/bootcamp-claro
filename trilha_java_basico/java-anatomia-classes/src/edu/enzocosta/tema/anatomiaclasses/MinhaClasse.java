package edu.enzocosta.tema.anatomiaclasses;

public class MinhaClasse {
    
    public static void main(String[] args) {

        String primeiroNome = "Enzo";
        String segundoNome = "Costa";
        String nomeCompleto;

        nomeCompleto = retornaNomeCompleto(primeiroNome, segundoNome);

        System.out.println("Olá, " + nomeCompleto + "!");

    }

    public static String retornaNomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
