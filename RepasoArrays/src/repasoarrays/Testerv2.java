/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoarrays;

/**
 *
 * @author gema
 */
public class Testerv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionesArraysv2 miArray = new OperacionesArraysv2(50);
        miArray.cargaAleatoria();
        miArray.listarContenido();
        System.out.println(miArray.calcularMedia());
        miArray.ordenar();
        miArray.listarContenido();
        int copia[] = miArray.copiaInvertida();
        miArray.listarContenido();
        miArray.listarContenido();
        
    }
    
}
