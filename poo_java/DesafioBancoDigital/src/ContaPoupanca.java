
public class ContaPoupanca extends Conta {

    private static Long SEQUENCIAL = 1000L;

    public ContaPoupanca(Integer numeroAgencia, Titular titularConta) {
        this.numeroConta = SEQUENCIAL++;
        this.numeroAgencia = numeroAgencia;
        this.titularConta = titularConta;
    }

}
