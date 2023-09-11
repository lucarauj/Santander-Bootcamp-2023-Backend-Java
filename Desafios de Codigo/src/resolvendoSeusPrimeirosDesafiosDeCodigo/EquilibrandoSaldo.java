package resolvendoSeusPrimeirosDesafiosDeCodigo;

import java.util.Scanner;

/*
    Entrada
    saldoAtual: um número decimal representando o saldo atual da conta bancária.
    valorDeposito: um número decimal representando o valor a ser depositado na conta.
    valorRetirada: um número decimal representando o valor a ser retirado da conta.

    Regra de Formatação: Considere apenas uma casa decimal para esse desafio.

    Saída
    Um número decimal que representa o saldo atualizado na conta bancária após o processamento das transações.
 */

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
        saldoAtual += valorDeposito - valorRetirada;

        //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
        System.out.println("Saldo atualizado na conta: " + saldoAtual);

        scanner.close();
    }
}