/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gema
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce número");
        try {
            int num = lector.nextInt();
            System.out.println("El número introducido es " + num);
            String cadena = null;
            System.out.println(cadena.length());
            int lista[] = new int[10];
            System.out.println(lista[1000]);
        } catch (InputMismatchException e) {//excepción más específica primero
            System.out.println("Por favor no introduzcas una letra, sólo un número");
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.getClass().getSimpleName());
            System.out.println("La posicion " + exc.getMessage() + " no es valida");
        } catch (Exception exception) {
            System.out.println(exception.getClass().getSimpleName());
            //System.err.println("en rojo");
        }
        System.out.println("Hemos entendido las excepciones?");

    }

}
