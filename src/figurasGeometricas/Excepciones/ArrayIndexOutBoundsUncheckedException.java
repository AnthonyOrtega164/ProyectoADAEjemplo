package figurasGeometricas.Excepciones;

public class ArrayIndexOutBoundsUncheckedException {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha capturado una ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
