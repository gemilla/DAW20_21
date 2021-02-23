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
public class Torre extends Pieza{

    public Torre(int color) {
        super(color);
        if (color ==0)
            nombre = "Tb"; //Unicode
        else
            nombre = "Tn";
        
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical()/*|| mov.esHorizontal()*/;
    }
    
}
