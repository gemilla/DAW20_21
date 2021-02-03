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
public class TesterCirculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cAinhoa = new Circulo(); //por defecto
        Punto centroEva = new Punto();
        Circulo cEva = new Circulo(centroEva,3);
        Circulo cClarisse = new Circulo (8,3,5);
        System.out.println(cAinhoa);
        System.out.println(cEva);
        cClarisse.mostrarInformación();
    }
    
}
