
public class ContaCorrente extends Conta {

    private static Long SEQUENCIAL = 1000L;

    public ContaCorrente(Integer numeroAgencia, Titular titularConta) {
        this.numeroConta = SEQUENCIAL++;
        this.numeroAgencia = numeroAgencia;
        this.titularConta = titularConta;
    }

}
