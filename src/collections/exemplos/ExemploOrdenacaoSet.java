package collections.exemplos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import collections.comparators.ComparatorGenero;
import collections.comparators.ComparatorNomeGeneroTempoEpisodio;
import collections.comparators.ComparatorTempoEpisodio;
import collections.model.Serie;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        // ORDENAÇÃO
        System.out.println("Exiba notas na ordem de inserção: ");
        // LinkedHashSet garante a ordem de inserção
        Set<Double> notas1 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 6.75, 3.5, 7.0, 9.0, 0.0));
        System.out.println(notas1 + "\n");

        System.out.println("Exiba as notas na ordem crescente: ");
        // TreeSet ordena na forma natural do tipo de dado
        Set<Double> notas2 = new TreeSet<>(Arrays.asList(7d, 8.5, 6.75, 3.5, 7.0, 9.0, 0.0));
        System.out.println(notas2 + "\n");

        System.out.println("Exemplo com Strings: ");
        Set<String> nomes = new TreeSet<>();
        nomes.add("Fernando");
        nomes.add("Gustavo");
        nomes.add("Beatriz");
        nomes.add("Cecilia");
        nomes.add("Carlos");
        System.out.println(nomes + "\n");

        System.out.println("---------------------------------------\n");
        Set<Serie> series = new HashSet<>() {
            {
                add(new Serie("GOT", "Fantasia", 60));
                add(new Serie("Supernatural", "Terror", 50));
                add(new Serie("Blindspot", "Ação", 45));
            }
        };

        System.out.println("---\tOrdem aleatória\t---");
        System.out.println(series + "\n");

        System.out.println("---\tOrdem Inserção\t---");
        Set<Serie> series1 = new LinkedHashSet<>() {
            {
                add(new Serie("GOT", "Fantasia", 60));
                add(new Serie("Supernatural", "Terror", 50));
                add(new Serie("Blindspot", "Ação", 45));
            }
        };
        System.out.println(series1 + "\n");

        System.out.println("---\tOrdem natural (Nome)\t---");
        Set<Serie> series2 = new TreeSet<>(); // É necessário implementar a interface Comparable
        series2.addAll(series);
        System.out.println(series2 + "\n");

        System.out.println("---\tOrdem Nome/Gênero/Tempo de Episodio\t---");
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()); // Inserir a instancia do comparator que queremos utilizar no construtor
        series3.addAll(series);
        System.out.println(series3 + "\n");

        System.out.println("---\tOrdem Gênero\t---");
        Set<Serie> series4 = new TreeSet<>(new ComparatorGenero());
        series4.addAll(series);
        System.out.println(series4 + "\n");

        System.out.println("---\tOrdem Tempo de Episodio\t---");
        Set<Serie> series5 = new TreeSet<>(new ComparatorTempoEpisodio());
        series5.addAll(series);
        System.out.println(series5 + "\n");

    }
}
