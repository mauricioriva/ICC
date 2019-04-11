/* -*- jde -*- */
/* <Buscador.java> */

package icc.util;

import icc.agenda.*;
import icc.util.*;
/**
 * Interfaz para definir objetos que buscan otros que
 * satisfagan cierta condición.
 */
public interface IBuscador {

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 */
	public boolean esEste(Object elemento);
  }

/* </IBuscador.java> */
