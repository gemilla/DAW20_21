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
        tablero[0][0] = new Torre(1);
        tablero[0][7] = new Torre(1);
        tablero[7][7] = new Torre(0);
        tablero[7][0] = new Torre(0);
        tablero[0][1] = new Caballo(1);
        tablero[0][6] = new Caballo(1);
        tablero[7][1] = new Caballo(0);
        tablero[7][6] = new Caballo(0);
        
        //for para peones, resto a mano
    }
    public void pintarTablero(){
        System.out.println(" A B C D E F G H");
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
    public void ponPieza (Posicion pos, Pieza pieza){
        ponPieza(pos.fila, pos.columna, pieza);
    }
    public void ponPieza (int fila,int columna, Pieza pieza){
        tablero[fila][columna]= pieza;
    }
    public void quitaPieza (Posicion pos){
        quitaPieza(pos.fila, pos.columna);
    }
    public void quitaPieza (int fila,int columna){
        tablero[fila][columna]= null;
    }
    
    public Pieza devuelvePieza(Posicion pos){
        return devuelvePieza(pos.fila, pos.columna);
    }
    public Pieza devuelvePieza(int fila, int columna){
        return tablero[fila][columna];
    }
    public boolean hayPieza(Posicion pos){
        return hayPieza(pos.fila, pos.columna);
    }
    public boolean hayPieza(int fila, int columna){
        return tablero[fila][columna]!=null;
    }
    
    
    public void mover(Movimiento mov){
        tablero[mov.posFin.fila][mov.posFin.columna]= tablero[mov.posIni.fila][mov.posIni.columna];
        tablero[mov.posIni.fila][mov.posIni.columna]= null;
    }
    
    public void mover2(Movimiento mov){//independizar código de almacenamiento
        ponPieza(mov.posFin, devuelvePieza(mov.posIni));
        quitaPieza(mov.posIni);
    }
    @Override
    public String toString() {
        return "Tablero{" + "tablero=" + tablero + '}';
    }
    
    
}
