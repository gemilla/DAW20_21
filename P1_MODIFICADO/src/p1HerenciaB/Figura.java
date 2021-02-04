/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1HerenciaB;

/**
 *
 * @author gema
 */
//Clase  Padre/Base/Generalización----Hijo/Derivada/Especialización

public abstract class Figura {
    protected int dimension;

    public Figura(int medida) {
        dimension = medida;
    }

    public Figura() {
        dimension = 10;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    
    public void mostrarInfo() {
		System.out.println(toString());
    }
    public abstract double calcularPerimetro();
    public abstract double calcularArea();
    
    
    public String dameNombre(){
        return "lado";
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" + dameNombre() + " "+ dimension + '}';
    }
    
}
