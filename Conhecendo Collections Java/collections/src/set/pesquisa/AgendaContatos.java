package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contato contato : contatosSet) {
                if (contato.getNome().toUpperCase().startsWith(nome.toUpperCase())) {
                    contatosPorNome.add(contato);
                }
            }
            return contatosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato contato : contatosSet) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);
                    contatoAtualizado = contato;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ana", 88888888);
        agendaContatos.adicionarContato("Carolina", 99999999);
        agendaContatos.adicionarContato("Maria", 77777777);
        agendaContatos.adicionarContato("Maria", 66666666);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Fernando", 44444444);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("MARIA"));

        agendaContatos.atualizarNumeroContato("Maria", 66666666);

        agendaContatos.exibirContatos();
    }
}
