/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.agenda;

import icc.agenda.*;
import icc.util.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 * Clase que construye registros para una agenda.
 */
public class RegistroAgenda {

	// TODO: Declara aquí los atributos para almacenar
	// nombre, dirección y teléfono.

  private String nombre;
  private String direccion;
  private int telefono;

	/**
	 * Constructor General.
   * @param nombre Cadena que contiene el nombre.
   * @param direccion Cadena que contiene la direccion.
   * @param telefono Cadena que contiene el telefono.
   *
   */

  public RegistroAgenda(String nombre, String direccion, int telefono){
    if(nombre == null) throw new IllegalArgumentException("El nombre = null");
    this.nombre = nombre;
    if(direccion == null) throw new IllegalArgumentException("El direccion = null");
    this.direccion = direccion;
    if(telefono == 0) throw new IllegalArgumentException("El telefono = null");
    this.telefono = telefono;
  }

	/**
	 * Getter.
   * @return El nombre.
	 */
  public String getNombre(){
    return this.nombre;
  }
  /**
	 * Getter.
   * @return La direccion.
	 */
  public String getDireccion(){
    return this.direccion;
  }
  /**
	 * Getter.
   * @return El telefono.
	 */
  public int getTelefono(){
    return this.telefono;
  }

	/**
	 * Setter para actualizar el nombre del contacto
	 */

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  /**
	 * Setter para actualizar el nombre del contacto
	 */
  public void setDireccion(String direccion){
    this.direccion = direccion;
  }
  /**
	 * Setter para actualizar el nombre del contacto
	 */
  public void setTelefono(int telefono){
    this.telefono = telefono;
  }

	/**
	 * Método toString
   * @return Una cadena con los datos en el registro en un formato agradable.
	 */
  @Override
	public String toString() {
    //return "Nombre: " + this.nombre + "\nDirección: " + this.direccion + "\nTelefono: " + this.telefono;
    return this.nombre + " | " + this.direccion + " | " + this.telefono;
	}

  /**
   * Método para guardar contactos en un archivo de tipo .txt
   * @param fout La variable que se usa para imprimir en el archivo.
   */

  public void guardaentxt(PrintStream fout){
    String nombreArchivo = "BaseDeDatos.txt";
    try{
      fout.println(nombre);
      fout.println(direccion);
      fout.println(telefono);
    } catch (SecurityException se) {
      System.err.println("No se tiene permiso de escribir en el archivo");
    }
  }

}

/* </RegistroAgenda.java> */
