package collections.comparators;

import java.util.Comparator;

import collections.model.Serie;

public class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    }
    
}
