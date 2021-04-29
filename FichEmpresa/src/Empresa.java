/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author GEMA
 */
public class Empresa {

    protected Trabajador[] trabajadores;

    public Empresa() {
        //this(12);
        trabajadores = new Trabajador[12];
        for (int i = 2; i < trabajadores.length; i++) {

            if (i < trabajadores.length / 2 + 2) {
                trabajadores[i] = new Programador();
            } else {
                trabajadores[i] = new JefeProyecto();
            }
        }

    }

    public Empresa(int tamanyo) {
        trabajadores = new Trabajador[tamanyo];
        for (int i = 2; i < trabajadores.length; i++) {

            if (i < trabajadores.length / 2 + 2) {
                StringBuilder sb = new StringBuilder("JAVA:PHYTON");
                trabajadores[i] = new Programador(true, sb, "TESTER", "IT"+i, new Fecha(), Math.random() * 501 + 1000);
            } else {
                trabajadores[i] = new JefeProyecto(i * 5, "TESTER_JEFE", "dpto", new Fecha(),Math.random() * 501 + 1500 );
            }
        }
    }

    public Empresa(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Trabajador[] trabajadores) {
        this.trabajadores = trabajadores;
    }

    public void listarTrabajadores() {
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null) {
                System.out.println(trabajadores[i]);
            }
            // System.out.println(Arrays.toString(trabajadores));
        }

    }

    public static Trabajador crearTrabajador() {
        Trabajador trabajador = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿PROGRAMADOR O JEFE DE PROYECTO?");
        String op = sc.nextLine().toUpperCase();
        if (op.equals("PROGRAMADOR") || op.equals("JEFE DE PROYECTO")) {
            System.out.print("NOMBRE: ");
            String nombre = sc.nextLine().toUpperCase();
            System.out.print("NIF: ");
            String nif = sc.nextLine().toUpperCase();
            System.out.print("DEPARTAMENTO: ");
            String departamento = sc.nextLine().toUpperCase();
            System.out.println("Introduzca fecha(dia mes año)");
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int anyo = sc.nextInt();
            System.out.println("Introduzca sueldo");
            double sueldo = sc.nextDouble();
            sc.nextLine();
            if (op.equals("PROGRAMADOR")) {
                String choose;
                boolean poo;
                do {
                    System.out.print("¿Tiene concomientos de POO?: ");
                    choose = sc.nextLine().toUpperCase();
                    if (!choose.equals("SI") && !choose.equals("NO")) {
                        System.out.println("ERROR | VUELVE A INTRODUCIR");
                    }
                    poo = (choose.equals("SI"));
                } while (!choose.equals("SI") && !choose.equals("NO"));
                StringBuilder lenguajes = new StringBuilder();
                System.out.println("Lenguajes de Programación [** para terminar] ");
                String lenguaje;
                do {
                    lenguaje = sc.nextLine();
                    if (!lenguaje.equals("**")) {
                        lenguajes = lenguajes.append(":").append(lenguaje);
                    }
                } while (!lenguaje.equals("**"));

                trabajador = new Programador(poo, nif, lenguajes, nombre, departamento, new Fecha(dia, mes, anyo), sueldo);
            } else {
                System.out.print("¿Cuantas personas dirige?: ");
                int numP = sc.nextInt();
                trabajador = new JefeProyecto(numP, nif, nombre, departamento, new Fecha(dia, mes, anyo), sueldo);

            }
        } else {
            System.out.println("ERROR | VUELVE A INTRODUCIR");
        }
        return trabajador;
    }

    public void insertarEmpresa(Trabajador trabajador) {
        boolean introducido = false;
        for (int i = 0; i < trabajadores.length && introducido == false; i++) {
            if (trabajadores[i] == null) {
                trabajadores[i] = trabajador;
                introducido = true;
            }
        }
        if (introducido) {
            System.out.println("El trabajador ha sido contratado por la empresa");
        } else {
            System.out.println("No hay sitio");
        }

    }

    public void consultaPorDepartamento(String dpto) {
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null && trabajadores[i].departamento.equalsIgnoreCase(dpto)) {
                System.out.println(trabajadores[i]);
            }
        }
    }

    //4 Actualizar salario de un trabajador a partir de su NIF que será introducido como argumento de entrada al método. (0,75p)
    public void actualizarSalario(String NIF) {
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null && trabajadores[i].NIF.equalsIgnoreCase(NIF)) {
                System.out.println(trabajadores[i]);
                System.out.println("Introduce el salario nuevo");
                //trabajadores[i].setSueldoBase(lector.nextDouble());
                trabajadores[i].sueldoBase = lector.nextDouble();
            }
        }
    }

    public boolean actualizarPersonas(String nombre, int personas) {
        boolean todoOk = false;
        for (int i = 0; i < trabajadores.length && !todoOk; i++) {
            /*if (trabajadores[i] != null && trabajadores[i] instanceof JefeProyecto && trabajadores[i].nombre.equalsIgnoreCase(nombre)) {
                ((JefeProyecto) trabajadores[i]).personas = personas;
                todoOk = true;
            }*/
            if (trabajadores[i] != null && trabajadores[i].getClass().getSimpleName().equals("JefeProyecto") && trabajadores[i].nombre.equalsIgnoreCase(nombre)) {
                ((JefeProyecto) trabajadores[i]).personas = personas;
                todoOk = true;
            }
        }
        return todoOk;
    }

    public void eliminar() {
        Scanner lector = new Scanner(System.in);
        String nombre, departamento;
        boolean eliminado = false;
        for (int i = 0; i < trabajadores.length && !eliminado; i++) {
            if (trabajadores[i] != null) {
                System.out.println("Introduzca el nombre del trabajador y el departamento");
                nombre = lector.nextLine();
                departamento = lector.nextLine();
                if (trabajadores[i].nombre.equalsIgnoreCase(nombre) && trabajadores[i].departamento.equalsIgnoreCase(departamento)) {
                    trabajadores[i] = null;
                    eliminado = true;
                }
            }
        }
        if (eliminado) {
            System.out.println("El trabajador ha sido eliminado correctamente");
        }
    }

    public void calcularSalario(String dpto) {
        double salarioDpto = 0;
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] != null && trabajadores[i].departamento.equals(dpto)) {
                System.out.printf("%s gana %.2f €\n", trabajadores[i].nombre, trabajadores[i].calcularSalario());
                // salarioDpto+=trabajadores[i].calcularSalario();
                salarioDpto = salarioDpto + trabajadores[i].calcularSalario();
            }
        }
        System.out.printf("El salario total del dpto es %.2f €", salarioDpto);
    }

    public void ordenarOriginal() {
        Trabajador aux = null;
        boolean intercambio = true;
        while (intercambio) {
            intercambio = false;
            for (int i = 0; i < trabajadores.length - 1; i++) {
                if (trabajadores[i]!=null&&trabajadores[i+1]!=null&&trabajadores[i].sueldoBase < trabajadores[i + 1].sueldoBase) {
                    aux = trabajadores[i];
                    trabajadores[i] = trabajadores[i + 1];
                    trabajadores[i + 1] = aux;
                    intercambio = true;
                }
            }

        }

    }
    public void ordenarCopia() {
        int cont=0;
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i]!=null)
                cont++;
            
        }
        Trabajador[] copia = new Trabajador[cont];
        Trabajador aux = null;
        for (int i = 0,j=0; i < trabajadores.length; i++) {
            if (trabajadores[i]!=null){
                copia[j]=trabajadores[i];
                j++;
            }
        }
           
        boolean intercambio = true;
        while (intercambio) {
            intercambio = false;
            for (int i = 0; i < copia.length - 1; i++) {
                if ((copia[i].departamento.compareTo(copia[i + 1].departamento))<0 ){
                    aux = copia[i];
                    copia[i] = copia[i + 1];
                    copia[i + 1] = aux;
                    intercambio = true;
                }
            }

        }
        for (int i = 0; i < copia.length; i++) {
            System.out.println(copia[i]);
            
        }
    }
    @Override
    public String toString() {
        return "Empresa{" + "trabajadores=" + trabajadores + '}';
    }

}
