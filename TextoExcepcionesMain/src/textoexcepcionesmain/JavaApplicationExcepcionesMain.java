/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoexcepcionesmain;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class JavaApplicationExcepcionesMain {

    public static void escribirFicheroFW(String fichero) throws IOException {
        //FileWriter es hija de OutputStreamWriter, �til para escpecificar un Charset determinado
        Scanner lector = new Scanner(System.in);
        //FileWriter fw = new FileWriter("prueba",true);//para a�adir
        FileWriter fw = new FileWriter(fichero);

        String frase;
        do {
            System.out.println("introduce frase");
            frase = lector.nextLine();
            if (!frase.equals("fin")) {
                fw.write(frase);
                fw.write(10);
                //fw.write(System.getProperty(System.lineSeparator()));
            }
        } while (!frase.equals("fin"));
        fw.close();
    }

    public static void escribirFicheroPW() throws FileNotFoundException  {
        Scanner lector = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("prueba");
        String frase;
        do {
            System.out.println("introduce frase");
            frase = lector.nextLine();
            if (!frase.equals("fin")) {
                pw.println(frase);
                //pw.printf("%s\n", frase);
            }
        } while (!frase.equals("fin"));
        pw.close();

    }

    public static void escribirFicheroPWconservar() throws IOException {
        Scanner lector = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("prueba",true));
        String frase = "";
        do {
            System.out.println("introduce frase");
            frase = lector.nextLine();
            if (!frase.equals("fin")) {
                pw.println(frase);
            }
        } while (!frase.equals("fin"));
        pw.close();
    }
    
    public static void leerFicheroEscaner() throws FileNotFoundException, IOException {
        System.out.println("leyedo fichero....");
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
            //String trozos[] = cadena.split(";");
            System.out.println(cadena);
            //Elemento elemento = new Elemento (trozos[0],trozos[1],trozos[2]);
            //Y el diccionario que fuese un array de elementos.
            //System.out.println(elemento);
        }
        System.out.println("Fin de Fichero");
        lf.close();

    }

    public static void leerFicheroBRFR() throws IOException {
        System.out.println("leyedo fichero....");
        BufferedReader bf = new BufferedReader(new FileReader("prueba"));
        String cadena;
        do {
            cadena = bf.readLine();
            if (cadena != null) {
                System.out.println(cadena);
            }
        } while (cadena != null);
        
        bf.close();
    }

    public static void propiedadesFichero() {
        System.out.println("---Propiedades fichero:");
        File manejadorFichero = new File("prueba");
        System.out.println(manejadorFichero.canWrite());
        System.out.println(manejadorFichero.getAbsolutePath());
        System.out.println(manejadorFichero.length());
        System.out.println(manejadorFichero.lastModified());
        System.out.println(new Time(manejadorFichero.lastModified()));
    }

    /**
     * Ver diferencias entre que el main no trate las excepciones (1 y 2 Ev) y
     * que las trate(3v) Observar que FileNotFound es hija de IOException y que
     * el fichero es creado con un flujo de escritura ver para qu� sirve el
     * manejador File
     *
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //escribirFicheroFW("prueba");
            leerFicheroEscaner();
            //escribirFicheroPW();
            //leerFicheroBRFR();
            /* escribirFicheroPWconservar();
            leerFicheroBRFR();*/
            propiedadesFichero();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(JavaApplicationExcepcionesMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*public static void main(String[] args) {
        try {
            // TODO code application logic here
            escribirFicheroFW();
            leerFicheroEscaner();
            escribirFicheroPW();
            leerFicheroBRFR();
            escribirFicheroPWconservar();
            leerFicheroBRFR();
            propiedadesFichero();
        } catch (IOException ex) {
            Logger.getLogger(JavaApplicationExcepcionesMain.class.getName()).log(Level.SEVERE, null, ex);
            //Error de Entrada Salida
        }

    }
    public static void main(String[] args) {
        try {
            escribirFicheroFW();
            leerFicheroEscaner();
            escribirFicheroPW();
            leerFicheroBRFR();
            escribirFicheroPWconservar();
            leerFicheroBRFR();
            propiedadesFichero();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            Logger.getLogger(JavaApplicationExcepcionesMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
