package ExamenD_Inmobiliaria;

public class Direccion {
	protected String calle;
	protected String provincia;
        protected static final String [] provincias = {"Madrid", "Barcelona", "Málaga", "Valencia","Vizcaya"};
	
	//constructores
	public Direccion(String calle, String provincia) {
		this.calle = calle;
		this.provincia = provincia;
	}
	public Direccion() {
		this.calle = "La que sea";
                int provinciaAleatoria = (int)(Math.random()*5);
		this.provincia = provincias[provinciaAleatoria];
	}
	
	//getter y setter
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	//mostrar info
	
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", provincia=" + provincia + "]";
	}
	
	
	
}
