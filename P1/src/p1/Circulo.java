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
    public Circulo (){
        centro = new Punto(12,12);
        radio = 12;
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
        System.out.println("Soy un circulo y mi centro es "+ centro.toString()+ " y de radio " + radio);
    }
    
    public String toString(){
        String cadena = "Soy un circulo y mi centro es "+ centro.toString()+ " y de radio " + radio;
        return cadena;
    }
}
