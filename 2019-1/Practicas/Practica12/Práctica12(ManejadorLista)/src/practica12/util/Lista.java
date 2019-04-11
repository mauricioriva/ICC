
package practica12.util;

import practica12.recursividad.*;
import practica12.util.*;

public class Lista{


/**
 * Registro almacenado.
 */

	private Object elemento;

/**
 * Lista siguiente.
 */

	private Lista siguiente;

/**
 * Construye una lista con un único elemento.
 * @param elemento: el elemento a almacenar.
 *        Debe ser distinto de <code>null</code>.
 */
	
	public Lista(Object elemento) {
		this.elemento = elemento;
	}

/**
 * Devuelve el elemento almacenado en esta lista.
 */
	
	public Object getElemento() {
		return elemento;
	}

/**
 * Devuelve la lista siguiente.
 */

	public Lista getSiguiente() {
		return siguiente;
	}

/**
 * Asigna a la lista que va después de esta.
 * @param siguiente: otra lista.
 */

	public void setSiguiente(Lista siguiente) {
		this.siguiente = siguiente;
	}

}
