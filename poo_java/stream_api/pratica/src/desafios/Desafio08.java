package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream()
                .mapToInt(n -> String.valueOf(n)
                        .chars()
                        .map(Character::getNumericValue)
                        .sum())
                .sum();

        System.out.println("A soma dos digitos é: " + somaDigitos);
    }
}
