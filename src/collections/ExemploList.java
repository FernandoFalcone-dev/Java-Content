package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class ExemploList {
    public static void main(String[] args) {
        //List<Double> notas = new ArrayList<>(); forma mais comum de instanciar
        List<Double> notas = new ArrayList<>(Arrays.asList(8.5, 6d, 8.75, 5.5)); // forma de inicializar já com alguns elementos

        // INSERÇÃO E PESQUISA
        notas.add(9.0); // adiciona um elemento específico
        notas.add(4, 7.5); // adiciona um elemento dentro do index determinado
        System.out.println(notas + "\n");

        Integer indiceNota = notas.indexOf(7.5); // se o elemento não estiver na lista, retorna -1
        System.out.println("A primeira nota com valor 7.5 está no índice " + indiceNota + "\n");

        notas.set(4, 10d);
        System.out.println("A nota do índice 4 será substituída por " + notas.get(4) + "\n");

        System.out.println("Existe nota de valor 6.0 na lista? " + notas.contains(6.0) + "\n"); 

        System.out.println("A menor nota é " + Collections.min(notas) + "\n");

        System.out.println("A maior nota é " + Collections.max(notas) + "\n");

        // OPERAÇÕES & ITERAÇÕES
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma das notas é: " + soma + "\n");

        System.out.println("A média das " + notas.size() + " notas é igual " + (soma/notas.size()) + "\n");

        // REMOÇÃO
        notas.remove(6d); // remove a nota de valor 6
        notas.remove(0); // remove a nota de índice 0
        System.out.println(notas + "\n");

        notas.clear(); // limpra toda a lista

        System.out.println(notas + "\n");

        // CHECAGEM
        System.out.println("A lista está vazia? " + notas.isEmpty());

        // ORDENAÇÃO
        List<Carro> carros = new ArrayList<>(){{
            add(new Carro("verde", "Ford", 1992));
            add(new Carro("amarelo", "Nissan", 2002));
            add(new Carro("preto", "Hyundai", 2010));
        }};
        System.out.println(carros + "\n");

        Collections.shuffle(carros);
        System.out.println("Embaralhando a lista... \n" + carros + "\n");

        System.out.println("Ordenando por Marcas...");
        Collections.sort(carros);
        System.out.println(carros + "\n");

        System.out.println("Ordenando por Cor...");
        Collections.sort(carros, new ComparatorCor());
        //carros.sort(new ComparatorCor());
        System.out.println(carros + "\n");
        
        System.out.println("Ordenando por Ano...");
        // carros.sort((first, second) -> first.getAno() - second.getAno()); outra forma fazendo a comparação pela syntax lambda
        // System.out.println(carros);
        //carros.sort(Comparator.comparingInt(Carro::getAno));
        carros.sort(new ComparatorAno());
        System.out.println(carros + "\n");
        
        System.out.println("Ordenando por Marcas/Cor/Ano...");
        carros.sort(new ComparatorMarcaCorAno());
        System.out.println(carros + "\n");
        
    }
}

class Carro implements Comparable<Carro>{
    private String cor;
    private String marca;
    private Integer ano;


    public Carro(String cor, String marca, Integer ano) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
    }


    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return "{" +
            " cor='" + getCor() + "'" +
            ", marca='" + getMarca() + "'" +
            ", ano='" + getAno() + "'" +
            "}";
    }

    @Override
    public int compareTo(Carro carro) {
        
        return this.getMarca().compareToIgnoreCase(carro.getMarca());
    }
    
}

class ComparatorCor implements Comparator<Carro> {
    @Override
    public int compare(Carro c1, Carro c2) {
       
        return c1.getCor().compareToIgnoreCase(c2.getCor());
    }
}

class ComparatorAno implements Comparator<Carro> {
    @Override
    public int compare(Carro c1, Carro c2) {
        return c1.getAno().compareTo(c2.getAno());
    }
}

class ComparatorMarcaCorAno implements Comparator<Carro> {

    @Override
    public int compare(Carro c1, Carro c2) {
        int marca = c1.getMarca().compareToIgnoreCase(c2.getMarca());
        if (marca != 0) return marca;

        int cor = c1.getCor().compareToIgnoreCase(c2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(c1.getAno(), c2.getAno());
    }

}