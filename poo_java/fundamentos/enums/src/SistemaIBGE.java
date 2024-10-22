
public class SistemaIBGE {

    public static void main(String[] args) {

        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println("Sigla: " + e.getSigla() + ", Nome: " + e.getNomeMaiusculo());
        }

        EstadoBrasileiro estadoSaoPaulo = EstadoBrasileiro.SAO_PAULO;

        System.out.println("Sigla: " + estadoSaoPaulo.getSigla() + ", Nome: " + estadoSaoPaulo.getNome());

    }
}