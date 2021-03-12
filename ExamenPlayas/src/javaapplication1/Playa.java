package javaapplication1;
public abstract class Playa implements Comparable<Playa> {
    private int id;
    private String nombre;
    private Direccion direccion;
    private double longitud;
    private int [] valoracion;

    public Playa(int id, String nombre,Direccion direccion, double longitud, int []valoracion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion; 
        this.longitud = longitud;
        this.valoracion= valoracion;
        
    }

    
    public static int [] generadorValoraciones(){
        int []valoraciones = new int[10];
        for (int i = 0; i < valoraciones.length; i++) {
            valoraciones[i]= (int)(Math.random() * 5 + 1);  
        }
        return valoraciones;
    }
    
    public Playa() {
        id = (int)(Math.random()*1000);
        nombre = this.getClass().getSimpleName()+id;
        direccion = new Direccion();
        longitud = Math.random()*5000;
        valoracion= Playa.generadorValoraciones();
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(String calle, String codigoPostal, String comunidadAutonoma) {
        direccion = new Direccion(calle,codigoPostal,comunidadAutonoma);
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int[] getValoracion() {
        return valoracion;
    }

    public void setValoracion(int[] valoracion) {
        this.valoracion = valoracion;
    }
    public double valoracionMedia(){
        int suma=0;
        for (int i = 0; i < valoracion.length; i++) {
            suma=suma+valoracion[i];
        }
        return suma/valoracion.length;
    }
    public abstract double getPuntuacion();

    @Override
    public String toString() {
        return "Tipo de playa= "+getClass().getSimpleName()+"id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", longitud=" + longitud + ", valoracion media=" + valoracionMedia();
    }
    @Override
    public int compareTo(Playa o) {
        //return (int)this.getPuntuacion()-(int)o.getPuntuacion();
        return nombre.compareToIgnoreCase(o.nombre);
        
    }
    
}
