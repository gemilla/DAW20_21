/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author GEMA
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un número para saber si es par o Impar");
        boolean letra;
        do{
            letra=false;
            try {
                int no = lector.nextInt();
                Comprobaciones.isPar(no);
            } catch (InputMismatchException ex) {
                letra = true;
                lector.nextLine();
                System.out.println("No puedes introducir una letra, tiene que ser un número");
                //System.out.println(ex.getMessage());
            } catch (ImparException | ParException ex) {
                System.out.println(ex.getMessage());
            }
        }while(letra==true);
        System.out.println("Vuelve pronto");
        //Logger.getLogger(JavaApplication11.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
}
