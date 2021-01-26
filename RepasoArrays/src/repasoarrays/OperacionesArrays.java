/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoarrays;

import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class OperacionesArrays {
    public static void cargaAleatoria (int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }
    public static void cargaManual (int [] array){
        Scanner lector = new Scanner (System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el elemento " +(i+1));
            array[i] = lector.nextInt();
        }
    }
    public static void listarContenido (int [] array){
        System.out.println("---Visualizando contenido array----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" - ");
        }
        System.out.println("-------------");
    }
    public static double calcularMedia (int [] array){
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma+array[i];
        }
        return suma/array.length;
    }
}
