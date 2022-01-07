package collections.exemplos;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        // INSERÇÃO e BUSCA
        Map<String, Integer> timesBrasileiros = new HashMap<>(){{
            put("FLA", 71); // Método que adiciona uma entry key-value
            put("SAN", 50);
            put("PAL", 66);
            put("SPT", 38);
            put("GRE", 43);
        }};

        System.out.println("TIMES RELACIONADOS: " + timesBrasileiros + "\n"); // Imprime de forma aleatória

        System.out.println("Substitua os pontos do Sport por 40: ");
        timesBrasileiros.put("SPT", 40); // Como a chave já existe, o valor será modificado
        System.out.println("Sport - " + timesBrasileiros.get("SPT") + "\n");

        System.out.println("Confira se o time de abreviação FLU está no dicionário: " + timesBrasileiros.containsKey("FLU") + "\n");

        System.out.println("Exiba os pontos do Grêmio: " + timesBrasileiros.get("GRE") + "\n");

        System.out.println("Exiba as abreviações dos times: " + timesBrasileiros.keySet() + "\n"); // Este método retorna um SET

        System.out.println("Exiba os pontos dos times: " + timesBrasileiros.values() + "\n");// Este método retorna uma Collection

        // OPERAÇÕES e ITERAÇÕES
        System.out.println("Exiba o time com mais pontos: ");
        Integer maiorPontuação = Collections.max(timesBrasileiros.values());
        Set<Map.Entry<String, Integer>> entries = timesBrasileiros.entrySet();
        String timeMaisPontuador = "";

        for (Map.Entry<String,Integer> entry : entries) {
            if (entry.getValue().equals(maiorPontuação)) {
                timeMaisPontuador = entry.getKey();
                System.out.println(timeMaisPontuador + " - " + maiorPontuação);
            }
        }

        System.out.println("Exiba o time com menos pontos: ");
        Integer menorPontuação = Collections.min(timesBrasileiros.values());
        String timeMenosPontuador = "";

        for (Map.Entry<String,Integer> entry : timesBrasileiros.entrySet()) {
            if (entry.getValue().equals(menorPontuação)) {
                timeMenosPontuador = entry.getKey();
                System.out.println(timeMenosPontuador + " - " + menorPontuação + "\n");
            }
        }

        Iterator<Integer> iterator = timesBrasileiros.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos pontos: " + soma + "\n");

        System.out.println("Exiba a média dos pontos: " + (soma / timesBrasileiros.size()) + "\n");

        // REMOÇÃO
        System.out.println("Remova os times com pontuação igual a 43: ");
        Iterator<Integer> iterator1 = timesBrasileiros.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(43)) {
                iterator1.remove();
            }
        }
        System.out.println(timesBrasileiros + "\n");
        
        // Mantem a ordem de inserção
        System.out.println("Exiba os times na ordem que foram informados: ");
        Map<String, Integer> timesBrasileiros1 = new LinkedHashMap<>(){{
            put("FLA", 71);
            put("SAN", 50);
            put("PAL", 66);
            put("SPT", 38);
            put("GRE", 43);
        }};
        System.out.println(timesBrasileiros1 + "\n");

        //Ordena pela ordem natural
        System.out.println("Exiba os times ordenados pela abreviação: ");
        Map<String, Integer> timesBrasileiros2 = new TreeMap<>(timesBrasileiros1);
        System.out.println(timesBrasileiros2 + "\n");

        System.out.println("Apague todos os times: ");
        timesBrasileiros.clear();

        System.out.println("Os times foram todos apagados? " + timesBrasileiros.isEmpty());

    }
}
