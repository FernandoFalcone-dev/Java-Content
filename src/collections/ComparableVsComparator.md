# Comparable Interface vs Comparator Interface

---

Vale ressaltar num primeiro momento, que ambas são interfaces e podem ser usadas para ordenar coleções. E essa é uma das grandes utilidades delas.

### Comparable<T>

https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html

Tendo uma classe implementando esta interface, isso impõe que os objetos instanciados a partir dessa classe, sejam ordenados através de uma regra. Essa regra está contida no método `compareTo`, método que pode ser sobrescrito de acordo com a necessidade.

```java
class Carro implements Comparable<Carro>{ // implementação da interface que irá pedir a implementação do método compareTo()

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
    public int compareTo(Carro carro) { // sobrescrevendo o método compareTo()

        return this.getMarca().compareToIgnoreCase(carro.getMarca()); // a regra determina que a comparação deve ser feita pela marca do carro
    }
}
```

**_IMPORTANTE_**
O compareTo() sempre irá retornar um inteiro. A comparação é feita dentro da regra estabelecida e se:

- A marca do carro atual (this) vir primeiro que a marca do carro passado por parâmetro, irá retornar -1 (ou qualquer int negativo, indicando que this deve vir “antes” do outro carro);
- A marca do (this) vir depois da marca do outro carro, irá retornar 1 (ou qualquer outro positivo);
- Forem iguais, retorna 0.

**Ordenação**
Tendo tudo isso sendo feito, só nos resta utilizar o `Collections.sort(carros)`.
Caso seja necessário mudar a regra e ordenarmos através de outro elemento, como Ano, podemos alterar direto no método compareTo() (o que não se recomenda), ou utilizar ta interface **Comparator**.

### Comparator<T>

https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html

Esta interface geralmente é utilizada de forma isolada da classe de domínio e quando implementada por uma classe, utiliza-se de métodos para fazer a compração.

```java
class ComparatorCor implements Comparator<Carro> { // implementa a interface
    @Override
    public int compare(Carro c1, Carro c2) { // sobrescreve o método compare() que recebe os dois objetos que serão comparados

        return c1.getCor().compareToIgnoreCase(c2.getCor());// retorna um inteiro para fazer a comparação assim como o compareTo()
    }
}
```

**ORDENAÇÃO**
Tendo isso feito, o próximo passo agora é utilizar da classe utilitária Collections e um segundo método sort() que pega uma _List_ e um _Comparator_ específico. Então esse método invoca o _compare()_ para ordenar os objetos.

**RESUMO DA UTILIZAÇÃO**

1. Crie uma classe que implemente Comparator (e, portanto, o método compare() que faz o trabalho feito anteriormente pelo compareTo());
2. Faça uma instância da classe Comparator;
3. Chame o método sort() sobrecarregando-o, fornecendo a ele a lista e a instância da classe que implementa Comparator.

```java
ComparatorCor comparator = new ComparatorCor();
Collections.sort(carros, comparator);
```

**OU** podemos utilizar o método sort() da prória interface List, caso a usemos.

```java
carros.sort(new ComparatorCor());
```

**_IMPORTANTE_**
Os Comparators também podem ser usados para controlar a ordem de certas estruturas de dados (como sorted sets ou sorted maps) ou para fornecer uma ordem para coleções de objetos que não têm uma ordem natural.

### Diferença entre as Interfaces

| **Comparable**                                                                                                                                           | **Comparator**                                                                                                                                          |
|----------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1. Fornece uma única sequência de classificação. Em outras palavaras, podemos classificar a coleção com base em um único elemento, como id, nome, preço  | Fornece várias sequências de classificação. Em outras palavaras, podemos classificar a coleção com base em vários elementos, como id, nome, preço, etc. |
| 2. Afeta a classe de domínio                                                                                                                             | Não afeta a classe de domínio, pois é implementada por uma classe secundária.                                                                           |
| 3. Fornece o método **compareTo()** para ordenar os elementos                                                                                            | Fornece o método **compare()** para sortear os elementos                                                                                                |
| 4. Está presente no pacote **java.lang**                                                                                                                 | Está presente no pacote **java.util**                                                                                                                   |
| 5. Pode-se ordenar a lista de elementos pelo  **Collections.sort(List)** método.                                                                         | Pode-se ordenar elementos pelo  **Collections(List, Comparator)** método.                                                                               |