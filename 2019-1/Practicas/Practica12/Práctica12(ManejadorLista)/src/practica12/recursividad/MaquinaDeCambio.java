
package practica12.recursividad;

import practica12.recursividad.*;
import practica12.util.*;

public class MaquinaDeCambio{

	private int contador;
	private ManejadordeLista lista;

/**
 * Método que dice cuantas iteraciones son hechas para calcular las posibilidades.
 * @param  cambio Le pasan un entero
 * @return        El número de iteraciones hechas para obtener todas las posibilidades de
 * un número dado.
 */

	public ManejadordeLista getCambio(int cambio){
		lista = new ManejadordeLista();
		contador = 0;
		Cambio c = new Cambio(1,1,1,1);
		Cambio a = new Cambio();
		getCambio(a,cambio,c);
		//System.out.println("Iteraciones: " + contador);
		return lista;
	}

/**
 * Método central del algoritmo, al cual le pasan 3 parametros.
 * @param actual   Es de tipo Cambio por lo que tiene 4 enteros dentro de esa variable y no
 * contiene nada a la primera llamada.
 * @param cantidad Entero que representa la cantidad ingresada por el usuario.
 * @param monedas  Es de tipo Cambio por lo que tiene 4 enteros dentro de esa variable, y
 * las 4 tienen el valor de 1.
 */

	public void getCambio(Cambio actual, int cantidad, Cambio monedas){
		int siguiente;
		Cambio aux;
		contador++;
		if(cantidad == 0){
			lista.agrega(actual);
		}else{
			siguiente = getNext(monedas,cantidad);
			if(siguiente != 0){
				aux = new Cambio(monedas);
				takeCoin(aux,siguiente);
				getCambio(new Cambio(actual),cantidad,aux);
				giveCoin(actual,siguiente);
				getCambio(actual,cantidad - siguiente, monedas);
			}
		}
	}

/**
 * Método que obtiene la siguiente posibilidad.
 * @param  a Es de tipo cambio por lo que contiene 4 enteros.
 * @param  b Entero pasado como parámetro.
 * @return   Regresa un entero con la denominacion de la moneda requerida.
 */

	public int getNext(Cambio a, int b){
		if(a.getNumDiez() > 0 && b >= 10){
			return 10;
		}else if (a.getNumCinco() > 0 && b >= 5){
			return 5;
		}else if (a.getNumDos() > 0 && b >= 2){
			return 2;
		}else if (a.getNumUno() > 0 && b >= 1){
			return 1;
		}else{
			return 0;
		}
	}

/**
 * Método que establece nuevos parametros a la cantidad de veces que usa una denominacion.
 * @param a Es de tipo cambio y contiene 4 enteros.
 * @param b Es un entero que define si se debe de reestablecer el parámetro o no.
 */

	public void takeCoin(Cambio a, int b){
		if(b == 10){
			a.setNumDiez(0);
		}else if(b == 5){
			a.setNumCinco(0);
		}else if(b == 2){
			a.setNumDos(0);
		}else if(b == 1){
			a.setNumUno(0);
		}
	}

/**
 * Método que da la moneda requerida al aumentarle 1.
 * @param a Es de tipo Cambio por lo que contiene 4 enteros.
 * @param b Un entero que dependiendo de este, da la moneda necesaria.
 */

	public void giveCoin(Cambio a, int b){
		if(b == 10){
			a.setNumDiez(a.getNumDiez()+1);
		}else if(b == 5){
			a.setNumCinco(a.getNumCinco()+1);
		}else if(b == 2){
			a.setNumDos(a.getNumDos()+1);
		}else if(b == 1){
			a.setNumUno(a.getNumUno()+1);
		}
	}

}
