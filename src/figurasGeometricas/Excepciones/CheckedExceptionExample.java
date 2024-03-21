package figurasGeometricas.Excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("archivo_inexistente.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
