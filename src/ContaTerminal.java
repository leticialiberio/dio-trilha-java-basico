import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("Ol�! Por favor, digite o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o n�mero da sua ag�ncia:");
        numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o n�mero da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Ol� " + nomeCliente.toUpperCase() +
                ", obrigado por criar uma conta em nosso banco, sua ag�ncia � "
                + numeroAgencia + ", conta "+ numeroConta +
                " e seu saldo " + saldo + " j� est� dispon�vel para saque.");

        scanner.close();
    }
}