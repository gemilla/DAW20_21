/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author GEMA
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Faltaría hacer el menú
       
        //GestorFicheros.crearFicheros();
        Empresa empresa = new Empresa(5);
        empresa.listarTrabajadores();
        //GestorFicheros.escribirFicheroPW(GestorFicheros.FICHERO_TRABAJADORES, empresa.trabajadores);
        System.out.println("-------------------------------------");
        /*empresa= null;
        empresa = new Empresa(GestorFicheros.leerFicheroEscaner(GestorFicheros.FICHERO_TRABAJADORES));*/
        //empresa.setTrabajadores(GestorFicheros.leerFicheroEscaner(GestorFicheros.FICHERO_TRABAJADORES));
        //empresa.listarTrabajadores();
        
        GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO_TRABAJADORES, empresa.trabajadores);
        System.out.println("-------------------------------------");
        
        Trabajador [] grupo=GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO_TRABAJADORES);
        System.out.println(Arrays.toString(grupo));
        System.out.println(grupo.length);
        
        
        
        /*GestorFicheros.escribirFicheroBinarioUnoPorUno(GestorFicheros.FICHERO_BINARIO_TRABAJADORES, empresa.trabajadores);
        System.out.println("-------------------------------------");
        
        Trabajador [] grupo2=GestorFicheros.leerFicheroBinarioUnoPorUno(GestorFicheros.FICHERO_BINARIO_TRABAJADORES);
        System.out.println(Arrays.toString(grupo2));
        System.out.println(grupo2.length);
       */
       }

}
