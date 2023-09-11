package pratricandoSuaAbstracaoNoDominioBancario;

/*
    Entrada
    O programa irá solicitar ao usuário que digite o tipo de cofre a ser criado: "digital" ou "físico".
    Se for escolhido o tipo "digital", o programa irá solicitar a senha e a confirmação de senha do cofre digital (ambas com apenas números).
    Caso seja escolhido o tipo "físico", não é necessário nenhuma outra entrada.

    Saída
    O programa irá exibir as informações do cofre criado.
    Para o Cofre Digital, será exibido o tipo e o método de abertura (senha).
    Para o Cofre Físico, será exibido apenas o tipo e o método de abertura (chave).
 */

import java.util.Scanner;

public class CofresSeguros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {

            int senha = scanner.nextInt();

            CofreDigital cofreDigital = new CofreDigital(senha);

            int validadorSenha = scanner.nextInt();
            boolean confirmacao = cofreDigital.validarSenha(validadorSenha);

            if(confirmacao) {
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            }

        } else {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
        scanner.close();
    }
}

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}
