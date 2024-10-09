public class Metodos {
    public static void main(String[] args) throws Exception {
        
        Televisao televisao = new Televisao();

        System.out.println("Situação ligada atual: " + televisao.isLigada());
        System.out.println("Volume atual: " + televisao.getVolume());
        System.out.println("Canal atual: " + televisao.getCanal());
        
        System.out.println("-------------------------------------");

        televisao.ligar();
        televisao.mudarCanal(20);
        televisao.aumentarCanal();
        for(int i = 0; i < 10; i++) {
            televisao.aumentarVolume();
        }

        System.out.println("Nova situação ligada atual: " + televisao.isLigada());
        System.out.println("Novo volume atual: " + televisao.getVolume());
        System.out.println("Novo Canal atual: " + televisao.getCanal());
    }
}
