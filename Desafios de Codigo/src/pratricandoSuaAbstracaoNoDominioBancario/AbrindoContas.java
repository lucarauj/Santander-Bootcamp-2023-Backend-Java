package pratricandoSuaAbstracaoNoDominioBancario;

import java.util.Locale;
import java.util.Scanner;

/*
    Entrada
    O programa deve solicitar ao usuário as informações necessárias para abrir uma conta bancária.
    A entrada deve ser feita via console (linha de comando) e deve incluir o número da conta (um valor inteiro), o nome do titular (uma sequência de caracteres) e o saldo inicial da conta (um valor decimal).

    Saída
    Após receber as informações da conta, o programa deve criar um objeto do tipo "ContaBancaria" e exibir na tela as informações dessa conta, incluindo o número da conta, o nome do titular e o saldo atual.
    A saída deve ser formatada de forma clara e legível para o usuário.
 */

public class AbrindoContas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);

        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
        System.out.println("Informacoes:");
        System.out.println("Conta: " + contaBancaria.numero);
        System.out.println("Titular: " + contaBancaria.titular);
        System.out.println("Saldo: R$ " + contaBancaria.saldo);

        scanner.close();
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
