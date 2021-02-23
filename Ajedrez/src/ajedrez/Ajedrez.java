/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.util.Scanner;

/**
 *
 * @author gema
 */
public class Ajedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        Juego juego = new Juego();
        juego.mostrarTurno();
        Movimiento mov = null;
        Tablero tablero = new Tablero();
        do {
            tablero.pintarTablero();
            System.out.println("Introduce jugada");
            String cadena = new String();
            cadena = lector.nextLine();
            mov = juego.validarJugada(cadena);
            System.out.println(mov);
        } while (mov == null);
 //pieza es valido este movimiento?
    }

}
