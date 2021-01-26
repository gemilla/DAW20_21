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
public class OperacionesArraysv2 {
    private int [] array;//null
    public OperacionesArraysv2(){
        array = new int[10];
    }
    public OperacionesArraysv2(int tamanyo){
        array = new int[tamanyo];
    }
    public void cargaAleatoria (){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
    }
    public void cargaManual (){
        Scanner lector = new Scanner (System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el elemento " +(i+1));
            array[i] = lector.nextInt();
        }
    }
    public void listarContenido (){
        System.out.println("---Visualizando contenido array----------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" - ");
        }
        System.out.println("-------------");
    }
    public double calcularMedia (){
        double suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma+array[i];
        }
        return suma/array.length;
    }
    public void ordenar(){
    boolean intercambio = true;
        while (intercambio==true) {
            intercambio = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int auxiliar = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = auxiliar;
                    intercambio = true;
                }
            }
    
    }
}
    public int [] copiaInvertida (){
        int [] copia = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copia[i] = array[array.length-i-1];
        }
        /*for (int i = array.length-1, j=0 ; j <copia.length; i--,j++) {
            copia[j] = array[i];
        }*/
        return copia;
    }
}
