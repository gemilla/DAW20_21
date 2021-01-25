package exrecuperacion;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[] vacunas = new int[30];
        int[] copia = new int[vacunas.length];
        int opcion;
        int suma = 0;
        System.out.println("Elige una opcion");
        System.out.println("1.Forma aleatoria");
        System.out.println("2.Forma manual");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                for (int i = 0; i < vacunas.length; i++) {
                    //vacunas[i] = (int) (Math.random() * 101);
                    vacunas[i] = (int) (Math.random() * 30-25); //(int) (Math.random() * (5-(-25))+(-25));
                }
                break;
            case 2:
                for (int i = 0; i < vacunas.length; i++) {
                    System.out.println("Escribe el numero de vacunas del dia " + (i + 1));
                    vacunas[i] = sc.nextInt();
                }

        }
        for (int i = 0; i < vacunas.length; i++) {
            System.out.print("    " + vacunas[i]);
        }

        System.out.println();
        suma=0;
        for (int i = 0; i < vacunas.length; i++) {
            suma = suma + vacunas[i];
        }
        System.out.println("La media de vacunas al dia es de " + suma / 30);
        
        for (int i = 0; i < copia.length; i++) {
            copia[i] = vacunas[i];

        }
        boolean intercambio = true;
        while (intercambio==true) {
            intercambio = false;
            for (int i = 0; i < copia.length - 1; i++) {
                if (copia[i] > copia[i + 1]) {
                    int auxiliar = copia[i];
                    copia[i] = copia[i + 1];
                    copia[i + 1] = auxiliar;
                    intercambio = true;
                }
            }
            
        }
        System.out.println();
        for (int i = 0; i < copia.length; i++) {
            System.out.print(" " + copia[i]);
        }
        System.out.println();
        int contadorNegativas=0;
        for (int i = 0; i < vacunas.length; i++) {
            /*if (vacunas[i] == 0) {
                System.out.println("El dia que no se pusieron vacunas fue el " + (i+1));
            }*/
            if (vacunas[i] < 0){
                contadorNegativas++;
                System.out.println("El dia " + (i+1) + " la temperatura fue negativa");
            }
        }
        System.out.println("Hubo "+ contadorNegativas + " días con temperatura negativa en total");
    }
}
