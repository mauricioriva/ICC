
package icc.estadisticas;

import icc.estadisticas.*;
import java.lang.NullPointerException;
import java.lang.NumberFormatException;

public class UsoEstadisticas{

	/**
	 * Método main, recibe como argumento 1 elemento (archivo de texto), de los contrario lanza
	 * un mensaje al usuario. Se crea un objeto de la clase estadistica y se le aplican los
	 * 3 métodos de la clase que son para cargar el archivo, calcular la media y la varianza.
	 * @param args Recibe 1 argumento que sería un archivo de texto para aplicarle el método
	 * carga arreglo y leer con BufferedReader todo el contenido del documento.
	 */

	public static void main(String[] args) {

		Estadisticas calculo = new Estadisticas();

		String nombreArchivo;

		try {

			if(args.length == 1){
				nombreArchivo = (args[0]);
				System.out.println("\nLeyendo el archivo " + nombreArchivo);
				calculo.cargaArreglo(nombreArchivo);
				calculo.media();
				calculo.varianza();
				System.out.println();

			}
			else {
				System.out.println("\nError, ingresa unicamente el nombre de 1 archivo.\n");
			}

		} catch (NullPointerException npe) {
			System.err.println();
		} catch (NumberFormatException nfe) {
			System.err.println("\nEl contenido del archivo no es correcto.\n");
		}
	}

}
