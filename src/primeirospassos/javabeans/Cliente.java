package primeirospassos.javabeans;

import java.io.Serializable;

//Implementando o serializable
public class Cliente implements Serializable {

    private String nome;
    private String email;  

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    /*construtor atribui vazio aos atributos
    para que não sejam mostrados valores nulos na página */
    public Cliente() {
        this.nome = "";
        this.email = "";
    }
    
}