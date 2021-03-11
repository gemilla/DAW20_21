package javaapplication1;

import java.util.Arrays;
import java.util.Scanner;

public class GestionPlayas {

    private Playa[] playas;

    public GestionPlayas(int cantidad) {
        playas = new Playa[cantidad];
        for (int i = 0; i < cantidad; i++) {
            if (i % 2 == 0) {
                playas[i] = new PlayaGrande();
            } else //playas[i]=new Cala();
            {
                playas[i] = new Cala((int) (Math.random() * 100), "playita", new Direccion("orilla", "15345", "Murcia"), (Math.random() * 20), Playa.generadorValoraciones(), true);
            }
        }
    }

    public GestionPlayas() {
        this(1000);
    }

    public GestionPlayas(Playa[] playas) {
        this.playas = playas;
    }

    public void darBaja(int id) {
        boolean var = false;
        for (int i = 0; i < playas.length && !var; i++) {
            if (playas[i] != null && playas[i].getId() == id) {
                playas[i] = null;
                var = true;
            }
        }
        if (var) {
            System.out.println("Baja realizada con exito");
        } else {
            System.out.println("Error, baja no realizada");
        }

    }

    public Playa altaPlaya() {
        Scanner lector = new Scanner(System.in);
        Playa nuevaPlaya = null;
        int numero;
        do {
            System.out.println("Introduce el tipo de playa que quieras introducir:");
            System.out.println("1. PlayaGrande.");
            System.out.println("2. Cala.");
            numero = lector.nextInt();
            System.out.println("Introduce el identificador:");
            int identificador = lector.nextInt();
            System.out.println("Introduce el nombre:");
            String nombre = lector.nextLine();
            System.out.println("Introduce la calle:");
            String calle = lector.nextLine();
            System.out.println("Introduce el codigo postal:");
            String codigoPostal = lector.nextLine();
            System.out.println("Introduce la comunidad autonoma:");
            String comunidadAutonoma = lector.nextLine();
            System.out.println("Introduce la longitud:");
            double longitud = lector.nextDouble();
            System.out.println("Introduce dias de valoracion:");
            int valoracion = lector.nextInt();
            int[] valoraciones = new int[valoracion];
            for (int i = 0; i < valoraciones.length; i++) {
                System.out.println("Introduce las valoraciones:");
                valoraciones[i] = lector.nextInt();
            }
            Direccion direccion = new Direccion(calle, codigoPostal, comunidadAutonoma);
            if (numero == 1) {
                System.out.println("Introduce la bandera:");
                String bandera = lector.nextLine();

                nuevaPlaya = new PlayaGrande(bandera, identificador, nombre, direccion, longitud, valoraciones);
            } else if (numero == 2) {
                System.out.println("Introduce el acceso(true/false):");
                boolean acceso = lector.nextBoolean();
                nuevaPlaya = new Cala(identificador, nombre, direccion, longitud, valoraciones, acceso);
            }
        } while (numero < 1 || numero > 2);
        return nuevaPlaya;
    }

    public void sumaPlaya(Playa nuevaPlaya) {
        nuevaPlaya = altaPlaya();
        for (int i = 0; i < playas.length; i++) {
            if (playas[i] != null) {
                playas[i] = nuevaPlaya;
            }
        }
    }

    public void listarLongitud(double longitud) {
        for (int i = 0; i < playas.length; i++) {
            if (playas[i] != null && playas[i].getLongitud() > longitud) {
                System.out.println(playas[i]);
            }
        }
    }

    public void listarComunidad(String comunidad) {
        for (int i = 0; i < playas.length; i++) {
            if (playas[i] != null && playas[i].getDireccion().getComunidadAutonoma().equalsIgnoreCase(comunidad)) {
                System.out.println(playas[i]);
            }
        }
    }

    public void cambiarLongitud(String nombre) {
        boolean var = false;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < playas.length && !var; i++) {
            if (playas[i] != null && playas[i].getNombre().equalsIgnoreCase(nombre)) {
                var = true;
                System.out.println("Introduce nueva longitud (en Km)");
                playas[i].setLongitud(lector.nextDouble());
            }

        }
    }

    public void cambiarBandera(String nombre) {
        boolean var = false;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < playas.length && !var; i++) {
            //if (playas[i] != null && playas[i].getNombre().equalsIgnoreCase(nombre)&& playas[i] instanceof PlayaGrande) {
            if (playas[i] != null && playas[i].getNombre().equalsIgnoreCase(nombre) && playas[i].getClass().getSimpleName().equals("PlayaGrande")) {
                var = true;
                System.out.println("Introduce nueva bandera (solo verde, roja o amarilla)");
                lector.nextLine();
                String ban = lector.nextLine();
                /*PlayaGrande aux = (PlayaGrande) playas[i];
                aux.setBandera(ban);*/
                ((PlayaGrande) playas[i]).setBandera(ban);
            }

        }
    }

    //siempre y cuando no hay null
    public void ordenarPuntuacion() {
        for (int i = 0; i < playas.length - 1; i++) {
            for (int j = 1; j < playas.length; j++) {
                if (playas[i].getPuntuacion() > playas[i].getPuntuacion()) {
                    Playa aux = playas[i];
                    playas[i] = playas[j];
                    playas[j] = aux;
                }

            }

        }
    }

    public int numPlayas() {
        int contador = 0;
        for (int i = 0; i < playas.length; i++) {
            if (playas[i] != null) {
                contador++;
            }

        }
        return contador;

    }
    

    public Playa[] arraySinHuecos() {
        Playa sinHuecos[] = new Playa[numPlayas()];
        for (int i = 0, j = 0; i < playas.length; i++) {
            if (playas[i] != null) {
                sinHuecos[j] = playas[i];
                j++;
            }

        }
        return sinHuecos;
    }

    public void ordenarPuntuacionSort() {
        Playa sinHuecos[] =arraySinHuecos();
        Arrays.sort(sinHuecos);
        System.out.println(Arrays.toString(sinHuecos));
        
    }
    public void listarPlayas(){
    for (int i = 0; i < playas.length; i++) 
            if (playas[i] != null) {
                System.out.println(playas[i]);
            }

    }
    
}
