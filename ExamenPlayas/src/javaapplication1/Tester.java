package javaapplication1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
       GestionPlayas playas=new GestionPlayas(10);
        Scanner lector = new Scanner(System.in);
       int var=9;
       playas.listarPlayas();
       do{
           System.out.println("1.Introduce nueva gestion de playas");
           System.out.println("2.Dar de baja una playa");
           System.out.println("3.Dar de alta una playa");
           System.out.println("4.Mostrar lista por longitud");
           System.out.println("5.Mostrar lista por comunidad autonoma");
           System.out.println("6.Modificar longitud de una playa");
           System.out.println("7.Modificar bandera");
           System.out.println("8.Ordenar por puntuacion");
           System.out.println("9.Salir");
           System.out.println("Introduce Opcion");
           var=lector.nextInt();
           //playas.listarPlayas();
           switch(var){
                   case 1:
                       System.out.println("Introduce cantidad de playas");
                       playas=new GestionPlayas(lector.nextInt());
                   break;
                   case 2:
                       System.out.println("Introduce id");
                       playas.darBaja(lector.nextInt());
                   break;
                   case 3:
                       playas.sumaPlaya(playas.altaPlaya());
                   break;
                   case 4:
                       System.out.println("Introduce longitud minima");
                       playas.listarLongitud(lector.nextDouble());
                   break;
                   case 5:
                       System.out.println("Introduce comunidad autonoma");
                       lector.nextLine();
                       String com=lector.nextLine();
                       playas.listarComunidad(com);
                   break;
                   case 6:
                       System.out.println("Introduce nombre de la playa");
                        lector.nextLine();
                        String lon= lector.nextLine();
                       playas.cambiarLongitud(lon);
                   break;
                   case 7:
                       System.out.println("Introduce nombre de la playa");
                        lector.nextLine();
                        String ban= lector.nextLine();
                       playas.cambiarBandera(ban);
                   break;
                   case 8:
                       //playas.ordenarPuntuacion();
                       playas.ordenarPuntuacionSort();
                   break;
                   case 9:
                       System.out.println("Adios");
                   break;
                   default:
                       System.out.println("Opcion no valida");
                       break;
           }
       }while(var!=9);
    
    }
}
