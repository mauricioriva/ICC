/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.agenda;

import icc.agenda.*;
import icc.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;


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

//<---------------------------- Constructor --------------------------------->//

  /**
   * Crea un nuevo ManejadorDeLista llamado tabla.
   */

    public BaseDeDatosAgenda(){
      tabla = new ManejadorDeLista();
    }
//<-------------------------------------------------------------------------->//

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

  /**
   * Método que manda a llamar al método agrega que se encuentra en ManejadorDeLista.
   * @param e Es de tipo RegistroAgenda y se le aplica el objeto tabla que es con el que funciona el método agrega.
   */

  public void agregaregistro(RegistroAgenda e){
    tabla.agrega(e);
  }

  /**
   * Método toString para imprimir todos los contactos de la lista proveniente de ManejadorDeLista.
   * @return Regresa la lista de los contactos de ManejadorDeLista al cual manda a llamar Método toString de la clase ManejadorDeLista.
   */

  public String toString(){
    return tabla.toString();
  }

  /**
   * En este método se recorre la lista que contiene los contatos y manda a llamar
   * al método esEste para que posteriormente se mande a llamar otro método que agrega
   * los registro a un archivo.
   * @param nombreArchivo Es el nombre que va a tener el archivo que se crea para guardar los registros.
   */

  public void guardaAgenda(String nombreArchivo){
    try (PrintStream fout = new PrintStream(nombreArchivo)) {
      Lista aux = tabla.getCabeza();
      IBuscador buscador = new GuardaRegistro(fout);
      while (aux != null){
        buscador.esEste(aux.getElemento());
        aux = aux.getSiguiente();
      }
    } catch (FileNotFoundException fnfe) {
      System.err.println("No se encontró el archivo " + nombreArchivo + " y no pudo ser creado.");
    }
  }

  /**
   * En este método se cargan los registros que existen en un archivo y los agrega a la lista que contiene los registros.
   * @param nombreArchivo La cadena que contiene el nombre del archivo.
   */

  public void carga(String nombreArchivo){
    try{
      BufferedReader in = new BufferedReader(new FileReader(nombreArchivo));
      String line;
      String nombre = null;
      String direccion = null;
      int telefono = 0;
      int c = 0;
      //Crear variable si 0 = nombre, 1 = direccion, 2 = telefono.
      while( (line = in.readLine()) != null) {
        if(c == 0){
          nombre = line;
        }else if(c == 1){
          direccion = line;
        }else if(c == 2){
          telefono = Integer.parseInt(line);
          RegistroAgenda r = new RegistroAgenda(nombre, direccion, telefono);
          agregaregistro(r);
        }
        c = (c + 1) % 3;
      }
      if(c != 0){
        System.out.println("No se leyó correctamente el archivo BaseDeDatos.txt");
      }
    } catch (FileNotFoundException e) {
      System.err.println("\nNo se encontró el archivo" + nombreArchivo + "¿Olvidaste crearlo?\n");
    } catch (IOException ioe) {
      System.err.println("\nError al leer el contenido de texto.txt\n");
    }
  }

}

/* </BaseDeDatosAgenda.java> */
