public interface ContaInterface {

    void transferir(double valor, Conta contaDestino);

    void sacar(double valor);

    void depositar(double valor);

    void consultarSaldo();

}
