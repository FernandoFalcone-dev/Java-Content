package collections.comparators;

import java.util.Comparator;

import collections.model.Carro;

public class ComparatorCor implements Comparator<Carro> {
    @Override
    public int compare(Carro c1, Carro c2) {
       
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}
