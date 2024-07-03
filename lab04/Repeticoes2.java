package lab04;
import java.util.Scanner;
public class Repeticoes2 {
    // java lab04/Repeticoes2.java
    public static void main(String[] args) {

        /**
         * while
         * Executa um bloco de código enquanto uma condição específica for verdadeira.
         */

        var sc = new Scanner(System.in);
        var nota = 0;
        var somaDeNotas = 0;
        while (nota != -1) {
            somaDeNotas += nota;
            System.out.println("Digite a nota (-1 para sair):");
            nota = sc.nextInt();
        }
        sc.close();
        System.out.println("A soma de notas foi: " + somaDeNotas);

    }   
}
