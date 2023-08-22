import java.util.Scanner;

public class ContaTerrminal {

    public static void main(String[] args) {

        Double saldo = 120.20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número da conta: ");
        Integer numeroConta = sc.nextInt();

        System.out.println("Informe o número da agência com o dígito (0000-0): ");
        String numeroAgencia = sc.next();

        System.out.println("Qual o seu nome? ");
        String nomeUsuario = sc.next();

        concat(numeroConta, numeroAgencia, nomeUsuario, saldo);

        sc.close();
    }

    public static void concat(Integer conta, String agencia, String nome, Double saldo) {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.", nome, agencia, conta, saldo);
    }
}
