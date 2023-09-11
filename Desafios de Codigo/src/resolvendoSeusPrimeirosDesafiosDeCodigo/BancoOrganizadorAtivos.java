package resolvendoSeusPrimeirosDesafiosDeCodigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    Entrada
    A primeira entrada consiste em um número inteiro que representa a  quantidade de ativos que o usuário possui.
    Em seguida, o usuário deverá  informar, em linhas separadas, os tipos (strings) dos respectivos ativos.

    Saída
    Seu programa deve exibir a lista de Ativos organizada em ordem alfabética.
    Cada ativo deve ser apresentado em uma linha separada.
 */
public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> ativos = new ArrayList < > ();

        //Entrada dos tipos de ativos
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();

        // Entrada dos códigos dos ativos
        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        //TODO: Ordenar os ativos em ordem alfabética.
        Collections.sort(ativos);

        //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
        ativos.forEach(System.out::println);

        scanner.close();
    }
}