/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.agenda;

import icc.agenda.*;
import icc.util.*;

/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
 */
public class BaseDeDatosAgenda {

	/**
	 * Este objeto llevará el control de los registros guardados en la lista.
	 */
	private ManejadorDeLista tabla;

	/**
	 * Constructor.
	 * @param datos Una cadena con el formato requerido por esta base
	 *        con los registros de nombres, direcciones y teléfonos.
	 * @param tam_nombre Es el tamaño de la cadena que contiene el nombre en la agenda.
   * @param tam_direccion Es el tamaño de la cadena que contiene la direccion en la agenda.
   * @param tam_telefono Es el tamaño de la cadena que contiene el telefono de la agenda.
	 */
	public BaseDeDatosAgenda(String datos,
				 int tam_nombre,
				 int tam_direccion,
				 int tam_telefono) {
		int tam_registro = tam_nombre + tam_direccion + tam_telefono;
    tabla = new ManejadorDeLista();
    if((datos.length() % tam_registro) != 0) System.out.println("CADENA INVALIDA");
		// TODO: Crear el ManejadorDeLista para almacenar ahí los registros.
    int pos = 0;
    String nombre,direccion;
    int telefono;
    while(pos < datos.length()){
      nombre = datos.substring(pos,pos + tam_nombre);
      direccion = datos.substring(pos + tam_nombre ,pos + tam_nombre + tam_direccion);
      telefono = Integer.parseInt(datos.substring(pos + tam_nombre + tam_direccion,pos + tam_nombre + tam_direccion + tam_telefono));
      tabla.agrega(new RegistroAgenda(nombre,direccion,telefono));
      pos += tam_registro;
    }
	}

  /**En este método se busca el registro que contiene el nombre ingresado, para esto se usa la clase
  *  BuscadorPorNombre y el método "encuentra()" (este método está dentro de la
  *  clase ManejadorDeLista).
  *  @param nombre Cadena que contiene el nombre a buscar.
  *  @return Encuentra el registro correcto dentro de la lista.
  *  @see BuscadorPorNombre
  *  @see ManejadorDeLista
  */
	public RegistroAgenda dameRegistroPorNombre (String nombre) {
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
    IBuscador b = new BuscadorPorNombre(nombre);
    RegistroAgenda ra = (RegistroAgenda)(tabla.encuentra(b));
    return ra;
	}

  /**En este método se busca el registro que contiene el telefono ingresado, para esto se usa la clase
  *  BuscadorPorTelefono y el método "encuentra()" (este método está dentro de la
  *  clase ManejadorDeLista).
  *  @param tel Cadena que contiene el telefono a buscar.
  *  @return Encuentra el registro correcto dentro de la lista.
  *  @see BuscadorPorTelefono
  *  @see ManejadorDeLista
  */

	public RegistroAgenda dameRegistroPorTelefono (int tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
    BuscadorPorTelefono b = new BuscadorPorTelefono(tel);
    RegistroAgenda ra = (RegistroAgenda)(tabla.encuentra(b));
    return ra;
	}

  /**En este método se busca el registro que contiene la direccion ingresada, para esto se usa la clase
  *  BuscadorPorDireccion y el método "encuentra()" (este método está dentro de la
  *  clase ManejadorDeLista).
  *  @param direccion Cadena que contiene la direccion a buscar.
  *  @return Encuentra el registro correcto dentro de la lista.
  *  @see BuscadorPorDireccion
  *  @see ManejadorDeLista
  */

  public RegistroAgenda dameRegistroPorDireccion (String direccion){
    IBuscador b = new BuscadorPorDireccion(direccion);
    RegistroAgenda ra = (RegistroAgenda)(tabla.encuentra(b));
    return ra;
  }

}
