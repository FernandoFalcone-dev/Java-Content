# Map Interface

---

Esta interface não é derivada da interface **Collection**. Ela é um objeto que mapeia valores para chaves, sendo que essas chaves não podem se repetir (funcionam como índices). 

### Características

- Faz parte do pacote `java.util`;
- É baseado no método *key-value*;
- Não aceita chaves duplicadas;
- Possui duas subinterfaces: **SortedMap** e **NavigableMap**;
- Possui três classes implementadoras: **HashMap**, **LinkedHashMap** e **TreeMap**;

### Classes implementadoras mais usadas

- HashMap:
    - A complexidade para os métodos básicos (get, put, containKey, remove) é de O(1);
    - Não mantém a ordem de inserção, é de forma randômica;
    - Permite chaves nulas;
    - Não é sincronizada. Utiliza do método `Collections.synchronizedMap` para garantir threads seguras;
    - As comparações são feitas através do `equals()` e `hashCode()`;  
***Map<K, V> hm = new HashMap<K, V>();***

- LinkedHashMap:
    - A complexidade para os métodos básicos (get, put, containKey, remove) é de O(1);
    - Mantém a ordem de inserção;
    - Permite chaves nulas;
    - Não é sincronizada. Utiliza do método `Collections.synchronizedMap` para garantir threads seguras;
    - As comparações são feitas através do `equals()` e `hashCode()`;
***Map<K, V> lhm = new LinkedHashMap<K, V>();***

- TreeMap:
    - Implementa as interfaces **SortedMap** e **NavigableMap**;
    - A complexidade para os métodos básicos (get, put, containKey, remove) é de O(log n);
    - Ordena de acordo com a ordem natural dos elementos ou pela regra ditada de um **Comparator**;
    - Não permite chaves nulas;
    - Não é sincronizada. Utiliza do método `Collections.synchronizedMap` para garantir threads seguras;
    - Um comparador precisa ser fornecido para fazer a comparação;
***Map<K, V> hm = new TreeMap<K, V>();***


**QUANDO USAR?**  
Quando queremos mapear elementos baseados no esquema *key-value* e queremos fazer as operações (pesquisa, atualização ou deleção) baseado em chaves.  

**Documentação:**  
- [Map Interface](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)
