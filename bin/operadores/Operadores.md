# Operadores

---

São símbolos que representam atribuições, cálculos e ordem de dados. 
As operações seguem uma ordem de prioridades, ou seja, alguns cálculos são processados antes de outros.

### Tipos
- Unário: quando opera apenas em um elemento;
- Binário: quando opera em dois elementos de uma expressão
- Ternário: é um recurso para tomada de decisões com objetivo similar ao do if/else, mas que é codificado em apenas uma linha.

```java
int x = 5, y = 10, z = 2;
x--;                   // -- é um operador unário pois opera apenas em x;
z = x * y;             // * é um operador binário pois opera em x e y.
z = z < 0 ? x : y;     // ?: é O operador ternário. Opera em na expressão booleana (z < 0), e em x ou y.
```

### Operadores de atribuição
Os operadores de atribuição são utilizados para definir o valor inicial ou sobrescrever o valor de uma variável.
**Opções**: =, +=, -=, *=, /=, %=

### Operadores aritméticos
Os operadores aritméticos realizam as operações fundamentais da matemática entre duas variáveis e retornam o resultado.
**Opções**: + (soma), - (subtração), * (multiplicação), / (divisão), % (módulo ou resto da divisão)

### Operadores unários
São os tipos de operadores que precisam de apenas um operador para executar qualquer operação tipo incremento, decremento, negação, etc;
* menos(-): pode ser usado para converter um valor negativo em um valor positivo;
* 'NOT'(!): é usado para converter *true* para *false* ou vice-versa;
* incremento(++): é usado para incrementar o valor de um inteiro. Ele pode vir antes (++num) ou depois (num++) da variável. Se vir antes o incremento acontece instantâneamente. Se vir depois o incremento acontece, mas o valor anterior é retido até a execução da próxima instrução;
* decremento(--): usado da mesma forma que o incremento, sendo que feito para decrementar;
* Complemento bit a bit(~): Este operador unário retorna a representação de complemento de um do valor de entrada ou operando, ou seja, com todos os bits invertidos, o que significa que faz a cada 0 a 1 e a cada 1 a 0;

### Operadores relacionais
Esses operadores avaliam dois operandos e definem se um é maior, menor, maior ou igual, menor ou igual, igual ou diferente do outro.
**Opções**: == (igual), != (diferente), > (maior que), >= (maior ou igual), < (menor que), <= (menor ou igual)

*DICAS*: 
1. recomendados para usar quando os tipos de dados são numéricos, ">" "<" ">=" "<=", não são utilizados para booleans e Strings.
2. No caso do tipo char, pode ser usado, pois no seu mais baixo nível o char é um código.

### Operadores lógicos
Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões. O `&&` e `||` operadores realizam operações condicional-AND e condicional-OR em duas expressões booleanas. ***"Esses operadores exibem comportamento de "curto-circuito", o que significa que o segundo operando é avaliado apenas se necessário"***.

*DICA*:
1. Sempre reduzir expressões longas para favorecer a legibilidade do código

### Operadores ternários
Pode ser pensado como uma simplificação de uma declaração `if-then-else`. A representação é feita através do `?:` e pode ser lido como *Se `condição` for true, então o `valor1` é o resultado. Se não, será o `valor2`*

*DICAS*:
1. A utilização deste operador é muito indicada no sentido de simplificar o código e deixar mais legível
2. Normalmente é utilizado quando precisamos de uma estrutura de decisão simples

### Equals e hashcode
São dois métodos públicos muito importantes de Java.lang.object. Ou seja, eles estão definidos implicitamente em toda classe Java.
* Método equals() é usado para comparar a igualdade de dois Objetos.

*IMPORTANTE*: 
1. É necessário gerar os métodos sobrescrevendo-os sempre que quisermos que haja diferenciação de objetos
2. Observe que geralmente é necessário substituir o método hashCode sempre que esse método for substituído, de modo a manter o contrato geral para o método hashCode, que afirma que objetos iguais devem ter códigos hash iguais.

* Método hashcode() retorna um valor inteiro de código hash para o objeto. O valor do Hashcode é usado principalmente em coleções baseadas em hash, como HashMap, HashSet, HashTable... 

*IMPORTANTE*:
1. Sempre que chamado numa aplicação para o mesmo objeto, o método deve retornar o mesmo hashCode (valor inteiro)
2. Se, de acordo com o método equals(), dois objetos são iguais, ambos terão o mesmo valor de hashCode
3. Quando produzido resultados inteiros distintos para objetos desiguais, existe a possibilidade de melhorar o desempenho das tabelas hash.


### Equals x "=="
* Usa-se == geralmente para tipos primitivos e no caso de objetos apenas para verificar se aquelas 2 variaveis de objetos apontam para o mesmo. Em outras palavras, é usado para comparar referências.
* No caso do equals é usado para verificar a “equivalencia” de objetos. Em outras palavras, o conteúdo do objeto que é comparado.

### Precedência
Assim como para toda expressão matemática, também existe uma ordem de precedência para as expressões dentro da programação. São como regras que garantem o mesmo resultado final para qualquer que tentem execultá-las. O link abaixo leva para uma documentação junto à um quadro indicando essa ordem.

*Indicação*: <https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html>