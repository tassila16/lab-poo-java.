package lab04;

import java.util.Arrays;
import java.util.List;

public class Repeticoes5 {
    // java lab04/Repeticoes5.java
    public static void main(String[] args) {
        /**
         * for-each (enhanced for loop): Usado para iterar sobre elementos em uma
         * coleção ou array. É eficaz quando você deseja iterar sobre todos os elementos
         * sem se preocupar com o índice ou a contagem de elementos.
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        for (var num : numeros) {
            System.out.println(num);
        }

    }
}
