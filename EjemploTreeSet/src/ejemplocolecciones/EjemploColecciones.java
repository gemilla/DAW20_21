/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocolecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GEMA
 */
public class EjemploColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
                •	Añadir datos.
•	Listar todo el archivo.
•	Mostrar los campos de un registro a partir de su nombre.
•	Listar todos los registros de una población.
•	Listar todos los individuos que tengan más de una determinada edad.
•	Modificar la población de un determinado registro a partir de su nombre.
•	Generar un fichero de texto a partir del binario.
•	Generar un fichero binario a partir del de texto.
•	Ordenar fichero por Población 
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 11;

        Censo censoEspaña = new Censo();
        GestorFicheros.crearFicheros();
        do {
            System.out.println("----------------------");
            System.out.println("| OPCIONES           |");
            System.out.println("----------------------");
            System.out.println("| 1 Listar datos |");
            System.out.println("| 2 Añadir   |");
            System.out.println("| 3 Mostrar datos a partir del nombre|");
            System.out.println("| 4 Listar registros de una población    |");
            System.out.println("| 5 Listar mayores de una edad|");
            System.out.println("| 6 Modificar población de un registro a partir del nombre   |");
            System.out.println("| 7 Copia Seguridad Fichero Binario   |");
            System.out.println("| 8 Copia Seguridad Fichero Texto          |");
            System.out.println("| 9 Carga Fichero Texto (lectura)            |");
            System.out.println("| 10 Carga Fichero Binario (lectura)            |");
            System.out.println("----------------------");
            try {
                opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1:
                        censoEspaña.listar();
                        ArrayList<Individuo> lista = new ArrayList(censoEspaña.censo);
                        Collections.sort(lista,new porEdad());
                        System.out.println(lista);
                        break;

                    case 2:
                        censoEspaña.alta();
                        break;

                    case 3:
                        System.out.println("Dime nombre");
                        String nombre = br.readLine();
                        censoEspaña.mostrar(nombre);
                        break;

                    case 4:
                        System.out.println("Dime poblacion");
                        String poblacion = br.readLine();
                        censoEspaña.mostrarPoblacion(poblacion);
                        break;
                    case 5:
                        System.out.println("Dime edad");
                        int edad = Integer.parseInt(br.readLine());
                        censoEspaña.mostrarMayores(edad);
                        break;
                    case 6:
                        System.out.println("Dime nombre");
                        String nombre2 = br.readLine();
                        censoEspaña.mostrar(nombre2);
                        System.out.println("Dime poblacion nueva");
                        String poblacion2 = br.readLine();
                        censoEspaña.actualizarPoblacion(nombre2, poblacion2);
                        break;
                    case 7:
                        GestorFicheros.escribirFicheroBinario(GestorFicheros.FICHERO_BINARIO, censoEspaña);
                        break;
                    case 8:
                        GestorFicheros.escribirFicheroPW(GestorFicheros.FICHERO, censoEspaña.censo);
                        break;
                    case 9:
                        censoEspaña.censo = GestorFicheros.leerFichero(GestorFicheros.FICHERO);
                        break;
                    case 10:
                        censoEspaña = GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO);
                        break;
                    case 11:
                        System.out.println("Dime poblacion");
                        String poblacion3 = br.readLine();
                        censoEspaña.baja(poblacion3);
                }

            } catch (IOException ex) {
                Logger.getLogger(EjemploColecciones.class.getName()).log(Level.SEVERE, null, ex);
            }

        } while (opcion != 12);
    }

}
