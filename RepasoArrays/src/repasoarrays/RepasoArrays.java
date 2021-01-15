/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoarrays;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class RepasoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[10]; //10 zonas de memoria para enteros que han sido inicializadas a 0.
        int[] numerosPersonalizado;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");
        int tamanyo = lector.nextInt();
        numerosPersonalizado = new int[tamanyo];

        //1a.Carga
        /* for (int i = 0; i < numeros.length; i++) {
        System.out.println("Introduce el elemento"+ (i+1));    
        numeros[i]= lector.nextInt();
    }*/
        //1b. Carga aleatoria
        for (int i = 0; i < numerosPersonalizado.length; i++) {
            numerosPersonalizado[i] = (int) (Math.random() * 101);
        }

        //2. Procesado
        //2a. Media de las posiciones pares
        /*int suma = 0;
    for (int i = 0; i < numerosPersonalizado.length; i = i+2) {
         suma = suma + numerosPersonalizado[i];
    }
    System.out.println("La media de las posiciones pares del array es:"+ suma/(numerosPersonalizado.length/2));*/
        //2b. Media de los elementos que sean múltiplos de dos
        int suma = 0, contadorPares = 0;
        for (int i = 0; i < numerosPersonalizado.length; i++) {
            if (numerosPersonalizado[i] % 2 == 0) {
                suma = suma + numerosPersonalizado[i];
                contadorPares++;
            }
        }
        if (contadorPares > 0) {
            System.out.println("La media de los elementos pares del array es:" + suma / contadorPares);
        } else {
            System.out.println("No hay elementos pares");
        }
        //2c. Copia invertida del array
        int[] copia = new int[numerosPersonalizado.length];
        for (int i = 0, indiceOrigen = numerosPersonalizado.length - 1; indiceOrigen >= 0; indiceOrigen--, i++) {
            copia[i] = numerosPersonalizado[indiceOrigen];
        }
        System.out.println("----------Array Invertido----------");

        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + "   ");
        }

        System.out.println("");
        System.out.println("----------Array Original----------");
        for (int i = 0; i < numerosPersonalizado.length; i++) {
            System.out.print(numerosPersonalizado[i] + "   ");
        }

        //2d.Ordenar ascendente (menor a mayor)
        /*int pasadas = 0;
        while (pasadas < numerosPersonalizado.length) {
            for (int i = 0; i < numerosPersonalizado.length - 1; i++) {
                if (numerosPersonalizado[i] > numerosPersonalizado[i + 1]) {
                    int auxiliar = numerosPersonalizado[i];
                    numerosPersonalizado[i] = numerosPersonalizado[i + 1];
                    numerosPersonalizado[i + 1] = auxiliar;
                }
            }
            pasadas++;
        }*/
        //2e.Ordenar descendente (mayor a menor) con booleano
        boolean intercambio = true;
        while (intercambio==true) {
            intercambio = false;
            for (int i = 0; i < numerosPersonalizado.length - 1; i++) {
                if (numerosPersonalizado[i] < numerosPersonalizado[i + 1]) {
                    int auxiliar = numerosPersonalizado[i];
                    numerosPersonalizado[i] = numerosPersonalizado[i + 1];
                    numerosPersonalizado[i + 1] = auxiliar;
                    intercambio = true;
                }
            }
            
        }

//3. Mostrar el contenido
        System.out.println("\n----------Array Original Ordenado----------");
        for (int i = 0; i < numerosPersonalizado.length; i++) {
            System.out.print(numerosPersonalizado[i] + "   ");
        }

    }

}
