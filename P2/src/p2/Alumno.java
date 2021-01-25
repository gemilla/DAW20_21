package p2;

public class Alumno {
	//tres atributos private de tipo Asignatura.
	private Asignatura asignatura1;
	private Asignatura asignatura2;
	private Asignatura asignatura3;
	
	//constructor con tres par�metros de tipo Asignatura que inicialice los tres atributos.
	public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
		asignatura1=a1;
		asignatura2=a2;
		asignatura3=a3;
	}
	
	//Tenga un constructor con tres par�metros de tipo int que inicialice los tres atributos.
	public Alumno (int a1, int a2, int a3) {
		asignatura1=new Asignatura(a1);
		asignatura2=new Asignatura(a2);
		asignatura3=new Asignatura(a3);
	}
	
	//getter para cada uno de los atributos.
	public Asignatura getAsignatura1() {
		return asignatura1;
	}
	public Asignatura getAsignatura2() {
		return asignatura2;
	}
	public Asignatura getAsignatura3() {
		return asignatura3;
	}
        public void mostrarInformacion(){
            System.out.println(toString());
        }
        public String toString(){
            return "Alumno: \n "+asignatura1.toString()+ "\n"+ asignatura2.toString()+"\n"+ asignatura3.toString();
        
        }
}
