package p1HerenciaB;

public class Circulo extends Figura{
	
	
	public Circulo() {
		dimension=10;
	}
	public Circulo(int n) {
		dimension=n;
	}
	
	
        @Override
	public double calcularPerimetro() {
		double perimetro=2*dimension*Math.PI;
		return perimetro;
	}
        @Override
	public double calcularArea() {
		double area=Math.PI * dimension * dimension;
		return area;
	}

    @Override
    public String dameNombre() {
          return "radio";
    }
	
	
}
