package lab04;

import java.util.Arrays;
import java.util.List;

public class Repeticoes6 {
    // java lab04/Repeticoes6.java
    public static void main(String[] args) {
        /**
         * break: O comando break é usado para sair imediatamente do loop,
         * independentemente de a condição do loop ainda ser verdadeira ou não. Ele é
         * usado para interromper a execução do loop antes que a condição normal de
         * término seja alcançada.
         */
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i == 3) {
                break; // Interrompe o loop quando i alcança o valor 3
            }
        }

    }
}
