/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrezgrupoa;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class AjedrezGrupoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Juego juego = new Juego();
        Movimiento mov = null;
        juego.mostrarTurno();
        String jugada = new String();
        Scanner lector = new Scanner(System.in);
        do {
            System.out.println("Introduce jugada");
            jugada = lector.nextLine();
            System.out.println(jugada);
            mov = juego.dameMovimiento(jugada);
            
        } while (!jugada.equalsIgnoreCase("fin"));
    }

}
