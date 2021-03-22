package ExamenD_Inmobiliaria;

public class Chalet extends Alojamiento{
	private boolean pareados; //pareados=true->pareado y si es false que es independiente

	
	//constructores
	public Chalet(String id, double precio, double metros, Direccion dir, int anyo, boolean pareados) {
		super(id, precio, metros, dir, anyo);
		this.pareados = pareados;
	}
	public Chalet() {
		super();
		pareados = true;
	}
	//getter y setter
	public boolean isPareados() {
		return pareados;
	}
	public void setPareados(boolean pareados) {
		this.pareados = pareados;
	}
	public String esPareado() {
		String respuesta;
		if (pareados==true) {
			respuesta="El chalet es pareado";
		} else {
			respuesta="El chalet es independiente";
		}
		return respuesta;
	}
	public double precioReal(double descuento) {
		double total=0;
		if (pareados==false) {
			total=precio+(precio*0.3);
		} 
		total = total - total*descuento;
		return total;
	}
	
	//mostrar info
	@Override
	public String toString() {
		return super.toString()+this.esPareado();
	}

   
}
