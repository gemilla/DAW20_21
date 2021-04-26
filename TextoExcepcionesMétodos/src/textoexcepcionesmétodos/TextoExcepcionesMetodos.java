/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoexcepcionesmétodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gema
 */
public class TextoExcepcionesMetodos {

    public static final String NOMBRE_FICHERO = "prueba";

    public static void escribirFicheroFW() {
        //FileWriter es hija de OutputStreamWriter, �til para escpecificar un Charset determinado
        escribirFicheroFW(NOMBRE_FICHERO);

    }

    public static void escribirFicheroFW(String fichero) {
        //FileWriter es hija de OutputStreamWriter, �til para escpecificar un Charset determinado
        Scanner lector = new Scanner(System.in);

        FileWriter fw;
        try {
            fw = new FileWriter(fichero);

            String frase = "";
            do {
                System.out.println("introduce frase");
                frase = lector.nextLine();
                if (!frase.equals("fin")) {
                    fw.write(frase);
                    fw.write(10);
                    //       System.out.println(frase);
                }
            } while (!frase.equals("fin"));
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error de E/S" + ex.getMessage());
        }
    }

    public static void escribirFicheroPW() {
        Scanner lector = new Scanner(System.in);

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(NOMBRE_FICHERO);
            String frase = "";
            do {
                System.out.println("introduce frase");
                frase = lector.nextLine();
                if (!frase.equals("fin")) {
                    pw.println(frase);
                    //       System.out.println(frase);
                }
            } while (!frase.equals("fin"));
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(TextoExcepcionesMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void escribirFicheroPWconservar() {
        Scanner lector = new Scanner(System.in);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(NOMBRE_FICHERO, true));
            String frase = "";
            do {
                System.out.println("introduce frase");
                frase = lector.nextLine();
                if (!frase.equals("fin")) {
                    pw.println(frase);
                    //       System.out.println(frase);
                }
            } while (!frase.equals("fin"));
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(TextoExcepcionesMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void leerFicheroEscaner() {
        System.out.println("leyedo fichero....");
        try {
            Scanner lf = new Scanner(new File(NOMBRE_FICHERO)/*,"ISO-8859-1"*/);
            String cadena;
            int contLineas = 0;
            while (lf.hasNextLine()) {
                cadena = lf.nextLine();
                //System.out.println(cadena);
                contLineas++;
            }
            System.out.println(contLineas);
            lf.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        }
    }

    public static void leerFicheroBRFR() {
        System.out.println("leyedo fichero....");
        BufferedReader bf;
        try {
            bf = new BufferedReader(new FileReader(new File(NOMBRE_FICHERO)));
            String cadena;
            do {
                cadena = bf.readLine();
                if (cadena != null) {
                    System.out.println(cadena);
                }
            } while (cadena != null);
            bf.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TextoExcepcionesMetodos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Fichero no encontrado.");
        } catch (IOException ex) {
            Logger.getLogger(TextoExcepcionesMetodos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error de E/S");
        }
    }


/**
 * Observar la diferencia de tratar las excepciones en cada m�todo. Permite
 * hacer un tratamiento m�s cercano a donde ocurre el error y continuar con el
 * programa.
 *
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
        escribirFicheroFW();
        leerFicheroEscaner();
        /* escribirFicheroPW();
        leerFicheroBRFR();
        escribirFicheroPWconservar();
        leerFicheroBRFR();*/

    }

}
