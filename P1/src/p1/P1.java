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
public class P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto punto1 = new Punto();
        punto1.mostrarInformación();
        Punto punto2 = new Punto(10,10);
        String cadena = punto2.toString();
        System.out.println(cadena);
        System.out.println(punto2.getX());
        /*if (punto2.getX()==10 && punto2.getY()==10)
            System.out.println("Ese punto está en la recta que divide el primer cuadrante");*/
        System.out.println(punto2.getY());
        Circulo circulo1 = new Circulo (punto2, 90);
        Punto centro = new Punto(5,3);
        double radio = 20;
        Circulo circulo2 = new Circulo (centro,radio);
        System.out.println(circulo2.calcularDistanciaDesde(punto1));
        circulo2.mostrarInformación();
        
        
    }
    
}
