
package practica12.recursividad;

import practica12.recursividad.*;
import practica12.util.*;

public class Cambio{

	int numDiez;
	int numCinco;
	int numDos;
	int numUno;

/**
 * Primer Constructor, recibe 4 enteros y cada uno correspondiente al número de veces que
 * se utilizó en esa posibilidad.
 * @param numDiez  Cantidad de monedas de 10.
 * @param numCinco Cantidad de monedas de 5.
 * @param numDos   Cantidad de monedas de 2.
 * @param numUno   Cantidad de monedas de 1.
 */

	public Cambio(int numDiez, int numCinco, int numDos, int numUno){
		this.numDiez = numDiez;
		this.numCinco = numCinco;
		this.numDos = numDos;
		this.numUno = numUno;
	}

/**
 * Segundo Constructor.
 * @param c Recibe un objeto de tipo cambio y lo apunta a los 4 parámetros.
 */

	public Cambio(Cambio c){
		this(c.numDiez,c.numCinco,c.numDos,c.numUno);
	}

/**
 * Tercer Constructor, no recibe ningun parámetro y establece que los parametros
 * locales valen cero cada uno.
 */

	public Cambio(){
		this(0,0,0,0);
	}

/**
 * Getter.
 * @return La cantidad de monedas de diez.
 */

	public int getNumDiez(){
		return numDiez;
	}

/**
 * Getter.
 * @return La cantidad de monedas de cinco.
 */

	public int getNumCinco(){
		return numCinco;
	}

/**
 * Getter.
 * @return La cantidad de monedas de dos.
 */

	public int getNumDos(){
		return numDos;
	}

/**
 * Getter.
 * @return La cantidad de monedas de uno.
 */

	public int getNumUno(){
		return numUno;
	}

/**
 * Setter
 * @param numDiez Ajusta el objeto a un nuevo contenido dado.
 */

	public void setNumDiez(int numDiez){
		this.numDiez = numDiez;
	}

/**
 * Setter
 * @param numDiez Ajusta el objeto a un nuevo contenido dado.
 */

	public void setNumCinco(int numCinco){
		this.numCinco = numCinco;
	}

/**
 * Setter
 * @param numDiez Ajusta el objeto a un nuevo contenido dado.
 */

	public void setNumDos(int numDos){
		this.numDos = numDos;
	}

/**
 * Setter
 * @param numDiez Ajusta el objeto a un nuevo contenido dado.
 */

	public void setNumUno(int numUno){
		this.numUno = numUno;
	}

/**
 * Método toString
 * @return La posibilidad de forma entendible al usuario.
 */

	public String toString(){
		return "[Coins of 10:" + numDiez + ", Coins of 5:" + numCinco + ", Coins of 2:" + numDos + ", Coins of 1:" + numUno + "]";
	}

}
