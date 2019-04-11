
package practica12.recursividad;

import practica12.recursividad.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.LinkedList;

public class UsoMaquinaDeCambio {

	private MaquinaDeCambio maq;
  private Scanner scanner;

  	public UsoMaquinaDeCambio(){
    	maq = new MaquinaDeCambio();
    	scanner = new Scanner(System.in);
  	}

  	public void ejecuta(){
    	System.out.println("<------ Maquina de Cambio ------>");
    	boolean continuar = true;
    	while(continuar){
	      	System.out.println("1: Calcula el cambio");
	      	System.out.println("2: Salir");
	      	int opcion = leeEntero("Selecciona una opción:");
	      	switch(opcion){
	        	case 1:
	        	System.out.println("Ingrese una cantidad para dar todas las posibles formas de dar el cambio en monedas de $10, $5, $2, $1.");
	        	LinkedList<Cambio> list;

	        	int cantidad = scanner.nextInt();

	        	String nombre = Integer.toString(cantidad);
	        	String nombre_archivo = nombre + ".txt";

	        	System.out.println("Guardando en el archivo " + nombre_archivo);

	        	list = maq.getCambio(cantidad);

	        	try (PrintStream fout = new PrintStream(nombre_archivo)) {
	          		fout.println("Inicio\n");
	          		fout.println(list);
	          		fout.println("\nCantidad: " + cantidad);
	          		fout.println("Elementos: " + list.size());
	          		fout.println("\nFin");
	        	} catch (FileNotFoundException fnfe) {
	          		System.err.println("No se encontró el archivo " + nombre_archivo + " y no pudo ser creado.");
	        	} catch (SecurityException se) {
	          		System.err.println("No se tiene permiso de escribir en el archivo");
	        	}

	        	//System.out.println(list);
	        	System.out.println("Cantidad: " + cantidad);
	        	System.out.println("Elementos: " + list.size() + "\n");
	        	break;

	        	case 2:
	          		continuar = false;
	        	break;

	        	default:
	          		System.out.println("Esa no es una opción válida del menú.\n");
	      	}
    	}
  	}

  	private int leeEntero(String mensaje) {
    	System.out.println(mensaje);
    	boolean error = false;
    	int num = -1;
    	try {
      		num = Integer.parseInt(scanner.next());
      		if (num <= 0) {
        		error = true;
        		System.out.println("El valor más chico posible es uno.");
      		}

    	} catch (NumberFormatException nfe) {
        	error = true;
        	System.out.println("Por favor ingresa un número válido.");
    	}

      	if (error) {
        	num = leeEntero(mensaje);
      	}

    	return num;
  	}


  	public static void main(String[] args){
    	UsoMaquinaDeCambio interfaz = new UsoMaquinaDeCambio();
    	interfaz.ejecuta();
    	System.out.println("Maquina de cambio finalizada.");
  	}
}
