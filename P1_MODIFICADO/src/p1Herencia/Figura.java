/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1Herencia;

/**
 *
 * @author gema
 */
public abstract class Figura {
    protected int linea;

    public Figura(int linea) {
        this.linea = linea;
    }

    public Figura() {
        linea = 5;
    }

    public int getLinea() {
        return linea;
    }
    
    public abstract String dameCaracteristica();
    public abstract double dameArea();
    public abstract double damePerimetro();
    
    public void setLinea(int linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Figura "+getClass().getSimpleName()+"{" + dameCaracteristica() + linea + '}';
    }
    public void mostrarInfo() {
        System.out.println(toString());
    }
}
