package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(listaOrdenadaPorIdade);
        return listaOrdenadaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaOrdenadaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(listaOrdenadaPorAltura, new ComparatorPorAltura());
        return listaOrdenadaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Lucas", 22, 1.64);
        ordenacaoPessoa.adicionarPessoa("Eduardo", 36, 1.57);
        ordenacaoPessoa.adicionarPessoa("Felipina", 40, 1.72);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorAltura());;
        System.out.println(ordenacaoPessoa.ordenarPorIdade());;
    }
}
