import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraDeMedia {

    public static void main(String[] args) {

        String[] alunos = {"Enzo", "Pedro", "Ana", "Julia"};

        double mediaTurma = calcularMediaDaTurma(alunos);

        System.out.println("A média da turma é " + mediaTurma);

    }

    private static double calcularMediaDaTurma(String[] alunos) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double mediaTurma;
        double somaTotal = 0;
        int quantidadeAlunos = 0;

        for (String aluno : alunos) {

            boolean mediaValida = false;

            while(!mediaValida) {

                System.out.print("Média de " + aluno + ": ");

                try {
                    somaTotal += scanner.nextDouble();
                    mediaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um valor numérico...");
                    scanner.next();
                }
            }

            quantidadeAlunos++;
        }

        mediaTurma = somaTotal / quantidadeAlunos;

        return mediaTurma;

    }

}
