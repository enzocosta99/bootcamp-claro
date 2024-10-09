import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaTerminal conta = new ContaTerminal();

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.print("Digite a agência da conta: ");
        conta.setAgencia(scanner.next());

        System.out.print("Digite o nome do cliente: ");
        conta.setNomeCliente(scanner.next());

        System.out.print("Digite o saldo da conta: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.println("===========================================");

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", " +
                "conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");

    }
}
