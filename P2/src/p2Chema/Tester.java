package p2Chema;

public class Tester {
    public static void main(String[] args) {

        Asignatura programacion = new Asignatura(111);
        Asignatura sistemas = new Asignatura(222);
        Asignatura datos = new Asignatura(333);

        Alumno Chema = new Alumno(programacion, sistemas, datos);
        Profesor.ponerNotas(Chema);
        String cadena = Chema.toString();
        System.out.println(cadena);
        System.out.println(Chema);
        System.out.println("\nMEDIA: "+ Profesor.calcMedia(Chema));
        
       




    }
}
