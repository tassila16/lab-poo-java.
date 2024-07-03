package lab02;

import java.util.Scanner;

public class Entrada4 {
    // Execute no Terminal
    // java 03-entrada-usuario/Entrada1.java 
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        var numero = sc.nextInt();

        System.out.println("Digite uma palavra:");
        var palavra = sc.next();

        System.out.println("Digite um número decimal (3.1415):");
        var numeroDecimal = sc.nextDouble();

        System.out.println("O número digitado foi: " + numero);

        System.out.println("A palavra digitada foi: " + palavra);

        System.out.println("O número decimal digitado foi: " + numeroDecimal);

        sc.close();
    }
}
