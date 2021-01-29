/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static Punto damePunto(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce coordenadas x e y del punto");
        double x, y;
        x= lector.nextDouble();
        y= lector.nextDouble();
        Punto punto = new Punto (x,y);
        return punto;
    }
    
    public static Punto damePunto2(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce coordenadas x e y del punto");
        return new Punto(lector.nextDouble(),lector.nextDouble());
       /* double x, y;
        x= lector.nextDouble();
        y= lector.nextDouble();
        Punto punto = new Punto (x,y);
        return punto;*/
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ " - ");
        }
        System.out.println("\n--------------");
        Punto [] listaPuntos = new Punto[5];
        
        /*
        //mala práctica, para esto hacer las líneas 35 a 37
        for (int i = 0; i < listaPuntos.length; i++) {
            listaPuntos[i] = new Punto();
            listaPuntos[i].setX(i);
            listaPuntos[i].setY(i);
            
        }*/
        
        /*
        for (int i = 0; i < listaPuntos.length; i++) {
            listaPuntos[i] = new Punto(i,i);
        }*/
  
        for (int i = 0; i < listaPuntos.length; i++) {
            listaPuntos[i] = damePunto();
        }
        
        for (int i = 0; i < listaPuntos.length; i++) {
            System.out.println(listaPuntos[i].toString()+ " - ");
        }    }
    
}
