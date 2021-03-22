package ExamenD_Inmobiliaria;

public abstract class Alojamiento {
	protected String id;
	protected double precio;
	protected double metros;
	protected Direccion dir;
	protected int anyo;
	
	//Constructores
	public Alojamiento(String id, double precio, double metros, Direccion dir, int anyo) {
		this.id = id;
		this.precio = precio;
		this.metros = metros;
		this.dir = dir;
		this.anyo = anyo;
	}
	public Alojamiento() {
                this.id = "id";
                this.precio = (Math.random()*938465+1);
		this.metros = (Math.random()*1000+1);
		this.dir = new Direccion();
		this.anyo = (int) (Math.random()*2050+1);
	}
	//getter y setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getMetros() {
		return metros;
	}
	public void setMetros(double metros) {
		this.metros = metros;
	}
	public Direccion getDir() {
		return dir;
	}
	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	//mostrar info
	public abstract double precioReal(double descuento);
        
	@Override
	public String toString() {
		return  getClass().getSimpleName()+"[id=" + id + ", precio=" + precio + ", metros=" + metros + ", dir=" + dir + ", anyo=" + anyo
				+ "]";
	}
	
	
}
