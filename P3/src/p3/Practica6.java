package p3;

public class Practica6 {
	public static void main(String[] args) {
		Titular Alex=new Titular("Alejandro", "Ruiz Rubio", 22);
		System.out.println(Alex);
		
		CuentaCorriente cuenta1=new CuentaCorriente (Alex, "123456789",1000);
		CuentaCorriente cuenta2=new CuentaCorriente(Alex, "987654321");
		cuenta1.mostrarInfoCuenta();
		cuenta1.ingresar(20.0);
		cuenta1.mostrarInfoCuenta();
		
		System.out.println(cuenta1.compararCuentas(cuenta2));
		
		CuentaAhorro ahorro=new CuentaAhorro(Alex, "136485216",2000,0.2);
		System.out.println(ahorro);
                System.out.println("-----------ARRAY CUENTAS-------------");
                CuentaCorriente cuentas [] = new CuentaCorriente[3];
                cuentas[0] = cuenta1;
                cuentas[1] = cuenta2;
                cuentas[2] = ahorro;
                for (int i = 0; i < cuentas.length; i++) {
                    System.out.println(cuentas[i]);
                    if (cuentas[i].getClass().getSimpleName().equals("CuentaAhorro")){
                        CuentaAhorro aux = (CuentaAhorro)cuentas[i];
                        System.out.println(aux.getInteres());
                    }
                    
                   
                
            }
		
	}
	
}
