package p2;

public class Asignatura {
    //2 atributos private de tipo int (identificador) y double (calificacion)

    private int identificador;
    private double calificacion;

    //constructor con un par�metro de tipo int.
    public Asignatura(int n) {
        identificador = n;
    }

    //getter para cada uno de los atributos.
    public int getIdentificador() {
        return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    //setter para la calificaci�n.
    public void setCalificacion(double c) {
        calificacion = c;
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }
    
    public String toString() {
        return "Asignatura con código: " + identificador + " y nota " + calificacion;
    }
}
