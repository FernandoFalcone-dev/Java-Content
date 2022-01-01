# List Interface

---

### Características

- Estende a interface **Collection**
- É uma coleção ordenada, também conhecida como uma sequência;
- Há maior controle sobre onde cada elemento é inserido na lista;
- O usuário pode acessar os elementos pelo seu *Index*;
- Aceita elementos nulos;
- Preserva a ordem de inserção dos elementos;
- Permite elementos duplicados `e1.equals(e2)`;

### Classes implementadoras mais usadas

- ArrayList:
    - Incrementa 50% do tamanho do array atual se o número de elementos exceder de sua capacidade.
    - Não é uma classe legada, foi apresentada no JDK 1.2
    - Fornece métodos para manipular o tamanho do array que é usado internamente para armazenar a lista
    - Não é sincronizada
    - Melhor para armazenar e acessar dados
***List<Integer> arrayList = new ArrayList<Integer>(n);***

- LinkedList:
    - Usa internamente uma lista duplamente vinculada para armazenar os elementos
    - Pode atuar tanto como uma lista quanto como uma fila por implementar **List** e **Deque**
    - É melhor para manipulação de dados
***List<Integer> linkedList = new LinkedList<Integer>();***

- Vector:
    - Incrementa 100% do tamanho do array se o número total de elementos exceder sua capacidade.
    - É uma classe legada 
    - É sincronizada, o que é ideal para um ambiente multithreading
    - Pode usar da interface **Iterator** ou **Enumeration** para percorrer os elementos
***List<Integer> vector = new Vector<Integer>(n);***  

**QUANDO USAR?**
Se precisarmos acessar os elementos frequentemente por seu **id** 

# Set Interface

---

### Características

- Estende a interface **Collection**;
- Possui duas subinterfaces `NavigableSet<E>` e `SortedSet<E>`
- Não contém elementos duplicados;
- Só aceita um elemento nulo, dependendo da implementação;
- Velocidade na pesquisa de dados, sendo mais rápida que um objeto do tipo List;
- A inserção de dados é mais lenta;

### Classes implementadoras mais usadas

- HashSet
    - Utiliza internamente de HashMap (trabalha com o conceito de key-value pairs);
    - Não mantém a ordem dos de inserção dos elementos;
    - Tem uma melhor perfomance, complexidade O(1). Ou seja, adicionar, remover, retirar terão o mesmo tempo de execução;
    - Não é sincronizada (**Atenção para o acesso de threads múltiplas**);
    - Compara elementos através do `equals()` e `hashCode()`;
    - A capacidade é 16 por padrão e é incrementada em 75%, caso ultrapasse sua capacidade;
***Set<String> hash_Set = new HashSet<String>();***

- LinkedHashSet
    - Estende a classe **HashSet**;
    - Faz uso do HashTable com linked list (mantém uma lista duplamente ligada em todas as suas entradas);
    - Mantém a ordem de inserção dos elementos;
    - Tem um performance mediana, com complexidade O(1) para as operações básicas;
    - Compara elementos através do `equals()` e `hashCode()`;
    - Não é sincronizada;

- Treeset
    - Implementa as interfaces **NavigableSet<E>** **SortedSet<E>**
    - Usa *TreeSet* internamente para armazenar elementos;
    - É ordenada de acordo com a ordem natural dos elementos, se nenhum *Comparator* for fornecido;
    - Tem uma perfomance mais custosa, complexidade O(log n);
    - Compara elementos através do `compare()` e `compareTo()`;

**QUANDO USAR?**  
Quando queremos criar uma coleção de elementos únicos e garantir uma melhor performance.