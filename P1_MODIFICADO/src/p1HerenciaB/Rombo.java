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
public class Rombo extends Figura{
    public Rombo(int medida) {
        super(medida);
    }

    public Rombo() {
        super(2);
    }
    @Override
    public double calcularPerimetro() {
        return 4*dimension;
    }

    @Override
    public double calcularArea() {
        return 10000; //implementar la fórmula con cálculo de diagonales a partir de lado
    }

   
    
    
}
