import figurasGeometricas.modelos.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura;
        figura = new Circulo(5);
        System.out.println(figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());

        figura = new Cuadrado(5);
        System.out.println(figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());

        figura = new Rectangulo(5, 2);
        System.out.println(figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());

        figura = new Triangulo(5, 2);
        System.out.println(figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());

        figura = new Cubo(5);
        System.out.println(figura.getClass());
        System.out.println("Area: " + figura.getArea());
        System.out.println("Perimetro: " + figura.getPerimetro());

        try {
            int division = 10 / 0;
            System.out.println("El resultado de la división es: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        } finally {
            System.out.println("Bloque finally ejecutado.");
            System.out.println("El programa continúa después del bloque try-catch.");
        }
    }
}