package p2;

public class Practica5b {
	public static void main(String[] args) {
		//Crear e inicializar tres Asignaturas.
		Asignatura programacion=new Asignatura(1);
		Asignatura sistemas=new Asignatura(2);
		Asignatura bbdd=new Asignatura(3);
		
		//Crear un Alumno con las tres Asignaturas.
		Alumno Alex=new Alumno(programacion, sistemas, bbdd);
		
		Profesor.ponerNotas(Alex);
                System.out.println(Alex);
		System.out.println("La media del alumno es "+Profesor.calcularMedia(Alex));
                
	}
}
