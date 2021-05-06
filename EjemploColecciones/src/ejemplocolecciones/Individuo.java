/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocolecciones;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author GEMA
 */
public class Individuo implements Serializable, Comparable<Individuo>{
    protected int edad;
    protected String nombre;
    protected String poblacion;

    public Individuo(int edad, String nombre, String poblacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.poblacion = poblacion;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.edad;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.poblacion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
       boolean iguales = false;
       if (this.edad==((Individuo)obj).edad && this.nombre.equals(((Individuo)obj).nombre)&& this.poblacion.equals(((Individuo)obj).poblacion))
            iguales = true;
        
        return iguales;
        
    }
  
    @Override
    public String toString() {
        return String.format("%15s %4d %15s\n",nombre, edad, poblacion);
    }

     public String toStringFichero() {
        return edad + ";" + nombre + ";" + poblacion;
    }

    @Override
    public int compareTo(Individuo t) {
        return this.nombre.compareTo(t.nombre);
        //return this.edad-t.edad;
    }

   
    
}
