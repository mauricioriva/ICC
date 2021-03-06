/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.agenda;

import icc.util.IBuscador;

/**
 * Clase que busca registros agenda con un nombre dado.
 */
public class BuscadorPorNombre implements IBuscador {

	/* Nombre que se busca */
	private String nombreBuscado;

	/**
	 * Buscador que recibe un nombre y lo convierte en un objeto de esta clase.
   * @param nombre Cadena que contiene el nombre a buscar.
	 */
	public BuscadorPorNombre(String nombre) {
		nombreBuscado = nombre;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al nombre buscado.
	 * @returns si <code>reg</code> tiene ese nombre.
	 */
  @Override
  public boolean esEste(Object reg) {
    RegistroAgenda ra = (RegistroAgenda)reg;
    return ra.getNombre().contains(nombreBuscado);
	}

}

/* </BuscadorPorNombre.java> */
