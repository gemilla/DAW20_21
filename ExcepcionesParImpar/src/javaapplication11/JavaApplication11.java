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
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Comprobaciones.isPar(10);
        } catch (ParException | ImparException ex) {
            //Logger.getLogger(JavaApplication11.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        System.out.println("Vuelve pronto");
        //Logger.getLogger(JavaApplication11.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
}
