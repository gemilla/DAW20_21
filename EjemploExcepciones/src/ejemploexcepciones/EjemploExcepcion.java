/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gema
 */
//ojo Excepción propia de Ahmed
public class EjemploExcepcion {

    public static void comprobacion(int numero) throws AhmedException {
        if (numero==7)
            throw new AhmedException();
    
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numero=0;

        


        boolean error;
        do {
            error = false;
            System.out.println("Introduce un número: 1,2 o 3");
            try {
                numero = lector.nextInt();
                comprobacion(numero);
                System.out.println("El numero introducido es:" + numero);
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("1, 2 o 3 por favor");
                lector.nextLine();//limpiar el 
                    System.out.println(e.getCause());
            System.out.println(e.getMessage());
        
            } catch (AhmedException ex) {
                System.out.println(ex.getMessage());
            } 
        } while (error == true || numero>=4 || numero <1);
         
    }
}
