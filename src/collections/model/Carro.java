package collections.model;

public class Carro implements Comparable<Carro> {
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
    public int compareTo(Carro carro) {
        
        return this.getMarca().compareToIgnoreCase(carro.getMarca());
    }
    
}
