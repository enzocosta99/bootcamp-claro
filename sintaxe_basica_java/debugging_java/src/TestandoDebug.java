
public class TestandoDebug {

    public static void main(String[] args) {

        System.out.println("Iniciou aqui o método Main...");
        metodoA();
        System.out.println("Terminou aqui o método Main...");

    }

    public static void metodoA() {
        System.out.println("Iniciou aqui o método A...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador número " + i + " do método A");
        }
        metodoB();
        System.out.println("Terminou aqui o método A...");
    }

    public static void metodoB() {
        System.out.println("Iniciou aqui o método B...");
        System.out.println("Sou o método B sendo chamado dentro do método A, e antes de finalizar ainda vou chamar o método C...");
        metodoC();
        System.out.println("Terminou aqui o método B...");
    }

    public static void metodoC() {
        System.out.println("Iniciou aqui o método C...");
        System.out.println("Terminou aqui o método C...");
    }

}
