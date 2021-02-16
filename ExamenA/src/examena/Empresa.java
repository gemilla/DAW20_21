package examenA;

public class Empresa {
	private Trabajador trabajadores[];
       
	public Empresa() {
            this(10);
		
	}
	public Empresa (int num){
        trabajadores= new Trabajador[num];
        for (int i = 0; i < trabajadores.length; i++) {
			int trabajador=(int)(Math.random()*2);
			/*if(trabajador==0) {
				trabajadores[i]=new Jefe();
			}else {
				trabajadores[i]=new Programador();
			}*/
                        if(trabajador==0) {
                        	trabajadores[i]=new Jefe(i,"Jefe "+ i,i+"V","Departamento"+i,Math.random()*501+1500,new Fecha() );
			}else {
                            //String nombre, String nif, String departamento, double sueldoBase, Fecha fecha, String lenguaje, boolean experiencia) {
                        }
				trabajadores[i]=new Programador("programador "+ i,i+"P","Departamento"+i,Math.random()*501+1000,new Fecha(), "Java", true);
		}
        }

    public Empresa(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }
        
        
}
