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
        Tablero tabla = new Tablero();
        do {
            tabla.pintarTablero();
            System.out.println("Introduce jugada");
            jugada = lector.nextLine();
            mov = juego.dameMovimiento(jugada);
            System.out.println(mov);
            //llamar a la pieza de la posicion inicial y preguntarle si puede realizar movimiento
        } while (!jugada.equalsIgnoreCase("fin"));
    }

}
