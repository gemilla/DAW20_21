package javaapplication1;

public class Direccion {
	private String calle;
	private String codigoPostal;
	private String comunidadAutonoma;
	public Direccion(String calle, String codigoPostal, String comunidadAutonoma) {
		this.calle = calle;
		this.codigoPostal = codigoPostal;
		this.comunidadAutonoma = comunidadAutonoma;
	}
	public Direccion() {
		calle=new String("falsa");
                int codigoPostalAleatoria = (int)(Math.random()*50000+10000);
		codigoPostal=Integer.toString(codigoPostalAleatoria);
		comunidadAutonoma=new String("Madrid");
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}
	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", codigoPostal=" + codigoPostal + ", comunidadAutonoma="
				+ comunidadAutonoma + "]";
	}
	
}
