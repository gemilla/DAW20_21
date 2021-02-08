package p1HerenciaB;

;

public class Cuadrado extends Figura {

    public Cuadrado() {
        super(15);
    }

    public Cuadrado(int dimension) {
        super(dimension);
    }

    @Override
    public double calcularPerimetro() {
        int perimetro = dimension * 4;
        return perimetro;

    }

    @Override
    public double calcularArea() {
        int area = dimension * dimension;
        return area;

    }

    

}
