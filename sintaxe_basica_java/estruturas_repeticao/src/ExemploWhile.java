import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {
        
        double mesada = 50;

        while(mesada > 0) {

            double valorDoce = valorAleatorio();

            if(valorDoce > mesada) {
                valorDoce = mesada;
            }

            mesada -= valorDoce;

            System.out.printf("João gastou R$%.2f e agora ele ainda tem mais R$%.2f \n", valorDoce, mesada);

        }

        System.out.println("João gastou toda a sua mesada!");

    }

    public static double valorAleatorio() {

        return ThreadLocalRandom.current().nextDouble(2, 8);

    }

}
