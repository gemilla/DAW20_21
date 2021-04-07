/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones;

/**
 *
 * @author gema
 */
public class AhmedException extends Exception{

    public AhmedException() {
        super("El número 7 no se permite");
    }

    public AhmedException(String message) {
        super(message);
    }
    
}
