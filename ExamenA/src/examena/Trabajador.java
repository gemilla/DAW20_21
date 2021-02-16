package examenA;

public abstract class Trabajador {
	private String nombre;
	private String nif;
	private String departamento;
	private double sueldoBase;
        private Fecha fecha;
	public Trabajador(String nombre, String nif, String departamento, double sueldoBase, Fecha fecha) {
		this.nombre=nombre;
		this.nif=nif;
		this.departamento=departamento;
		this.sueldoBase=sueldoBase;
		this.fecha=fecha;
	}
	public Trabajador() {
		nombre="Diego";
		nif="51789654G";
		departamento="Informatica";
		sueldoBase=2000;
		fecha=new Fecha(1,3,2021);
	}
        public Trabajador(double sueldo) {
		nombre="Trabajador";
		nif="51789654G";
		departamento="Informatica";
		sueldoBase=sueldo;
		fecha=new Fecha(1,3,2021);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public abstract double calcularSalario();
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ "[nombre=" + nombre + ", nif=" + nif + ", departamento=" + departamento + ", sueldoBase="
				+ sueldoBase + ", fecha=" + fecha + "]";
	}
	
}
