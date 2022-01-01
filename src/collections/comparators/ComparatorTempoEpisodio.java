package collections.comparators;

import java.util.Comparator;

import collections.model.Serie;

public class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return s1.getNome().compareToIgnoreCase(s2.getNome()); // Este é o critério de desempate caso os tempos sejam iguais
    }
    
}
