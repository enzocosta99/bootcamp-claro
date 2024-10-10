
public class FormatadorDeCep {

    public static void main(String[] args) {
        
        try {
            String cepFormatado = formatarCep("14021-520");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de negócio!");
        }

    }

    private static String formatarCep(String cep) throws CepInvalidoException{

        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        return "23765-064";

    }

}
