import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    
    public static void main(String[] args) {

        // Uma das funcionalidades do Scanner é obter dados de entrada do usuário através do terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá! Me chamo " + nome + " " + sobrenome + "!");
        System.out.println("Tenho " + idade + " anos e " + altura + " de altura!");

    }

}
