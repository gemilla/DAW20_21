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
public class Circulo {
    private Punto centro;
    private double radio;
    
    public Circulo (Punto centro, double radio){
        this.centro = centro;
        this.radio = radio;
    }
    
    public Circulo (double x,double y, double radio){
        //this(new Punto(x,y),radio);
        this.centro = new Punto(x,y);
        this.radio = radio;
    }
    
    public Circulo (){
        //this(12,12,12);
        this.centro = new Punto(12,12);
        this.radio = 12;
    }
    public Punto getCentro(){
        return centro;
    }
    public double getRadio(){
        return radio;
    }
    public double calcularDistanciaDesde(Punto otroPunto){
    double distancia = centro.calcularDistanciaDesde(otroPunto);
        return distancia;
    }
    public double calcularArea (){
        return Math.PI*radio*radio;
    }
    public double calcularPerimetro (){
        return 2*Math.PI*radio;
    }
     public void mostrarInformación(){
        System.out.println(toString());
    }
    
    @Override
    public String toString(){
        String cadena = "Soy un circulo y mi centro es "+ centro.toString()+ " y de radio " + radio;
        return cadena;
    }
}
