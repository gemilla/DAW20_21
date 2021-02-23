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
public class Juego {

    protected int turno; //0 blancas 1 negras

    public Juego() {
        turno = 0; //blancas (aunque no haría falta ponerlo)
    }

    public void mostrarTurno() {
        if (turno == 0) {
            System.out.println("Turno de Blancas");
        } else {
            System.out.println("Turno de Negras");
        }
    }

    public void cambiarTurno() {
        //0-> 1 y si es 1->0

    }

    public Movimiento validarJugada(String jugada) {
        //F4F5
        //Errores ->movimiento no se construya y devuelva un null
        //E1: F5FFF8 longitud string !=4-> error
        //E2: z4y2 A..F y 1..8
        //Comprobaciones del tipo hay pieza en la posicion inicial, si hay pieza en la posicion final que no sea del color de la inicial
        Movimiento mov = null;
        jugada = jugada.toUpperCase();
        char jugadaArray[] = jugada.toCharArray();
        //[0]-> COLUMNA DE LA POSICION INICIAL
        //[1]-> FILA DE LA POSICION INICIAL
        //[2]-> COLUMNA DE LA POSICION FINAL
        //[3]-> FILA DE LA POSICION FINAL
        //  Comprobamos que columnas están entre A y F
        //  Comprobamos que filas están entre 1 y 8
        //(Si primero traduces y luego compruebas la comprobación sería tanto para columnas como para filas 0..7)
        int colInicial = jugadaArray[0] - 65;
        int filInicial = jugadaArray[1] - 49;
        int colFinal = jugadaArray[2] - 65;
        int filFinal = jugadaArray[3] - 49;
        Posicion posInicial = new Posicion(filInicial, colInicial);
        Posicion posFinal = new Posicion(filFinal, colFinal);
        mov = new Movimiento(posInicial, posFinal);
        return mov;

    }
}
