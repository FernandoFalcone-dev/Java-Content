

## Classe

É o modelo ou esquema a partir do qual os objetos são criados. Classes contém características (**atributos**) e funcionalidades (**métodos**) para fornecer aos objetos.

Anatomia de uma Classe:
```java
public class Aluno {
    // Atributos

    // Métodos()
    
}
```

* *public*- refere-se ao modificador de acesso, o que indica a visibilidade desta classe;
* *class*- é uma palavra reservada para indicar que é uma classe;
* *Aluno*- é o nome que determinamos para a classe e sempre é iniciado com letra maiúscula
* Dentro das chaves vamos inserir os atributos e os métodos

## Objeto

É uma instância de uma classe. O objeto seria a classe materializada.

```java
Aluno aluno = new Aluno();
```

* *Aluno*- é o nome da classe que referenciamos para tipar o objeto
* *aluno*- nome do objeto e sempre é iniciado com letra minúscula e segue o padrão CamelCase
* *new*- palavra reservada que cria uma instancia de um tipo de objeto