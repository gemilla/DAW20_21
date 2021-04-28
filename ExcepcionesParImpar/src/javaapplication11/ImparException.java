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
public class ImparException extends Exception{ //verificada
    public ImparException(){
        super("El número es impar");
    }
    public ImparException(String mensaje){
        super(mensaje);
    }
}
