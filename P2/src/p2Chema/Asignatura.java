package p2Chema;

public class Asignatura {
    private int id;
    private float calificacion;

    public Asignatura(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion){
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "\nAsignatura " + id + "\nCalificacion: " + calificacion;
    }
    public void mostarInformacion(){
        System.out.println(toString());
    }
}
