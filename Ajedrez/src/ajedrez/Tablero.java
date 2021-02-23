/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author gema
 */
public class Tablero {

    protected Pieza[][] tablero;

    public Tablero() {
        tablero = new Pieza[8][8];
        /*for (int i = 0; i < tablero.length; i++) {
            tablero[1][i] = new Peon (0);*/
        tablero[0][0] = new Torre(0);

        //completar        
    }

    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j].nombre + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }
}
