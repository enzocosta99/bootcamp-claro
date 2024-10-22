import com.enzocosta.aparelhos.Iphone;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        System.out.println("===========================================================");
        System.out.println("========== FUNCIONALIDADES DO REPRODUTOR MUSICAL ==========");
        System.out.println("===========================================================");

        iphone.selecionarMusica("Boate Azul");
        iphone.tocarMusica();
        iphone.pausarMusica();

        System.out.println("============================================================");
        System.out.println("========== FUNCIONALIDADES DO APARELHO TELEFÔNICO ==========");
        System.out.println("============================================================");

        iphone.ligar("16993872982");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("==============================================================");
        System.out.println("========== FUNCIONALIDADES DO NAVEGADOR NA INTERNET ==========");
        System.out.println("==============================================================");

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }

}
