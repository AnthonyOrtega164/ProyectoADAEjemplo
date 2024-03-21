package figurasGeometricas.Excepciones;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
//            System.out.println("Se ha capturado una NullPointerException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
