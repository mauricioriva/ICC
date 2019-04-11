
package practica12.util;

import practica12.recursividad.*;
import practica12.util.*;

public class ManejadordeLista{

	private Lista cabeza;

/**
 * Número de elementos en la lista.
 */

	private int longitud;

/**
 * Getter.
 * @return La cabeza de la lista.
 */

  	public Lista getCabeza(){
    	return cabeza;
  	}

/**
 * Método que agrega una posibilidad al final de la lista.
 */

	public void agrega(Object elemento) {

		// Crea el nuevo elemento y lo cuenta.

		Lista nuevo = new Lista(elemento);
		longitud++;

		// Si la lista está vacía añade al primer elemento y termina.

		if (cabeza == null) {
			cabeza = nuevo;
			return;
		}

		// Si no, hay que recorrer la lista para formar al nuevo
		// elemento detrás del último.

		Lista anterior = cabeza;
		while(anterior.getSiguiente() != null) {
			anterior = anterior.getSiguiente();
		}

		anterior.setSiguiente(nuevo);
	}

/**
 * Devuelve el número de elementos en esta lista
 */

	public int longitud() {
		return longitud;
	}

/**
 * Método toString
 * @return Todas las posibilidades concatenadas, cada una separado por una linea.
 */

	public String toString(){
    	Lista aux = cabeza;
    	String listadeposibles = "";
    	while(aux != null){
      	listadeposibles += aux.getElemento().toString() + "\n";
      	aux = aux.getSiguiente();
    	}

    	return listadeposibles;
  	}

}
