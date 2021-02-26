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
public class Caballo extends Pieza {

    public Caballo(int color, String nombre) {
        super(color, nombre);
    }
    public Caballo (int color){
        super(color);
    }
    @Override
    public boolean esValidoMovimiento(Movimiento mov) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal())==2 && Math.abs(mov.saltoVertical())==1)||(Math.abs(mov.saltoHorizontal())==1 && Math.abs(mov.saltoVertical())==2))
            respuesta=true;
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("Movimiento en L: 2,1 ó 1,2");
    }
    
}
