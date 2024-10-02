public class Operadores {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {

        //Quando usado o operador + com variáveis do tipo String, as variáveis são concatenadas
        String nomeCompleto = "Enzo " + "Costa";
        System.out.println(nomeCompleto);

        int num1 = 10;
        int num2 = 5;

        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
        int multiplicacao = num1 * num2;
        System.out.println("Multiplicação: " + multiplicacao);
        int divisao = num1 / num2;
        System.out.println("Divisão: " + divisao);
        int modulo = num1 % num2;
        System.out.println("Módulo: " + modulo);

        //Testando concatenação de Strings com inteiros com debug
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);

        //Transformando um número negativo em positivo
        num1 = -5;
        num1 = num1 * -1; //Basta multiplicá-lo por -1

        //Invertendo o valor de uma variável booleana
        boolean variavelBooleana = true;
        System.out.println("Variável original: " + variavelBooleana);

        variavelBooleana = !variavelBooleana;
        System.out.println("Variável alterada: " + variavelBooleana);

        //Operadores ternários
        num1 = 5;
        num2 = 6;
        System.out.println(num1 == num2 ? "Iguais" : "Diferentes"); //Se o num1 for igual ao num2, imprime "Iguais", caso não seja igual, imprime "Diferentes"
        //A primeira expressão antes do "?" (num1 == num2), deve ser uma expressão booleana, ou seja, deve retornar um true ou false.
        //Caso seja true, acontece o que está a esquerda do ":" (imprime "Iguais"), quase seja false, acontece o que está a direita do ":" (imprime "Diferentes").

    }
}
