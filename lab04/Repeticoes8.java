package lab04;

import java.util.Arrays;
import java.util.List;

public class Repeticoes6 {
    // java lab04/Repeticoes8.java
    public static void main(String[] args) {
        /**
         * continue: O comando continue é usado para pular para a próxima iteração do
         * loop sem executar o restante do código dentro do bloco de repetição na
         * iteração atual. Em outras palavras, ele permite que você ignore o código
         * restante dentro do loop para aquela iteração específica e vá para a próxima
         * iteração.
         * 
         */
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                continue; // Salta para a próxima iteração sem imprimir os número pares
            }
            System.out.println(i);
        }

    }
}
