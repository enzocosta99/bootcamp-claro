
public class Main {

    public static void main(String[] args) {

        Titular titular = new Titular("Joao", "42290352192", 25);
        ContaCorrente contaCorrente = new ContaCorrente(1, titular);

        Titular titular1 = new Titular("Maria", "47892019872", 30);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1, titular1);

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(500);

        contaCorrente.transferir(250, contaPoupanca);

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();

        Titular titular2 = new Titular("Pedro", "43567828902", 19);
        ContaCorrente contaCorrente1 = new ContaCorrente(1, titular2);

        Titular titular3 = new Titular("Ana", "45673872108", 50);
        ContaCorrente contaCorrente2 = new ContaCorrente(1, titular3);

        System.out.println(contaCorrente.numeroConta);
        System.out.println(contaPoupanca.numeroConta);

        System.out.println(contaCorrente1.numeroConta);
        System.out.println(contaCorrente2.numeroConta);
    }

}