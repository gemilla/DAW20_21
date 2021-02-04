package p1HerenciaB;

public class TrianguloEquilatero extends Figura {

    public TrianguloEquilatero() {
        this(12);
    }

    public TrianguloEquilatero(int l1) {
        super(l1);
    }

    @Override
    public double calcularPerimetro() {
        int perimetro = 3 * dimension;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;//semiperímetro
        double area = Math.sqrt(s * (s - dimension) * (s - dimension) * (s - dimension));
        return area;
    }
}
