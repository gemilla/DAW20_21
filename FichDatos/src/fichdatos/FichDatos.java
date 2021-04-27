package fichDatos;

import java.io.*;

/**
 * Clase que define m�todos est�ticos para operar con ficheros binarios de tipos
 * primitivos con la siguiente estructura:
 * 
 * ------------------------------------------------------------------------ |
 * double | int | char | double | int | char | double | int | char | ...
 * ------------------------------------------------------------------------
 */
public class FichDatos {

	/**
	 * Muestra por consola los contenidos del fichero nomFich
	 * 
	 * @param nomFich
	 *            nombre del fichero a leer
	 * @throws IOException
	 *             lanzada si ocurre alg�n error abriendo o leyendo el fichero
	 */
	public static void muestraPorConsola(String nomFich) throws IOException {
		// TODO: hacer por el alumno
	}

	/**
	 * Graba los datos en el fichero nomFich
	 * 
	 * @param nomFich
	 *            nombre del fichero a escribir
	 * @param reales
	 *            n�meros reales a escribir
	 * @param enteros
	 *            n�meros enteros a escribir
	 * @param cars
	 *            caracteres a escribir
	 * @throws IOException
	 *             lanzada si ocurre alg�n error abriendo o leyendo el fichero
	 */
	public static void graba(String nomFich, double[] reales, int[] enteros,
			char[] cars) throws IOException {
		// TODO: hacer por el alumno
                DataOutputStream ds = new DataOutputStream(new FileOutputStream(nomFich));
                ds.writeDouble(reales[0]);
	}

}
