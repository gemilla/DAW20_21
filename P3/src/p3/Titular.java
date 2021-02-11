package p3;

public class Titular {
	//ATRIBUTOS
	private String Nombre;
	private String Apellidos;
	private int Edad;
    
    /**
     * Constructor que permite crear un titular a partir del nombre, los apellidos y la edad
     * @param Nombre
     * @param Apellidos
     * @param Edad 
     */    
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

   /**
    * Método que permite leer el valor de la edad del titular
    * @return la edad del titular
    */
    public int getEdad() {
        return Edad;
    }
    /**
     * 
     * @param Edad la edad nueva
     */
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
