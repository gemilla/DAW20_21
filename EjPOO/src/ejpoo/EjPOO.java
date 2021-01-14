/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpoo;



/**
 *
 * @author gema
 */
public class EjPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora miCalculadora = new Calculadora();
        //miCalculadora.precio = 20;
        System.out.println(miCalculadora.precio);
        System.out.println(miCalculadora.conTapa);
        System.out.println(miCalculadora.getTipo());
        miCalculadora.precio=5;
        System.out.println(miCalculadora.precio);
        miCalculadora.setTipo("Programador");
        System.out.println(miCalculadora.getTipo());
        
        Calculadora topCalculadora = new Calculadora("Programador", 5, true);
        topCalculadora.mostrarDatos();
        System.out.println(topCalculadora.suma(6, 2));
    }
    
}
