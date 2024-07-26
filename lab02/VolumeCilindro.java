package lab02;
import java.util.Scanner;


public class VolumeCubo{
    public static void main(String[] args) {
       

        var sc = new Scanner( System.in);

        System.out.println("informe a altura");
        var raio = sc.nexint();

        System.out.println("informe o raio");
        var altura = sc.nexint();
        
        var pi = 3.14;

        var volume = pi * raio *  raio   *  altura;

        

        System.out.println ( "o volume para este cilindro é:" + volume);
    }
}