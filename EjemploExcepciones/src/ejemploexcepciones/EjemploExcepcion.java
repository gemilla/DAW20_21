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
            throw new AhmedException("77777777777777777 no");
    
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int numero = 0;
        boolean error;
        do {
            error = false;
            System.out.println("Introduce un número: 1,2 o 3, nunca el 7");
            try {
                numero = lector.nextInt();
                comprobacion(numero);
                System.out.println("El numero introducido es:" + numero);
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("1, 2 o 3 por favor, nunca el 7");
                lector.nextLine();
            } 
        } while (error == true || numero>=4 || numero <1);

    }
}
