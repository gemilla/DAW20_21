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
public class Movimiento {
    protected Posicion posIni;
    protected Posicion posFin;

    public Movimiento(Posicion posIni, Posicion posFin) {
        this.posIni = posIni;
        this.posFin = posFin;
    }

    public Posicion getPosIni() {
        return posIni;
    }

    public void setPosIni(Posicion posIni) {
        this.posIni = posIni;
    }

    public Posicion getPosFin() {
        return posFin;
    }

    public void setPosFin(Posicion posFin) {
        this.posFin = posFin;
    }
    
    public boolean esVertical(){
        boolean respuesta = false;
        if (posIni.columna==posFin.columna)
            respuesta = true;
        return respuesta;
    }
    
    public boolean esHorizontal(){
        boolean respuesta = false;
        if (posIni.fila==posFin.fila)
            respuesta = true;
        return respuesta;
    }
   
    public boolean esDiagonal(){
        boolean respuesta= false;
        if (Math.abs(saltoVertical())==Math.abs(saltoHorizontal()))
            respuesta = true;
        return respuesta;
    }
    public int saltoVertical(){
        return posFin.fila-posIni.fila;
    }
    public int saltoHorizontal(){
        return posFin.columna-posIni.columna;
    }
    
    @Override
    public String toString() {
        return "Movimiento{" + "posIni=" + posIni + ", posFin=" + posFin + '}';
    }
    
    
}
