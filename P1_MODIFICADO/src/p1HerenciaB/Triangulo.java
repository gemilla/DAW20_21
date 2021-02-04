package p1HerenciaB;;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(){
		lado1=12;
		lado2=10;
		lado3=8;
	}
	public Triangulo(int l1, int l2, int l3){
		lado1=l1;
		lado2=l2;
		lado3=l3;
	}
	
	public int getLado1(){
		return lado1;
	}
	public int getLado2(){
		return lado2;
	}
	public int getLado3(){
		return lado3;
	}
	
	public void setLado1(int l){
		lado1=l;
	}
	public void setLado2(int l){
		lado2=l;
	}
	public void setLado3(int l){
		lado3=l;
	}
	
	public int calcularPerimetro(Triangulo t) {
		int perimetro=t.lado1+t.lado2+t.lado3;
		return perimetro;
	}
	public int calcularArea(Triangulo t) {
		int area=(t.lado1*t.lado2)/2;
		return area;
	}
	public void mostrarInfo() {
		System.out.println(toString());
	}
	public String toString() {
		return "El lado 1 mide "+lado1+", el lado 2 mide "+lado2+" y el lado 3 mide "+lado3;
	}
	
}
