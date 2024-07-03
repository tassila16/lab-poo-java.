package lab04;

import java.util.Scanner;

public class Repeticoes3 {
    // java lab04/Repeticoes3.java
    public static void main(String[] args) {

        /**
         * 
         * do-while: Similar ao while, mas verifica a condição após a execução do bloco
         * de código, garantindo que o bloco seja executado pelo menos uma vez, mesmo se
         * a condição for inicialmente falsa.
         */

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }
}
