import java.util.Scanner;

public class NotaConceito2{

    public static void main (String[] args){
        var sc = new Scanner(System.in);
        System.out.println("Digite o conceito :");
        var conceito = sc.next(); 
        switch (conceito){
            case "A" -> System.out.println("Nota 100");
            case "B" -> System.out.println("Nota 90");
            case "C" -> System.out.println("Nota 80");
            default -> System.out.println( "Conceito Invalido");
            
        }
    }
}