import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Olá! Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência:");
        numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente.toUpperCase() +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta "+ numeroConta +
                " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}