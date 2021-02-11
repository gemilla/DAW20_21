package p3;

//Es una especializaci�n de CuentaCorriente.
public class CuentaAhorro extends CuentaCorriente {
    //Tiene un atributo mas de tipo double (el inter�s).

    private double interes;

    //constructor con par�metros de tipo Titular, String, double y double.
    public CuentaAhorro(Titular t, String n, double s, double i) {
        super(t, n, s);
        interes = i;
    }

    /*constructor con par�metros de tipo Titular, String y double. El
	saldo se inicializar� a 15,3.*/
    public CuentaAhorro(Titular t, String n, double i) {
        super(t, n); //super(t,n,15.3);
        interes = i;
    }

    /*constructor con par�metros de tipo Titular y String. El saldo se
	inicializar� a 15,3 y el inter�s a 2,5.*/
    public CuentaAhorro(Titular t, String n) {
        /*super(t, n);
	interes=2.5;*/
        this(t, n, 2.5);
        //this(t,n,15.3,2.5);

    }
    //getter para cada uno de los atributos.

    public double getInteres() {
        return interes;
    }
    //m�todo calcularInteres que incremente el saldo seg�n el inter�s.

    public String calcularInteres() {
        double calculo = (getSaldo() * interes) / 365;
        setSaldo(getSaldo() + calculo);
        String s = "Saldo con interés: " + getSaldo();
        return s;
    }

    @Override
    public String toString() {
        return super.toString() + "interes=" + interes + '}';
    }

}
