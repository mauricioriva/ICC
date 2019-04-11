/* -*- jde -*- */
/* <BuscadorPorNombre.java> */

package icc.agenda;

import icc.util.IBuscador;

/**
 * Clase que busca registros agenda con un telefono dado.
 */
public class BuscadorPorTelefono implements IBuscador {

	/* Telefono que se busca */
	private int telefonoBuscado;

	/**
	 * Buscador que recibe un telefono y lo convierte en un objeto de esta clase.
   * @param telefono Cadena que contiene el telefono a buscar.
	 */
	public BuscadorPorTelefono(int telefono) {
		telefonoBuscado = telefono;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al telefono buscado.
	 * @returns si <code>reg</code> tiene ese telefono.
	 */
	public boolean esEste(RegistroAgenda reg) {
		 return reg.getTelefono() == telefonoBuscado;
	}

}
