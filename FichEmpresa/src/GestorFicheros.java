/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Profesor
 */
public class GestorFicheros {

    //Esta clase nos permite crear ficheros si no existen así como escribir y leerlos. 
    public static final String FICHERO_TRABAJADORES = "Trabajadores";
    public static final String FICHERO_BINARIO_TRABAJADORES = "TrabajadoresBinario";

    public static void crearFicheros() {
        File f = new File(FICHERO_TRABAJADORES);
        File f2 = new File(FICHERO_BINARIO_TRABAJADORES);
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            if (!f2.exists()) {
                f2.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribirFicheroPW(String fichero, Trabajador[] lista) {

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(fichero);
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != null) //pw.println(lista[i]);
                {
                    pw.println(lista[i].toStringFichero());
                }
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        }

    }

    public static void escribirFicheroPWEmpresa(String fichero, Empresa emp) {

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(fichero);
            for (int i = 0; i < emp.trabajadores.length; i++) {
                if (emp.trabajadores[i] != null) //pw.println(lista[i]);
                {
                    pw.println(emp.trabajadores[i].toStringFichero());
                }
            }
            pw.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        }

    }

    public static int lineasFichero(String fichero) {
        int cont = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File(fichero)));
            /*
            //método 1
            String cadena;
            do {
                cadena = bf.readLine();
                if (cadena != null) {
                    cont++;
                }
            } while (cadena != null);*/
            //método 2
            cont = (int) bf.lines().count();
            bf.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestorFicheros.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }

    /**
     * Este método permite cargar en RAM los trabajadores que hay en el fichero
     *
     * @param fichero que contiene los trabajadores
     * @return array de trabajadores construido a partir del contenido del
     * fichero
     */
    public static Trabajador[] leerFicheroEscaner(String fichero) {
        System.out.println("leyedo fichero....");
        Trabajador[] lista = new Trabajador[GestorFicheros.lineasFichero(fichero)];

        try {
            Scanner lf = new Scanner(new File(fichero)/*,"ISO-8859-1"*/);
            String cadena;

            for (int i = 0; lf.hasNextLine(); i++) {
                cadena = lf.nextLine();
                String trozos[] = cadena.split(";");
                if (trozos[0].equalsIgnoreCase("Programador")) //public Programador(boolean experienciaPOO, String NIF, StringBuilder lenguajes, String nombre, String departamento, Fecha fecha, double sueldoBase)    
                //Programador;TESTER;1H;IT2;10/06/2040;1391.7458915536479;true;JAVA:PHYTON
                //0;1;2;3;4;5;6
                {
                    lista[i] = new Programador(Boolean.parseBoolean(trozos[6]), trozos[2], new StringBuilder(trozos[7]), trozos[1], trozos[3], new Fecha(trozos[4]), Double.parseDouble(trozos[5]));
                } else {
                    lista[i] = new JefeProyecto();//falta hacerlo con los datos del fichero
                }
                //cambiar de Scanner a BufferReader   

            }

            lf.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado" + ex.getMessage());
        }
        return lista;
    }
//Escribir y Leer Ficheros Binario, el array completo de una vez

    public static void escribirFicheroBinario(String fichero, Trabajador[] lista) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            os.writeObject(lista);
            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Trabajador[] leerFicheroBinario(String fichero) {
        Trabajador[] lista = null;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            lista = (Trabajador[]) os.readObject();
            os.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Clase Trabajador [] no encontrada");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }
//Escribir y Leer Ficheros Binario, elemento por elemento

    public static void escribirFicheroBinarioUnoPorUno(String fichero, Trabajador[] lista) {
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fichero));
            for (int i = 0; i < lista.length; i++) {
                if (lista[i] != null) {
                    os.writeObject(lista[i]);
                }
            }

            os.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Trabajador[] leerFicheroBinarioUnoPorUno(String fichero) {
        Trabajador[] lista = new Trabajador[10];
        boolean EOF = false;
        int i = 0;
        try {
            ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));
            while (!EOF) {
                lista[i] = (Trabajador) os.readObject();
                i++;
            }
            os.close();
        } catch (EOFException e) {
            EOF = true;
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "Clase Trabajador [] no encontrada");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

}
