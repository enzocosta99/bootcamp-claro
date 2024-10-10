
public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        int nota = 7;

        if(nota >= 6) {
            System.out.println("Aprovado!");
        } else if(nota >= 4 && nota < 6) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        // Utilizando condição ternária
        String resultado = nota >= 6 ? "Aprovado!" : nota >= 4 && nota < 6 ? "Recuperação!" : "Reprovado";

        System.out.println(resultado);

    }

}
