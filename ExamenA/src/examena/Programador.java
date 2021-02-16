package examena;

public class Programador extends Trabajador{
	private String lenguaje;
	private boolean experiencia;
	public Programador(String nombre, String nif, String departamento, double sueldoBase, Fecha fecha, String lenguaje, boolean experiencia) {
		super(nombre, nif, departamento, sueldoBase, fecha);
		this.lenguaje=lenguaje;
		this.experiencia=experiencia;
	}
	public Programador() {
		super(Math.random()*501+1000); //Math.random()*(mayor-menor) + menor
		lenguaje="Java/C#/PHP/C/C++/Phyton";
                experiencia=true;
	}
        
	@Override
	public double calcularSalario() {
		double total=0;
		if(experiencia==true) {
			total=getSueldoBase()+getSueldoBase()*0.2;
		}
                
                //Y si ganamos más sueldo en función del número de lenguajes en los que sabemos programar
                /*String trozos[] = lenguaje.split("/");
                total +=  total*0.1*trozos.length;*/
                //otra forma
                /*char [] letras = lenguaje.toCharArray();
                int contador=0;
                for (int i = 0; i < letras.length; i++) {
                    if (letras[i]=='/')
                        contador++;
                }*/
		return total;
	}
	@Override
	public String toString() {
		return super.toString()+"[lenguaje=" + lenguaje + ", experiencia=" + experiencia + "]";
	}

    
	
}
