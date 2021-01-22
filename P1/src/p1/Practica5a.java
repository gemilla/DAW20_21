package p1;

public class Practica5a {
	public static void main(String[] args) {
		Punto p1 = new Punto(10, 5);
		Punto p2=new Punto(12, 4);
		
		System.out.println("La distancia entre el punto 1 y el punto 2 es de "+p1.calcularDistanciaDesde(p2));
		
		Circulo c1= new Circulo();
		System.out.println("El area del c�rculo es "+c1.calcularArea());
		System.out.println("El per�metro del c�rculo es "+c1.calcularPerimetro());
		System.out.println("La distancia entre el c�rculo y el punto 1 es de "+c1.calcularDistanciaDesde(p1));
		
		Triangulo t1=new Triangulo();
		System.out.println("El per�metro del tri�ngulo es de "+t1.calcularPerimetro());
		System.out.println("La distancia entre el punto 2 y el tri�ngulo es de "+t1.calcularDistanciaDesde(p2));
	}
}
