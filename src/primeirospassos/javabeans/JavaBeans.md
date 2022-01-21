# JavaBeans 


### Conceito  

> Segundo a especificação da Sun Microsystems os JavaBeans são *"componentes reutilizáveis de software que podem ser manipulados visualmente com a ajuda de uma ferramenta de desenvolvimento".*  
> Um bean também pode ser definido como uma classe Java que expõe propriedades, seguindo uma convenção de nomenclatura simples para os métodos getter e setter. Praticamente são classes escritas de acordo com uma convenção em particular.

![JavaBeans](http://www.unicodesystems.us/img/core-img/javabeans1.png)  
Fonte: unicodesystems  

### Convenções

- Possuem contrutores sem argumentos;  
- Implementam a interface `java.io.Serializable` (que possibilita a persistência e restauração do estado do objeto da classe);  
- Definem métodos get/set para acesso às suas propriedades (tem como premissa a idéia de encapsulamento);  
- São thread-safe.

### Propriedades  

O padrão JavaBeans prevê quatro tipos de propriedades: simples (valor único), indexadas, bound (vinculadas) e constrained (restritas).

- **Propriedade simples**: representam tipos de dados simples. Podem ser nativos ou não e os métodos devem se chamar `get<NomePropriedade>` e `set<NomePropriedade>`.  

- **Propriedades indexadas**: contem um array de valores possíveis. Os métododos getter e setter seguem o mesmo padrão, só que manipulam um array.  
    - Exs:  
    ```java
    public String[] getEstados()
    public String getEstados(int índice)
    public void setEstados(String[] estados)
    public void setEstados(int índice, String estado)
    ```  

- **Propriedades vinculadas**: permitem que objetos sejam avisados quando for alterado o valor da propriedade em questão. Uma mudança de valor gera um evento `PropertyChangeEvent` e Listeners deste evento (implementam `PropertyChangeListener`) serão notificados da mudança.  

- **Propriedades Restritas**: são como as bound, só que permitem que a alteração seja vetada antes de ocorrer.  

### Eventos

A interação entre JavaBeans é feita através de um modelo de eventos (event model) conhecido como modelo de delegação (delegation model). Esse modelo segue o pattern Observer: um objeto (denominado source) é responsável por criar o evento e dispará-lo. Os objetos interessados em receber notificações sobre a ocorrência do evento (listeners) se inscrevem e são avisados sempre que um evento ocorre, podendo agir sobre ele.  

### Documentação oficial

- [JavaBeand Component API](https://docs.oracle.com/javase/8/docs/technotes/guides/beans/index.html)
