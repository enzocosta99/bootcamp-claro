
public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI("PI", "Piauí"),
    MARANHAO("MA", "Maranhão");

    private String sigla;
    private String nome;

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return this.sigla;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNomeMaiusculo() {
        return this.nome.toUpperCase();
    }

}
