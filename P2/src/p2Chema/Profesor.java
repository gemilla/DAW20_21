package p2Chema;

public class Profesor {

    public static void ponerNotas(Alumno r){
        r.getAsi1().setCalificacion((float)(Math.random()*10+1));
        r.getAsi2().setCalificacion((float)(Math.random()*10+1));
        r.getAsi3().setCalificacion((float)(Math.random()*10+1));

    }

    public static float calcMedia(Alumno r){
        return (r.getAsi1().getCalificacion()+r.getAsi2().getCalificacion()+r.getAsi3().getCalificacion())/3;
    }

}
