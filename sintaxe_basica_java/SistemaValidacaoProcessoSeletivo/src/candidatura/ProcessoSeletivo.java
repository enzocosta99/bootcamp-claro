package candidatura;

import java.util.Objects;
import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String[] candidatos = {"ENZO", "FELIPE", "MARCOS", "GABRIEL", "MATHEUS", "LUIZA", "MARIA", "ANA", "LAURA", "VITORIA"};

        String[] candidatosSelecionados = selecaoDeCandidatos(candidatos);

        System.out.print("CANDIDATOS SELECIONADOS: ");

        for (String candidato : candidatosSelecionados) {
            System.out.print(candidato + " ");
        }

        System.out.println("\n==================================");
        System.out.println("====LIGANDO PARA OS CANDIDATOS====");
        System.out.println("==================================");

        ligarParaCandidatos(candidatosSelecionados);

    }

    static void ligarParaCandidatos(String[] candidatosSelecionados) {

        for (String candidato : candidatosSelecionados) {

            if (Objects.equals(candidato, "")) {
                break;
            }

            System.out.println("Ligando para o candidato " + candidato + "...");

            int numeroRandomico = 0;
            int tentativas = 0;

            while(numeroRandomico != 1) {

                if (tentativas == 3) {
                    System.out.println("Tentativas de contato com " + candidato + " esgotadas!");
                    break;
                }

                System.out.println("CHAMANDO...");

                tentativas++;

                numeroRandomico = new Random().nextInt(0, 3);
            }

            if (tentativas < 3) {
                System.out.println("ALÔ!!!!!!");
            }

        }

    }

    static String[] selecaoDeCandidatos(String[] candidatos) {

        int candidatosSelecionados = 0;
        int indiceCandidatoSelecionado = 0;
        String[] listaCandidatosSelecionados = {"", "", "", "", ""};

        for (String candidato : candidatos) {

            double salarioPretendido = salarioPretendido();

            if (analisarCandidato(salarioPretendido)) {
                listaCandidatosSelecionados[indiceCandidatoSelecionado] = candidato;
                candidatosSelecionados++;
                indiceCandidatoSelecionado++;
            }

            if (candidatosSelecionados == 5) {
                break;
            }
        }

        return listaCandidatosSelecionados;
    }

    static double salarioPretendido() {
        return new Random().nextDouble(1800, 2200);
    }

    static boolean analisarCandidato(double salarioPretendido) {
        return salarioPretendido <= 2000;
    }

}
