package model;

/**
 * Representa un pentagono.
 */
public class Pentagono extends FiguraGeometrica {

    /**
     * dimension1 = lado
     * dimension2 = apotema
     */
    public Pentagono(double lado, double apotema) {

        super("Pentágono", lado, apotema);

        calcularPerimetro();
        calcularArea();
    }

    @Override
    public void calcularArea() {

        area = (perimetro * dimension2) / 2;
    }

    @Override
    public void calcularPerimetro() {

        perimetro = dimension1 * 5;
    }
}