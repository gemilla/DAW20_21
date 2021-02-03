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
       
        Punto pentagono [] = new Punto[5];
        //creación de los objetos
        for (int i = 0; i < pentagono.length; i++) {
            double x = (int)(Math.random()*100);
            double y = (int)(Math.random()*100);
            pentagono[i]= new Punto(x,y);            
        }
        for (int i = 0; i < pentagono.length; i++) {
            System.out.println(pentagono[i]);           
        }
                
        //mala práctica, para esto hacer el siguiente for
        for (int i = 0; i < pentagono.length; i++) {
            pentagono[i] = new Punto();
            pentagono[i].setX(i);
            pentagono[i].setY(i);
         }
        
        
        for (int i = 0; i < pentagono.length; i++) {
            pentagono[i] = new Punto(i,i);
        }
  
        for (int i = 0; i < pentagono.length; i++) {
            pentagono[i] = damePunto();
        }
        
        for (int i = 0; i < pentagono.length; i++) {
            System.out.println(pentagono[i].toString()+ " - ");
        }
}
    
}
