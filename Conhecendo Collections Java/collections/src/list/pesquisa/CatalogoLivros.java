package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosEncontrados.add(livro);
                }
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosEncontrados.add(livro);
                }
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = livro;
                    break;
                }
            }
        }
        return livroEncontrado;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("A bela e a fera", "Thomaz de Lima", 2000);
        catalogoLivros.adicionarLivro("Lobo mau", "Richard Lenz", 2008);

        System.out.println(catalogoLivros.pesquisarPorAutor("Thomaz de Lima"));;
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2007, 2008));
        System.out.println(catalogoLivros.pesquisarPorTitulo("A bela e a fera"));
    }
}
