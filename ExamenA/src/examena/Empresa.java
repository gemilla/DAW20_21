package examena;

import java.util.Arrays;

public class Empresa {

    private Trabajador trabajadores[];

    public Empresa() {
        this(10);

    }

    public Empresa(int num) {
        trabajadores = new Trabajador[num];
        for (int i = 0; i < trabajadores.length; i++) {
            int trabajador = (int) (Math.random() * 2);

            /*if (trabajador == 0) {
                trabajadores[i] = new Jefe();
            } else {
                trabajadores[i] = new Programador();
            }*/
            if (trabajador == 0) {

                trabajadores[i] = new Jefe(i, "Diego" + i, i + "V", "Departamento" + i, Math.random() * 501 + 1500, new Fecha());

            } else {

                trabajadores[i] = new Programador("programador" + i, i + "P", "Departamento" + i, Math.random() * 501 + 1000, new Fecha(), "Java", true);
            }
        }
    }

    @Override
    public String toString() {
        String cadena = Arrays.toString(trabajadores);
        return "Empresa{" + "trabajadores=" + cadena;
    }

    public Empresa(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }
    public void listarTrabajadores(){
       // Arrays.sort(trabajadores);
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].toString());
        }
    }
    public void ordenarTrabajadores(){
       Arrays.sort(trabajadores);
    }
}
