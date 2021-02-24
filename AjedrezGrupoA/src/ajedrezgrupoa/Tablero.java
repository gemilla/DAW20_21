/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrezgrupoa;

/**
 *
 * @author gema
 */
public class Tablero {
    protected Pieza [][] tablero;

    public Tablero(Pieza[][] tablero) {
        this.tablero = tablero;
    }

    public Tablero() {
        tablero = new Pieza[8][8];
        tablero[0][0] = new Torre(0);
        tablero[7][7] = new Torre(1);
        //for para peones, resto a mano
    }
    public void pintarTablero(){
        System.out.println("A  B  C  D  E  F  G  H");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i+1));
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j]!= null)
                    System.out.print(tablero[i][j].nombre+ " ");
                else
                    System.out.print("  ");
                
            }
            System.out.println("");
        }
    
    
    }
    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + '}';
    }
    
    
}
