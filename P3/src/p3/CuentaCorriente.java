package p3;

public class CuentaCorriente {

    /*tres atributos private de tipo Titular (Nombre � String, Apellidos �
	String y Edad � int), de tipo String (el n�mero de cuenta) y de tipo double
	(el saldo).*/
    protected Titular titular1;
    private String numeroCuenta;
    private double saldo;
    //constructor con par�metros de tipo Titular, String y double.

    public CuentaCorriente(Titular t, String n, double s) {
        titular1 = t;
        numeroCuenta = n;
        saldo = s;
    }

    /*constructor con par�metros de tipo Titular y String. El saldo se
	inicializar� a 15,3.*/
    public CuentaCorriente(Titular t, String n) {
        titular1 = t;
        numeroCuenta = n;
        saldo = 15.3;
    }
    //getter para cada uno de los atributos.

    public Titular getTitular1() {
        return titular1;
    }

    /**
     * Método que permite acceder el número de cuenta
     *
     * @return un string con el número de cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param n El saldo con el que debe ser actualizado
     */
    public void setSaldo(double n) {
        saldo = n;
    }
    //M�todo ingresar que incremente el saldo en una cantidad.

    public void ingresar(double cantidad) {
        saldo = saldo + cantidad;
    }
    //m�todo reintegro que decremente el saldo en una cantidad.

    public void reintegro(double cantidad) {
        saldo = saldo - cantidad;
    }

    /*m�todo para que al imprimir la cuenta salga por pantalla el
	n�mero de cuenta y su saldo.*/
    public void mostrarInfoCuenta() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" + "titular1=" + titular1 + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + '}';
    }
    

    /*m�todo para comparar cuentas, sabiendo que dos cuentas
	ser�n iguales si sus n�meros de cuenta son iguales.*/
    /**
     *
     * @param c2
     * @return
     */
    public String compararCuentas(CuentaCorriente otraCuenta) {
        String c;
        if (numeroCuenta.compareTo(otraCuenta.numeroCuenta) == 0) {
        //if (numeroCuenta.equals(otraCuenta.numeroCuenta)==true){
            c = "Las cuentas son iguales";
        } else {
            c = "Las cuentas son diferentes";
        }
        return c;
    }

}
