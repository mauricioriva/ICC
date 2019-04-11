/* -*- jde -*- */
/* <ManejadorDeLista.java> */

package icc.util;

import icc.agenda.*;
import icc.util.*;
/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class ManejadorDeLista {

	/**
	 * Primer elemento de la lista.
	 */
	private Lista cabeza;

	/**
	 * Número de elementos en la lista.
	 */
	private int longitud;

  public Lista getCabeza(){
    return cabeza;
  }

//<-------------------------------------------------------------------------->//
	/**
	 * Método que agrega un registro agenda al final de la lista.
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

//<-------------------------------------------------------------------------->//
	/**
	 * Devuelve el número de elementos en esta lista.
	 */
	public int longitud() {
		return longitud;
	}
//<-------------------------------------------------------------------------->//
	/**
	 * Método para poder programar la búsqueda en la base de datos.
	 */
	public Object encuentra(IBuscador buscador) {
		// TODO: Utiliza al objeto buscador para encontrar
		// al registro agenda con el dato solicitado.
    Lista aux = cabeza;
    while (aux != null){
      if (buscador.esEste(aux.getElemento())){
        return aux.getElemento();
      }
      aux = aux.getSiguiente();
    }
		return null;
	}

//<-------------------------------------------------------------------------->//

  /**
   * Método toString
   * @return Todos los contactos concatenados, cada uno separado por una linea.
   */

  public String toString(){
    Lista aux = cabeza;
    String contacto = "";
    while(aux != null){
      contacto += aux.getElemento().toString() + "\n";
      aux = aux.getSiguiente();
    }
    return contacto;
  }

}

/* </ManejadorDeLista.java> */
