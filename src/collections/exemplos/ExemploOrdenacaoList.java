package collections.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collections.comparators.ComparatorAno;
import collections.comparators.ComparatorCor;
import collections.comparators.ComparatorMarcaCorAno;
import collections.model.Carro;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>() {
            {
                add(new Carro("verde", "Ford", 1992));
                add(new Carro("amarelo", "Nissan", 2002));
                add(new Carro("preto", "Hyundai", 2010));
            }
        };
        System.out.println(carros + "\n");

        Collections.shuffle(carros);
        System.out.println("Embaralhando a lista... \n" + carros + "\n");

        System.out.println("Ordenando por Marcas...");
        Collections.sort(carros);
        System.out.println(carros + "\n");

        System.out.println("Ordenando por Cor...");
        Collections.sort(carros, new ComparatorCor());
        // carros.sort(new ComparatorCor());
        System.out.println(carros + "\n");

        System.out.println("Ordenando por Ano...");
        // carros.sort((first, second) -> first.getAno() - second.getAno()); outra forma
        // fazendo a comparação pela syntax lambda
        // System.out.println(carros);
        // carros.sort(Comparator.comparingInt(Carro::getAno));
        carros.sort(new ComparatorAno());
        System.out.println(carros + "\n");

        System.out.println("Ordenando por Marcas/Cor/Ano...");
        carros.sort(new ComparatorMarcaCorAno());
        System.out.println(carros + "\n");
    }
}
