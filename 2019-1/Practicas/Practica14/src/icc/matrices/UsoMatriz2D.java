
package icc.matrices;

import icc.matrices.*;

public class UsoMatriz2D{

	/**
	 * Método que imprime los renglones, las columnas y la matriz.
	 * @param m Se pasa como parametro para saber sus dimensiones
	 * y verla en la terminal.
	 */

	public static void printmatrix(Matriz2D m){
		System.out.print("Renglones: " + m.getRenglones());
		System.out.println(" | Columnas: " + m.getColumnas());
		System.out.println(m);
	}

	/**
	 * Método Main, aqui se asigna el contenido que tendrán las matrices y además
	 * te muestra las operaciones en la terminal.
	 */

	public static void main(String[] args) {

		double [][] a = {{1,3},{2,2}}; //Aquí se modifican los valores de la matriz.
		Matriz2D matrix1 = new Matriz2D(a);
		System.out.println("Matriz A");
		printmatrix(matrix1);

		double [][] b = {{1,1},{2,4}}; //Aquí se modifican los valores de la matriz.
		Matriz2D matrix2 = new Matriz2D(b);
		System.out.println("Matriz B");
		printmatrix(matrix2);

		double escalar = 3; // Aquí se cambia el valor del escalar.

		System.out.println("A + B:\n" + matrix2.suma(matrix1));

		System.out.println("A - B:\n" + matrix2.resta(matrix1));

		System.out.println("A x B:\n" + matrix2.mult(matrix1));

		System.out.println("A x " + escalar + ":\n" + matrix1.multescalar(escalar));

		System.out.println("B x " + escalar + ":\n" + matrix2.multescalar(escalar));

	}

}
