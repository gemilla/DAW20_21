package p1;

public class Triangulo {
	private Punto p1;
	private Punto p2;
	private Punto p3;
        
        
	
	public Triangulo(Punto p1, Punto p2, Punto p3) {
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	public Triangulo() {
		p1=new Punto(12.3, 4.5);
		p2=new Punto(3.4, 5.6);
		p3=new Punto(3.7, 4.1);
	}
	public Triangulo(double p1_1, double p1_2, double p2_1, double p2_2, double p3_1, double p3_2) {
		p1=new Punto(p1_1, p1_2);
		p2=new Punto (p2_1, p2_2);
		p3= new Punto(p3_1, p3_2);
	}
	public Punto getP1() {
		return p1;
	}
	public Punto getP2() {
		return p2;
	}
	public Punto getP3() {
		return p3;
	}
	public double calcularDistanciaDesde(Punto otroPunto) {
            //Supongo que la distancia la calculo desde el Punto p1 al vértice p1
		double distancia= p1.calcularDistanciaDesde(otroPunto);
		return distancia;
}
	public double calcularPerimetro() {
		double perimetro=p1.calcularDistanciaDesde(p2)+p2.calcularDistanciaDesde(p3)+p3.calcularDistanciaDesde(p1);
		return perimetro;
	}
        public double calculaArea(){
        //fórmula Herón
        double s = calcularPerimetro()/2;//semiperímetro
        double a = p2.calcularDistanciaDesde(p3);
        double b = p2.calcularDistanciaDesde(p1);
        double c = p3.calcularDistanciaDesde(p1);    
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
        }
        public String toString(){
            String cadena = "Soy un triángulo y tengo tres vértices: "+p1.toString()+"\n"+p2.toString()+"\n"+p3.toString();
            return toString();
        }
        public void mostrarInformación(){
        System.out.println(toString());
    }
}
