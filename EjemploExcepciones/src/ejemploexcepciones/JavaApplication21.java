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
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.println("introduce número");
        boolean isNotNumber = false;
        int num=-1;
        do {
            try {
                isNotNumber = false;
                num = lector.nextInt();
            } catch (InputMismatchException e) {
                isNotNumber = true;
                System.out.println("introduce un número, no un carácter");
                lector.nextLine();//quitar el enter
            }
        } while (isNotNumber);
        System.out.println("Enhorabuena, has introducido un número, el "+ num);
        //excepción (ArrayIndexOutOfBoundsException) que no debería ser tratada, sino que debería programarse bien.
        int lista[] = new int[20];
        for (int i = 0; i <= lista.length; i++) {
            try {
                System.out.println(lista[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage() + e.getLocalizedMessage() + e.getClass().getSimpleName());
                System.out.println("---" + lista[i - 1]);
            }
        }
        //excepción que no debería ser tratada, sino que debería programarse bien.
        String cadena = null;
        try {
            System.out.println(cadena.length());
        } catch (NullPointerException e) {
            System.out.println("Longitud 0");
        }

    }

}
