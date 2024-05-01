import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o seu nome completo.");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta.");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá ".concat(nome)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numero))
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já está disponível para saque.")
        );
    }
}
