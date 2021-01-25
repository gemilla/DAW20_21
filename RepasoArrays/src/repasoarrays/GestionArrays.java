/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoarrays;

/**
 *
 * @author alvaro
 */
public class GestionArrays {
    public void cargaArray(int array[]){
    for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
   }
}
