public class Televisao {
    
    private boolean ligada = false;
    private int volume = 25;
    private int canal = 1;

    public boolean isLigada() {
        return ligada;
    }
    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }
    public int getCanal() {
        return canal;
    }
    private void setCanal(int canal) {
        this.canal = canal;
    }    

    public void ligar() {
        this.setLigada(true);
    }

    public void desligar() {
        this.setLigada(false);
    }

    public void aumentarVolume() {
        this.setVolume(volume + 1);
    }

    public void diminuirVolume() {
        this.setVolume(volume - 1);
    }

    public void aumentarCanal() {
        this.setCanal(canal + 1);
    }

    public void diminuirCanal() {
        this.setCanal(canal - 1);
    }

    public void mudarCanal(int novoCanal) {
        this.setCanal(novoCanal);
    }

}
