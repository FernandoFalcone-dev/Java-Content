package operadores;

import java.util.Objects;

public class Operadores {
    public static void main(String[] args) {
        // Atribuição
        int numero = 3; //numero recebe o valor 3
        numero += 7;    //numero recebe 3+7. Ou seja, 10.
        numero -= 32;   //numero recebe o seu valor menos 32. Ou seja, -22.
        numero %= -3;   //numero recebe o resto da divisão entre seu valor e -3. Ou seja, -1.
        numero *= 6;    //numero recebe o seu valor vezes 6. Ou seja, -6.
        numero /= 2;    //numero recebe o seu valor dividido por 2. Ou seja, -3.

        // Aritméticos
        int numero1;
        numero1 = 5 + 10; //numero1 recebe a soma que dá 15
        numero1 = 8 - 4; //numero1 recebe a subtação que dá 4
        numero1 = 10 * 2; //numero1 recebe a multiplicação que dá 20
        numero1 = 50 / 5; //numero1 recebe a divisão que dá 10
        numero1 = 13 % 4; //numero1 recebe o resto da divisão que dá 1

        // Unários
        System.out.println("Unários:");
        int a = 2, b = 6;
        a = -a; //a recebe seu valor convertido para negativo que é -2
        System.out.println("!(a < b) = " + !(a < b)); //a expressão é invertida para false
        System.out.println("!(a > b) = " + !(a > b)); //a expressão é invertida para true
        System.out.println(b++); // b será incrementado em 1 mas seu valor só será modificado na próxima linha de código  
        System.out.println(b); // irá printar o valor de b que é 7
        System.out.println(++b); // b será incrementado em 1 e irá printar o valor 8 instantâneamente
        System.out.println(b--); // b será decrementado em 1 mas seu valor só será modificado na próxima linha de código
        System.out.println(b); // irá printar o valor de b que é 7
        System.out.println(--b); // b será decrementado em 1 e irá printar o valor 6 instantâneamente
        System.out.println("O complemento de " + a +" é " + ~a + "\n"); // irá printar o complemento de -2 (1111 1110) que é 1 (0000 0001)

        // Relacionais
        System.out.println("Relacionais:");
        int c = 5, d = 12, e = 8;
        String nome1 = "Fernando";
        String nome2 = "fernando";
        System.out.println("c == d -> " + (c == d)); // como não são iguais o resultado da expressão será false
        System.out.println("c != d -> " + (c != d)); // como são diferentes o resultado da expressão será true
        System.out.println("d > e -> " + (d > e)); // resultado será true
        System.out.println("c >= d -> " + (c >= d)); // resultado será false
        System.out.println("e < d -> " + (e < d)); // resultado será true
        System.out.println("e <= d -> " + (e <= d)); // resultado será true
        System.out.println("nome1 == nome2 -> " + (nome1 == nome2) + "\n"); // resultado será false, pois a inicial está maiúscula em um nome e minúscula no outro

        // Lógicos
        System.out.println("Lógicos:");
        int valor1 = 1;
        int valor2 = 2;
        if((valor1 == 1) && (valor2 == 2)) // As duas expressões são avaliadas para mosstrar o resultado
            System.out.println("valor1 é 1 AND valor2 é 2");
        if((valor1 == 1) || (valor2 == 1))
            System.out.println("valor1 é 1 OR valor2 é 1 \n"); // Só a primeira expressão já atende a condição

        // Ternário
        System.out.println("Ternário:");
        double salario = 1000; 
        double bonus = salario * (salario > 1000 ? 0.10 : 0.15); 
        System.out.println("O bônus será de " + bonus + "\n");

        // Equals vs ==
        System.out.println("Equals vs ==:");
        int i1 = 5;
        int i2 = 5;
        int i3 = 10;
        System.out.println("i1 == i2 -> " + (i1 == i2)); // resultado será true
        System.out.println("i2 == i3 -> " + (i2 == i3)); // resultado será false
        String s1 = new String("Recife");
        String s2 = new String("Recife");
        System.out.println("s1 == s2 -> " + (s1 == s2)); // resultado será false
        System.out.println("s1.equals(s2) -> " + s1.equals(s2) + "\n"); // resultado será true

        // Equals e hashCode
        System.out.println("Equals e hashCode:");
        Carro carro1 = new Carro("Honda", "Honda Civic", "MZU-6287");
        Carro carro2 = new Carro("Ford", "Ford Edge", "NAT-0987");
        Carro carro3 = new Carro("Honda", "Honda Civic", "MZU-6287");

        System.out.println("hashCode para o carro1 -> " + carro1.hashCode());
        System.out.println("hashCode para o carro2 -> " + carro2.hashCode());
        System.out.println("hashCode para o carro3 -> "  + carro3.hashCode());
        System.out.println("carro1.equals(carro2) -> " + carro1.equals(carro2));
        System.out.println("carro1.equals(carro3) -> " + carro1.equals(carro3)); // Antes de sobrescrever os métodos equals e hashCode, o resultado era false.
    }
}


class Carro {
    String marca;
    String modelo;
    String placa;

    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    } 


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Carro)) {
            return false;
        }
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, placa);
    }
    
    
}
