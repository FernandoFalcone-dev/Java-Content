package collections.comparators;

import java.util.Comparator;

import collections.model.Carro;

public class ComparatorAno implements Comparator<Carro> {
    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getAno().compareTo(c2.getAno());
    }
}