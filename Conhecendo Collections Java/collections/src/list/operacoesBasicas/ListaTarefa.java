package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalDeTarefa() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Pagar contas");
        listaTarefa.adicionarTarefa("Arrumar as malas");
        System.out.println(listaTarefa.obterNumeroTotalDeTarefa());
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Pagar contas");
        System.out.println(listaTarefa.obterNumeroTotalDeTarefa());
        listaTarefa.obterDescricoesTarefas();



    }
}
