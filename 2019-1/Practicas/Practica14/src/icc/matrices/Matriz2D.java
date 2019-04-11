
package icc.matrices;

import icc.matrices.*;

public class Matriz2D{

	private double matriz [] [];

	/**
	 * Constructor 1, que recibe cuantos renglones y columnas que tiene la matriz.
	 * @param renglones El numero de renglones de la matriz.
	 * @param columnas  El numero de columnas de la matriz.
	 */

	public Matriz2D(int renglones, int columnas){
		matriz = new double [renglones] [columnas];
	}

	/**
	 * Constructor 2, el cual asigna los valores de un arreglo y los mete
	 * a una matriz.
	 * @param a Arreglo de 2 dimensiones.
	 */

	public Matriz2D(double a [][]){
		matriz = datos(a).matriz;
	}

	/**
	 * Getter.
	 * @return Te dice el numero de renglones de una matriz.
	 */

	public int getRenglones(){
		return matriz.length;
	}

	/**
	 * Getter
	 * @return Te dice el numero de columnas de una matriz.
	 */

	public int getColumnas () {
		if (matriz.length > 0) {
			return matriz[0].length;
		}
		else {
			return 0;
		}
	}

	/**
	 * Método toString para imprimir las matrices de una manera más convencional.
	 * @return Una matriz más convencional.
	 */

	public String toString(){
		String aux = "";
		for (int i = 0 ; i < matriz.length ; i++ ) {
			aux += "|";
			for (int j = 0 ; j < matriz[i].length ; j++ ) {
				aux += " " + matriz[i][j] + " ";
			}
			aux += "|\n";
		}
		return aux;
	}

	/**
	 * Este método dado un arreglo ingresa sus valores y los mete a una matriz.
	 * @param  k Arreglo con los datos.
	 * @return   Una matriz con los datos del arreglo.
	 */

	public static Matriz2D datos(double [][] k){
		Matriz2D data = new Matriz2D(k.length , k[0].length);
		for (int i = 0; i < k.length ; i++ ) {
			for (int j = 0; j < k[0].length ; j++ ) {
				data.matriz [i][j] = k[i][j];
			}
		}
		return data;
	}

	/**
	 * Este método suma matrices.
	 * @param  m Recibe una matriz a sumar con la que se encuentra como objeto en
	 * la clase.
	 * @return   Una matriz con el resultado de la suma.
	 */

	public Matriz2D suma(Matriz2D m){
		double [][] q = new double [matriz.length][matriz[0].length];
		if ((m.matriz.length == matriz.length) && (m.matriz[0].length == matriz[0].length) ) {
			for (int i = 0; i < q.length ; i++ ) {
				for (int j = 0; j < q[0].length ; j++ ) {
					q [i][j] = m.matriz[i][j] + matriz[i][j];
				}
			}
		} else{
			System.err.println("Error en la suma, las matrices tienen que ser cuadradas.");
		}

		Matriz2D res = new Matriz2D(q);

		return res;
	}

	/**
	 * Este método resta matrices.
	 * @param  m Recibe una matriz a restar con la que se encuentra como objeto en
	 * la clase.
	 * @return   Una matriz con el resultado de la resta.
	 */

	public Matriz2D resta(Matriz2D m){
		double [][] q = new double [matriz.length][matriz[0].length];
		if ((m.matriz.length == matriz.length) && (m.matriz[0].length == matriz[0].length) ) {
			for (int i = 0; i < q.length ; i++ ) {
				for (int j = 0; j < q[0].length ; j++ ) {
					q [i][j] = m.matriz[i][j] - matriz[i][j];
				}
			}
		} else{
			System.err.println("Error en la resta, las matrices tienen que ser cuadradas.");
		}

		Matriz2D res = new Matriz2D(q);

		return res;
	}

	/**
	 * Método que multiplica matrices.
	 * @param  acruzb Recibe una matriz y la multiplica con la matriz que
	 * se encuentra como objeto en la clase.
	 * @return        Una matriz con el resultado del producto.
	 */

	public Matriz2D mult(Matriz2D acruzb){
		double s [][] = new double [matriz.length][acruzb.matriz[0].length];
		for (int i = 0; i < s.length ; i++ ) {
			for (int j = 0; j < s[0].length ; j++ ) {
				for (int a = 0; a < s[0].length ; a++ ) {
					s [j][i] += matriz [a][i] * acruzb.matriz [j][a];
				}
			}
		}

		Matriz2D producto = new Matriz2D(s);
		return producto;
	}

	/**
	 * Método que multiplica un valor(escalar) a una matriz.
	 * @param  e Número que multiplica a cada uno de los elementos de la matriz.
	 * @return   Una matriz multiplicada por un escalar.
	 */

	public Matriz2D multescalar(double e){
		double d [][] = new double [matriz.length][matriz[0].length];
		for (int i = 0; i < d.length ; i++ ) {
			for (int j = 0; j < d[0].length ; j++ ) {
				d[i][j] = matriz [i][j] * e;
			}
		}

		Matriz2D esc = new Matriz2D(d);
		return esc;
	}

}
