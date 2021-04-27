package fichDatos;

import java.io.IOException;

public class PruFichDatos {

	/**
	 * Prueba la clase FichDatos
	 */
	public static void main(String[] args) {
		final String nomFich = "datos.dat";
		
		double[] reales = {1, 2, 3, 4};
		int[] enteros = {11, 12, 13, 14};
		char[] cars = {'a', 'b', 'c', 'd'};
		
		try {		
			// graba datos en el fichero
			FichDatos.graba(nomFich, reales, enteros, cars);
			
			// muestra los contenidos del fichero
			FichDatos.muestraPorConsola(nomFich);
			
		} catch (IOException e) {
			System.out.println("Error accediendo al fichero " + e);
		}
	}

}
