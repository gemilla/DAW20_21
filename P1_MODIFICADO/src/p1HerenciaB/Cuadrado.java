package p1HerenciaB;;

public class Cuadrado extends Figura{
	
        public Cuadrado(){
            super(15);
        }
        public Cuadrado(int dimension) {
            super(dimension);
        }
        public int calcularPerimetro() {
		int perimetro=dimension*4;
		return perimetro;
	}
	public int calcularArea() {
		int area=dimension*dimension;
		return area;
	}
	

    
	
}
