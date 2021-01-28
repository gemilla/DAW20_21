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
       
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double nuevoX){
        x=nuevoX;
    }
    public  void mostrarInformación(){
        System.out.println(toString());
    }
    public String toString(){
        return "Punto y mis coordenadas son "+ x+ " y " + y;
        
    }
    public  double calcularDistanciaDesde(Punto otroPunto){
        double distancia = Math.sqrt(Math.pow(x-otroPunto.x, 2)+Math.pow(y-otroPunto.y, 2));
        return distancia;
    }
}
