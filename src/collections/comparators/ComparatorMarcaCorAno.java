package collections.comparators;

import java.util.Comparator;

import collections.model.Carro;

public class ComparatorMarcaCorAno implements Comparator<Carro> {

    @Override
    public int compare(Carro c1, Carro c2) {
        int marca = c1.getMarca().compareToIgnoreCase(c2.getMarca());
        if (marca != 0) return marca;

        int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(c1.getAno(), c2.getAno());
    }

}
