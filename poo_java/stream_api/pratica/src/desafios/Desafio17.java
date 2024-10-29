package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .filter(Desafio17::isPrimo)
                .forEach(System.out::println);

    }

    public static boolean isPrimo(Integer numero) {
        if (numero <= 1) {
            return false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
