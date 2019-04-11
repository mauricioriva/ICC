/* -*- jde -*- */
/* <BuscadorPorDireccion.java> */

package icc.agenda;

import icc.util.IBuscador;

/**
 * Clase que busca registros agenda con una direccion dada.
 */
public class BuscadorPorDireccion implements IBuscador {

	/* Direccion que se busca */
	private String direccionBuscada;

	/**
	 * Buscador que recibe una direccion y la convierte en un objeto de esta clase.
   * @param direccion Cadena que contiene la direccion a buscar.
	 */
	public BuscadorPorDireccion(String direccion) {
		direccionBuscada = direccion;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        a la direccion buscada.
	 * @returns si <code>reg</code> tiene esa direccion.
	 */
  @Override
	public boolean esEste(Object reg) {
    RegistroAgenda ra = (RegistroAgenda)reg;
    return ra.getDireccion().contains(direccionBuscada);
	}

}

/* </BuscadorPorDireccion.java> */
