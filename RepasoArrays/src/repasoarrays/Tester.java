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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] lista = new int [10];
        OperacionesArrays.cargaAleatoria(lista);
        OperacionesArrays.listarContenido(lista);
        System.out.println(OperacionesArrays.calcularMedia(lista));
        OperacionesArrays.ordenar(lista);
        OperacionesArrays.listarContenido(lista);
        int copia[] = OperacionesArrays.copiaInvertida(lista);
        OperacionesArrays.listarContenido(copia);
        OperacionesArrays.listarContenido(lista);
        
    }
    
}
