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

    @Override
    public String toString() {
        return "Movimiento{" + "posIni=" + posIni + ", posFin=" + posFin + '}';
    }
    
    
}
