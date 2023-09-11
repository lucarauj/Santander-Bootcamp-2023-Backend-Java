package pratricandoSuaAbstracaoNoDominioBancario;

import java.util.Locale;
import java.util.Scanner;

/*
    Entrada
    A entrada será a representação de um registro (string) no formato e sequencia: "data,hora,descricao,valor".

    Saída
    A saída deve ser o valor do registro (string) recebido na entrada informando a transação efetuada,
    contendo, descrição, data, hora e valor da transação, como no exemplo da tabela a baixo.
 */

public class UltimaTransacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");

        Transacao transacao = new Transacao(partes[0], partes[1], partes[2], Double.valueOf(partes[3]));
        transacao.imprimir();

        scanner.close();
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }
}
