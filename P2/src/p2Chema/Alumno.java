package p2Chema;

public class Alumno {
    private Asignatura asi1;
    private Asignatura asi2;
    private Asignatura asi3;

    public Alumno(Asignatura asi1, Asignatura asi2, Asignatura asi3){
        this.asi1 = asi1;
        this.asi2 = asi2;
        this.asi3 = asi3;
    }

    public  Alumno(int id1, int id2, int id3){
        asi1 = new Asignatura(id1);
        asi2 = new Asignatura(id2);
        asi3 = new Asignatura(id3);
    }

    public Asignatura getAsi1(){
        return asi1;
    }

    public Asignatura getAsi2() {
        return asi2;
    }

    public  Asignatura getAsi3(){
        return asi3;
    }

    @Override
    public String toString() {
        return "Alumno{" + "asi1=" + asi1 + ", asi2=" + asi2 + ", asi3=" + asi3 + '}';
    }

   
    
    public void mostrarInformacion(){
        System.out.println(toString());
    }
}
