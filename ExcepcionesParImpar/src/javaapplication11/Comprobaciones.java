/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author GEMA
 */
public class Comprobaciones {
   public static void isPar(int num) throws ParException, ImparException{
        if (num%2==0)
            throw new ParException();
        else 
            throw new ImparException("El número "+ num+ " es impar.");
    
    } 
}
