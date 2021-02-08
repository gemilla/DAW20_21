package p3;

public class Practica6 {
	public static void main(String[] args) {
		Titular Alex=new Titular("Alejandro", "Ruiz Rubio", 22);
		System.out.println(Alex);
		
		CuentaCorriente cuenta1=new CuentaCorriente (Alex, "123456789");
		CuentaCorriente cuenta2=new CuentaCorriente(Alex, "987654321");
		cuenta1.mostrarInfoCuenta();
		cuenta1.ingresar(20.0);
		cuenta1.mostrarInfoCuenta();
		
		System.out.println(cuenta1.compararCuentas(cuenta2));
		
		CuentaAhorro ahorro=new CuentaAhorro(Alex, "136485216");
		System.out.println(ahorro.calcularInteres());
		
	}
	
}
