import java.util.Locale;
import java.util.Scanner;

/*
    Entrada
    O programa deve utilizar o Scanner para receber os valores de depósito digitados pelo cliente.
    Os valores podem ser decimais, representando valores em reais.

    Saída
    O programa deve exibir uma mensagem de sucesso quando um valor de depósito válido for informado e o saldo da conta for atualizado.
    Caso um valor inválido seja digitado, o programa deve exibir uma mensagem de erro e solicitar um novo valor.
 */

public class OGrandeDeposito {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        double saldoAtual = 0;

        if (valor > 0) {
            saldoAtual = valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f", saldoAtual);
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
        scanner.close();
    }
}