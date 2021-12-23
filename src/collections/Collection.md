# Collection Interface

---

Tida como uma das interfaces raízes do framework Collections, ela fornece muitos dos métodos que acabam por padronizar o uso desses através das interfaces que a implementam. Além disso, **Collection** interface também implementa a interface **Iterable<E>**, que permite que as outras interfaces (List, Set, Queue) possam ser iteradas de forma prática.
Collection interface não é diretamente implementada por nenhuma classe. Entretanto, é implementada indiretamente pelos subtipos ou subinterfaces, assim como List, Queue e Set.

*Documentação*:
https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

***Importante***: 
Não devemos confundir **Collection Interface** com **Class Collections**. Esta segunda é uma classe membra do Java Collections Framework e é basicamente usada com métodos estáticos que operam em cima de coleções ou no retorno delas.

*Documentação*:
https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
