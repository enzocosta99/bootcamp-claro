import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {
        
        System.out.println("Discando...\n");

        do{

            System.out.println("Telefone tocando...");

        } while(tocando());

        System.out.println("\nAlô...");

    }

    private static boolean tocando() {
        
        return new Random().nextInt(3) != 1;

    }

}
