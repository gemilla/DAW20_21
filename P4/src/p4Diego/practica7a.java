package POO4;

public class practica7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centralita centralita1 = new centralita();
                System.out.println(centralita1);
                local local1 = new local();
                System.out.println(local1+" "+ local1.calcularCoste());
                provincial provincial1 = new provincial(2); 
                //a petición de Eva que quería especificar la franja pero el resto de atributos aleatorios
                System.out.println(provincial1+" "+ provincial1.calcularCoste());
                centralita1.registrarLlamadas(local1);
                centralita1.registrarLlamadas(provincial1);
                System.out.println(centralita1);
                
                
	}

}
