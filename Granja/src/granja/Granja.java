package granja;

import java.util.Arrays;
import java.util.Scanner;

public class Granja {

    protected Animal[] animales;

    public Granja() {
        this(10);

    }

    public Granja(int cuantos) {
        animales = new Animal[cuantos];

        for (int i = 0; i < animales.length / 2; i++) {
            //he dejado hueco para futuros animales
            if (i % 2 == 0) {
                animales[i] = new Vaca("Vaca " + (i + 1), new Fecha(), (int) (Math.random() * 1001), (int) (Math.random() * 50 + 100));
            } else {
                animales[i] = new Gallina();
            }
        }

    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void setAnimales(Animal[] animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "Granja [animales=" + Arrays.toString(animales) + "]";
    }

    public void listarAnimales() {
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null) {
                System.out.println(animales[i] + " ");
            } else {
                System.out.println("Hay sitio para un futuro animalito");
            }
        }
    }
    public boolean hayDuplicado (String id){
        boolean duplicado= false;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i].getIdentificador().equalsIgnoreCase(id))
                duplicado = true;
        }
        return duplicado;
    
    }
    
    public Animal agregarAnimal() {
        Scanner lector = new Scanner(System.in);
        Animal nuevo = null;
        int numero = 0;
        do {
            System.out.println("Pulsa un n�mero para seleccionar: ");
            System.out.println("1. Añadir una vaca");
            System.out.println("2. Añadir una gallina");
            numero = lector.nextInt();
            lector.nextLine();
            System.out.println("Introduce el nombre");
            String nombre = lector.nextLine();
            System.out.println("Introduce el d�a de nacimiento");
            int dia = lector.nextInt();
            System.out.println("introduce el mes de nacimiento");
            int mes = lector.nextInt();
            System.out.println("Introduce el año de nacimiento");
            int anyo = lector.nextInt();
            Fecha fecha = new Fecha(dia, mes, anyo);
            switch (numero) {
                case 1:
                    System.out.println("Introduce los litros al mes que produce la vaca");
                    int litros = lector.nextInt();
                    System.out.println("Introduce el peso en Kg de la vaca");
                    int peso = lector.nextInt();
                    nuevo = new Vaca(nombre, fecha, litros, peso);

                    break;
                case 2:

                    int huevos[] = new int[31];
                    for (int i = 0; i < huevos.length; i++) {
                        System.out.println("Introduce la cantidad de huevos que puse la gallina el d�a " + (i + 1) + " del �ltimo mes.");
                        int numeroHuevos = lector.nextInt();
                        huevos[i] = numeroHuevos;
                    }
                    nuevo = new Gallina(nombre, fecha, huevos);

                    break;
                default:
                    System.out.println("Por favor, introduce un n�mero v�lido.");

            }
        } while (numero < 1 || numero > 2);
        return nuevo;
    }

    public void sumarAnimal(Animal a) {
        boolean introducido = false;
        for (int i = 0; i < animales.length && introducido == false; i++) {
            //for (int i = 0; i < animales.length && !introducido ; i++) {
            if (animales[i] == null) {
                animales[i] = a;
                System.out.println("Animal añadido con éxito.");
                //i = animales.length;
                introducido = true;
            }
        }

    }

    public void consultarAnimales(int anyo) {
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null) {
                if (animales[i].getFechaNacimiento().getAnyo() == anyo) {
                    System.out.println(animales[i] + " ");
                }
            }
        }
    }

    public void actualizarNombre(String identificador) {
        Scanner lector = new Scanner(System.in);
        boolean cambio = false;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null) {
                if (animales[i].getIdentificador().equals(identificador)) {
                    System.out.println("Introduce el nuevo nombre.");
                    String nuevoNombre = lector.nextLine();
                    animales[i].setNombre(nuevoNombre);
                    cambio = true;
                }
            }

        }
        if (cambio == true) {
            System.out.println("Se ha actualizado el nombre correctamente");
        } else {
            System.out.println("Error. No se ha actualizado el nombre.");
        }
    }

    public int cuantosAnimales() {
        int numero = 0;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null) {
                numero++;
            }
        }
        return numero;

    }

    public void ordenar() {
        Animal[] arrayAuxiliar = new Animal [cuantosAnimales()];
        for (int i = 0, j=0; i < animales.length; i++) {
            // Pista para ordenar gallinas if( animales[i]!= null && animales[i] instanceof Gallina){
            if (animales[i]!=null){
                arrayAuxiliar[j]= animales[i];
                j++;
            }
        }
        Arrays.sort(arrayAuxiliar);
        for (int i = 0; i < arrayAuxiliar.length; i++) {
            System.out.println(arrayAuxiliar[i] + " ");
        }
    }

    public void listarInverso() {
        for (int i = animales.length - 1; i >= 0; i--) {
            if (animales[i] != null) {
                System.out.println(animales[i] + " ");
            } else {
                System.out.println("Hay sitio para un futuro animalito");
            }
        }

    }
}
