public class VolumeParalelepipedo{
    public static void main(String[] args) {
        var lado = Float.parseFloat( args[0]);
        var altura = Float.parseFloat( args[1]);
        var volume =  lado * lado * altura /3;

        System.out.println ( "o volume para este paralelepipedo  é:" + volume);
    }
}