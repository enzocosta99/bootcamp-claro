
public abstract class Conta implements ContaInterface{

    protected Long numeroConta;
    protected Integer numeroAgencia;
    protected Titular titularConta;
    protected double saldo = 0;

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo na conta é de R$: " + this.saldo);
    }

}
