/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author gema
 */
public class Punto {
    private double x;
    private double y;
    public Punto (double x, double y){
        this.x = x;
        this.y = y;
    }
    //constructor por defecto
    public Punto(){
       x = 5;
       y = 10;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    
    public void mostrarInformación(){
        System.out.println(toString());
    }
    
    public String toString(){
        String cadena = "Soy un punto y mis coordenadas son "+ x+ " y " + y;
        return cadena;
    }
    
    public double calcularDistanciaDesde(Punto otroPunto){
    double distancia = Math.sqrt(Math.pow(this.x-otroPunto.x, 2)+Math.pow(this.y-otroPunto.y, 2));
        return distancia;
    }
}
