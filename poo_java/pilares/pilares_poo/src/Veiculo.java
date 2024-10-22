
public abstract class Veiculo {

    private String chassi;

    private String getChassi() {
        return this.chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();

}
