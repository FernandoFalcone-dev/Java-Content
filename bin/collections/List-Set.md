# List Interface

---

### Características
- É uma das três interfaces que estendem **Collection**;
- É uma coleção ordenada, também conhecida como uma sequência;
- Há maior controle sobre onde cada elemento é inserido na lista;
- O usuário pode acessar os elementos pelo seu *Index*;
- Permite elementos duplicados `e1.equals(e2)`

### Classes mais usadas que a implementam
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
