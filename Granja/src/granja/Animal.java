package granja;



public abstract class Animal implements Comparable<Animal> {
    private int identNumero;
    private String identificador;
    private String nombre;
    private Fecha fechaNacimiento;
    private static int animalesTotales;

    

    public Animal(String nombre, Fecha fechaNacimiento) {
        animalesTotales++;
        identificador = "id" + animalesTotales;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Animal() {
        animalesTotales++;
        identificador = "id" + animalesTotales;
        nombre = "nombre";
        fechaNacimiento = new Fecha();
    }

    public static int getAnimalesTotales() {
        return animalesTotales;
    }
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[identificador=" + identificador + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
                + "]";
    }

    public abstract boolean rentable();
     @Override
    public int compareTo(Animal o) {
             
        //return this.identNumero-o.identNumero;
        return this.identificador.compareTo(o.identificador);
        //return this.nombre.compareTo(o.nombre);
         
    }
}
