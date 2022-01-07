package collections.exemplos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import collections.comparators.ComparatorNomeLivro;
import collections.comparators.ComparatorPaginasLivro;
import collections.model.Livro;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> livros = new HashMap<>(){{
            put("Tolkien, J. R. R.", new Livro("O Senhor dos Anéis", 1200));
            put("Arthur Conan Doyle", new Livro("As Aventuras de Sherlock Holmes", 208));
            put("J. K. Rowling", new Livro("Harry Potter e o Cálice de Fogo", 636));
        }};
        for(Map.Entry<String, Livro> livro: livros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } System.out.println();

        System.out.println("--\tOrdem inserção\t--");
        Map<String, Livro> livros1 = new LinkedHashMap<>(){{
            put("Tolkien, J. R. R.", new Livro("O Senhor dos Anéis", 1200));
            put("Arthur Conan Doyle", new Livro("As Aventuras de Sherlock Holmes", 208));
            put("J. K. Rowling", new Livro("Harry Potter e o Cálice de Fogo", 636));
        }};
        for(Map.Entry<String, Livro> livro: livros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } System.out.println();

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> livros2 = new TreeMap<>(livros1);
        for (Map.Entry<String, Livro> livro: livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } System.out.println();

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNomeLivro());
        livros3.addAll(livros1.entrySet());
        for (Map.Entry<String, Livro> livro: livros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } System.out.println();

        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPaginasLivro());
        livros4.addAll(livros1.entrySet());
        for (Map.Entry<String,Livro> livro : livros4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
        } System.out.println();
    }
}
