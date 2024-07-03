package lab04;

import java.util.Arrays;
import java.util.List;

public class Repeticoes6 {
    // java lab04/Repeticoes6.java
    public static void main(String[] args) {
        /**
         * O método forEach é uma forma de aplicar uma ação (representada por um lambda
         * ou uma referência a um método) a cada elemento da lista. Ele utiliza o
         * conceito de programação funcional para executar uma operação em cada elemento
         * da coleção sem a necessidade de um loop explícito.
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        numeros.forEach(item -> System.out.println(item));

    }
}
