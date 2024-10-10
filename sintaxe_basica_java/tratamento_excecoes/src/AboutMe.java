import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Imprimindo os resultados obtidos
        System.out.println("Olá! Me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e " + altura + " de altura!");
        scanner.close();

        } catch(InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }        

    }
}
