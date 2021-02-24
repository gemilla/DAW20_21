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
public class Juego {

    protected int turno;//0->blancas 1->negras
    
    public Juego(int turno) {
        this.turno = turno;
    }

    public Juego() {

    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    public void mostrarTurno(){
    if (turno==0)
            System.out.println("Turno de Blancas");
    else
            System.out.println("Turno de Negras");
    
    }
    
    public Movimiento dameMovimiento(String jugada){
        Movimiento mov = null;
        if (jugada.length()!=4)
            System.out.println("Error. La jugada debe tener solo 4 letras: columna inicial (A..F), fila inicial (1..8),columna final (A..F), fila final (1..8)");
        //charAt(0)
        jugada = jugada.toUpperCase();
        char [] jugadaChar = jugada.toCharArray();
        //A..H 0..7
        if ((jugadaChar[0]<'A' || jugadaChar[0]>'H')||(jugadaChar[2]<'A' || jugadaChar[2]>'H')||(jugadaChar[1]< '1' || jugadaChar[1]>'8')||(jugadaChar[3]< '1' || jugadaChar[3]>'8'))
            System.out.println("Error. Las columnas A..F y filas 1..8");
        if ((jugadaChar[0]< 65 || jugadaChar[0]>72)||(jugadaChar[2]<65 || jugadaChar[2]>72)||(jugadaChar[1]< 49 || jugadaChar[1]>56)||(jugadaChar[3]< 49 || jugadaChar[3]>56))
        return mov;
    
    
    }
    
    @Override
    public String toString() {
        return "Juego{" + "turno=" + turno + '}';
    }

}
