package collections.exemplos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 6.75, 3.5, 7.0, 9.0, 0.0));

        System.out.println(notas + "\n"); // note que não há repetição

        // Importante lembrar que nesse tipo de estrutura não se trabalha com índices
        // INSERÇÃO E PESQUISA
        System.out.println("A nota 3.5 está no conjunto? " + notas.contains(3.5) + "\n");

        System.out.println("A menor nota é " + Collections.min(notas) + "\n"); // Utiliza da classe Collections

        System.out.println("A maior nota é " + Collections.max(notas) + "\n"); // Utiliza da classe Collections

        // OPERAÇÕES E ITERAÇÕES
        System.out.println("Soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma + "\n");

        System.out.println("A média das notas é " + soma / notas.size() + "\n");

        // REMOÇÃO
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores do que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();           
            
        }
        System.out.println(notas + "\n");

        System.out.println("Apagar todo o conjunto: ");
        notas.clear();
        System.out.println(notas + "\n");

        System.out.println("O conjunto está vazio: " + notas.isEmpty() + "\n");


    }

}
