package granja;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        //(String nombre, Fecha fechaNacimiento, int[] numeroHuevos)
        /*int[] huevosGallinaIvan = new int[30];
        for (int i = 0; i < huevosGallinaIvan.length; i++) {
            huevosGallinaIvan[i] = (int) (Math.random() * 5);

        }
        Gallina gallinaIvan = new Gallina("Gallina", new Fecha(),huevosGallinaIvan);
        Gallina gallinaGema = new Gallina();
        //public Vaca(String nombre, Fecha fechaNacimiento, int litrosAlMes, int kg) 
        Vaca vacaCesar = new Vaca("Salada",new Fecha(13,9,1991),550,1000);
        Vaca vacaMiranda = new Vaca();
        
        System.out.println(gallinaIvan);
        System.out.println(gallinaGema);
        System.out.println(vacaCesar);
        System.out.println(vacaMiranda);
         */

        Granja granja = new Granja(100);
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un n�mero para seleccionar");
        int numero = 0;

        do {
            System.out.println("1. Listar animales.");
            System.out.println("2. Añadir animal");
            System.out.println("3. Consultar animales");
            System.out.println("4. Actualizar nombre");
            numero = lector.nextInt();
            switch (numero) {
                case 1:
                    granja.listarAnimales();
                    break;
                case 2:
                    granja.sumarAnimal(granja.agregarAnimal());
                    granja.listarAnimales();
                    break;
                case 3:
                    System.out.println("introduce el año de nacimiento del animal que quieres buscar");
                    int anyo = lector.nextInt();
                    granja.consultarAnimales(anyo);
                    break;
                case 4:
                    lector.nextLine();
                    System.out.println("Introduce el identificador del animal al que le quieres cambiar el nombre");
                    String ident = lector.nextLine();
                    System.out.println(ident);
                    granja.actualizarNombre(ident);
                
                    
            }
        } while (numero!=5);
    }
}
