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
public class Torre extends Pieza {

    public Torre(int color, String nombre) {
        super(color, nombre);
    }
    public Torre (int color){
        super(color);
    }
    @Override
    public boolean esValidoMovimiento(Movimiento mov, Tablero tabla) {
        boolean respuesta = false;
        if (mov.esVertical() || mov.esHorizontal())
            respuesta=true;
        return respuesta;
    }

    @Override
    public void informarMovimiento() {
        System.out.println("Horizontal o Vertical");
    }
    
}
