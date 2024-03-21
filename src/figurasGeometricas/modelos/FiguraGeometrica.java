package figurasGeometricas.modelos;

public abstract class FiguraGeometrica {
    protected double valor1;

    public FiguraGeometrica(double valor1) {
        super();
        this.valor1 = valor1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public abstract double getArea();

    public abstract double getPerimetro();
}
