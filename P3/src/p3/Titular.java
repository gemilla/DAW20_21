package p3;

public class Titular {
	//ATRIBUTOS
	private String Nombre;
	private String Apellidos;
	private int Edad;

    public Titular(String Nombre, String Apellidos, int Edad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
    }

    public Titular() {
        this.Nombre = "NombreTitular";
        this.Apellidos = "ApellidosTitular";
        this.Edad = 18;
    }

   
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    @Override
    public String toString() {
        return "Titular{" + "Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Edad=" + Edad + '}';
    }
    
	
}
