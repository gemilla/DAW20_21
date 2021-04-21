/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoexcepcionesmain;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Profesor
 */
public class GestionFicheros {

    public static void escribirFicheroPW(ArrayList<Elemento> palabras) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("prueba");
        for (int i = 0; i < palabras.size(); i++) {
            pw.println(palabras.get(i).toStringFichero());
        }
        pw.close();

    }

    public static void escribirFicheroPWArray(Elemento[] palabras) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("prueba");
        for (int i = 0; i < palabras.length; i++) {
            pw.println(palabras[i].toStringFichero());
        }
        pw.close();

    }

    public static ArrayList<Elemento> leerFicheroEscaner() throws FileNotFoundException, IOException {
        System.out.println("leyedo fichero....");
        ArrayList<Elemento> palabras = new ArrayList();
        //Scanner lf = new Scanner(new File("prueba")/*,"ISO-8859-1"*/);
        /*File fichero = new File("rita");
        if (!fichero.exists()) {
            System.out.println("Creando fichero nuevo....");
            fichero.createNewFile();
            escribirFicheroFW("rita");
        }*/
        Scanner lf = new Scanner(new File("prueba"));
        String cadena;
        while (lf.hasNextLine()) {
            cadena = lf.nextLine();
            String trozos[] = cadena.split(";");
            //System.out.println(cadena);
            Elemento elemento = new Elemento(trozos[1], trozos[0], (trozos[2]));
            palabras.add(elemento);
        }
        System.out.println("Fin de Fichero");
        lf.close();
        return palabras;

    }

    public static int lineasFichero() throws FileNotFoundException {
        int lineas = 0;
        Scanner lf = new Scanner(new File("prueba"));
        String cadena;
        while (lf.hasNextLine()) {
            lf.nextLine();
            lineas++;
        }
        System.out.println("Fin de Fichero");
        lf.close();
        return lineas;
    }
    
    public static int lineasFichero2() throws FileNotFoundException, IOException{
            BufferedReader bf = new BufferedReader(new FileReader(new File("prueba")));
            int n = (int)(bf.lines().count());
            bf.close();
            return n;
    }
    public static Elemento[] leerFicheroEscanerArray() throws FileNotFoundException {
        Elemento[] palabras = new Elemento[lineasFichero()];
        int i = 0;
        Scanner lf = new Scanner(new File("prueba"));
        String cadena;
        while (lf.hasNextLine()) {
            cadena = lf.nextLine();
            String trozos[] = cadena.split(";");
            //System.out.println(cadena);
            Elemento elemento = new Elemento(trozos[1], trozos[0], trozos[2]);
            palabras[i] = elemento;
            i++;
        }
        System.out.println("Fin de Fichero");
        lf.close();
        return palabras;

    }
    
    
}
