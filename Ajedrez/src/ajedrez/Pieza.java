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
public abstract class Pieza {
    //recomendación poner para el color el mismo tipo que para el turno
    protected int color; //color 0-> blanca color 1 negra
    protected String nombre; //futuro unicode 

    public Pieza(int color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public Pieza(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "color=" + color + ", nombre=" + nombre + '}';
    }
    public abstract boolean validoMovimiento(Movimiento mov);
    
}
