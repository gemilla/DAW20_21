package examena;

public class Jefe extends Trabajador {

    private int numEmpleados;

    public Jefe(int numEmpleados, String nombre, String nif, String departamento, double sueldoBase, Fecha fecha) {
        super(nombre, nif, departamento, sueldoBase, fecha);
        this.numEmpleados = numEmpleados;
    }
    
    public Jefe(int numEmpleados) {
        super();
        this.numEmpleados = numEmpleados;
    }

    public Jefe() {
       super(Math.random()*501+1500); //Math.random()*(mayor-menor) + menor
        numEmpleados = (int) (Math.random() * 30);
    }

    @Override
    public String toString() {
        return super.toString()+ "numEmpleados=" + numEmpleados + '}';
    }

   

    @Override
    public double calcularSalario() {
        double total;
        total = getSueldoBase() + (0.01 * getSueldoBase() * numEmpleados);
        return total;
    }
}
