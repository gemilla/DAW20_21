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
public class ParException extends RuntimeException{ //verificada
    public ParException(){
        super("El número es par");
    }
    public ParException(String mensaje){
        super(mensaje);
    }
}
