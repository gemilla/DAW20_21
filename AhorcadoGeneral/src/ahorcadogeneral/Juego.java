/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogeneral;

/**
 *
 * @author gema
 */
public class Juego {
    protected String palabraAdivinar;
    protected int fallos;
    protected char [] palabraLetras;
    protected char [] rayas;

    public Juego(String palabraAdivinar, int fallos, char[] palabraLetras) {
        this.palabraAdivinar = palabraAdivinar;
        this.fallos = fallos;
        this.palabraLetras = palabraLetras;
    }

    public Juego() {
        fallos =7;
    }
    
    public void iniciarJuego(String palabraAdivinar){
        this.palabraAdivinar = palabraAdivinar;
        palabraLetras = palabraAdivinar.toCharArray();
        rayas = new char[palabraLetras.length];
        for (int i = 0; i < palabraLetras.length; i++) {
            palabraLetras[i]='_';
            
        }
        
       
    }
    public void bucleJuego(){
    //repite
    //imprimes rayas
    //pides letra, si es número lanza excepción
    //si está la sustituyes en rayas
    //si no, fallos--
    //pinta muñeco
    //mientras fallos>0;
    }
    
}
