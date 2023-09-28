public class Main {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone();

        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        System.out.println("\n***************************\n");

        iPhone.ligar("(38) 99233-4423");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("\n***************************\n");

        iPhone.exibirPagina("www.google.com.br");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

    }
}
