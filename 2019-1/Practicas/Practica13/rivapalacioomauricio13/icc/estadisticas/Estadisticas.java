
package icc.estadisticas;

import icc.estadisticas.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Estadisticas{

	double [] array;
	double med;
	double var;

	/**
	 * Este método recibe un string con el nombre de un archivo y usando BufferedReader
	 * lee el contenido del archivo y agrega linea por linea su contenido a un arreglo.
	 * @param nombreArchivo Nombre del archivo que se quiere leer.
	 */

	public void cargaArreglo (String nombreArchivo){
	
		try{

			BufferedReader in = new BufferedReader(new FileReader(nombreArchivo));

			int contador = 0;
			String line;

			line = in.readLine();

			int n;
			n = Integer.parseInt(line);

			array = new double [n];

			while( (line = in.readLine()) != null) {
				//agregar elementos al arreglo
				double k = Double.parseDouble(line);
				array[contador++] = k;
			}

			for (int i = 0 ; i < array.length ; i++ ) {
				//System.out.println(a[i]);
			}

		} catch (FileNotFoundException e) {
			System.err.println("\nNo se encontró el archivo (" + nombreArchivo + ") ¿Olvidaste crearlo?\n");
		} catch (IOException ioe) {
			System.err.println("\nError al leer el contenido de texto.txt\n");
		}
	}

	/**
	 * El método media toma el arreglo que contiene los datos del archivo y calcula la
	 * media de los elementos del arreglo e imprime el resultado en la terminal.
	 */

	public void media(){

		double suma = 0;

		for(int i = 0; i < array.length; i++){
			suma += array[i];
		}

		med = (double) suma / array.length;

		System.out.println("Media:\t\t" + med);
	}

	/**
	 * El método varianza toma el arreglo que contiene los datos del archivo y calcula
	 * la varianza usando la media ya calculada y la imprime en la terminal.
	 */

	public void varianza(){

		double prevar = 0;

		for(int i = 0; i < array.length; i++){
			prevar += Math.pow((array[i] - med),2);
		}

		var = prevar / array.length;

		System.out.println("Varianza:\t" + var);
	}

}
