public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        double salarioMinimo = 2.500; // Mesma coisa que 2,5 ou 2.5, e não 2500

        short numeroCurto = 1;
        int numeroCurto1 =  numeroCurto;
        short numeroCurto2 = (short) numeroCurto1;

        // Variáveis: valores que podem ser mudados
        int numero = 5;
        numero = 10;

        // Constantes: valores que não podem ser mudados
        //obs: devem ser declaradas em maiúscular e as palavras que a compõem devem ser separadas por sublinhados
        final double VALOR_DE_PI = 3.14;
        //VALOR_DE_PI = 3.15;

        

    }
}
