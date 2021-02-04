package p1HerenciaB;

public class Circulo extends Figura{
	
	
	public Circulo() {
		dimension=10;
	}
	public Circulo(int n) {
		dimension=n;
	}
	
	
	public double calcularPerimetro() {
		double perimetro=2*dimension*Math.PI;
		return perimetro;
	}
	public double calcularArea() {
		double area=Math.PI * dimension * dimension;
		return area;
	}
	
	
}
