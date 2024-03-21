package figurasGeometricas.Excepciones;

import java.io.IOException;
import java.net.*;

public class MalformedURLCheckedException {
    public static void main(String[] args) {
        try {
            URL url = new URL("htp://www.google.com");
            URLConnection connection = url.openConnection();
        } catch (MalformedURLException e) {
            System.out.println("URL mal formada: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al abrir la conexión: " + e.getMessage());
        }
    }

}
