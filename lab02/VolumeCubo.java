public class VolumeCubo{
    public static void main(String[] args) {
        var lado = Float.parseFloat( args[0]);
        var volume = Math.pow(lado, 3);

        System.out.println ( "o volume para este cubo é:" + volume);
    }
}