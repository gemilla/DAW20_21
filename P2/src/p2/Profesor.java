package p2;

public class Profesor {
	/*m�todo ponerNotas que recibe un par�metro de tipo Alumno y
	que no devuelve nada. Pondr� una calificaci�n aleatoria a cada una de
	las asignaturas del alumno.*/
	public static void ponerNotas(Alumno a1) {
		a1.getAsignatura1().setCalificacion(10);
		a1.getAsignatura2().setCalificacion((Math.random()*11));
		a1.getAsignatura3().setCalificacion((Math.random()*11));
	}
	//m�todo calcularMedia que recibe un par�metro de tipo Alumno y devuelve un double.
	public static double calcularMedia(Alumno a1) {
		double media=(a1.getAsignatura1().getCalificacion()+a1.getAsignatura2().getCalificacion()+a1.getAsignatura3().getCalificacion())/3;
		return media;
	}
}
