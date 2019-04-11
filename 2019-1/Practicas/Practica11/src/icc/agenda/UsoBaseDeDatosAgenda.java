/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.agenda;

import java.util.Scanner;
import icc.agenda.*;
import icc.util.*;
/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {

  private Scanner scannerint;
  private Scanner scannerstring;
  private BaseDeDatosAgenda basedatos;

//<----------------- CREA LA INTERFAZ DE USUARIO ---------------------------->//

/**
 * En el constructor se crean 2 scanner, uno para ingresar números enteros y el otro
 * para ingresar cadenas de texto.
 * Además se crea un objeto de tipo BaseDeDatosAgenda.
 */

    public UsoBaseDeDatosAgenda() {
        scannerint = new Scanner(System.in);
        scannerstring = new Scanner(System.in);
        basedatos = new BaseDeDatosAgenda();
    }

//<--------------------- Método Construye Registro ---------------------------->//

/**
 * Este método se encarga de construir un contacto al ingresar un nombre, telefono y
 * direccion para poder usar los 3 parámetros ingresados como un solo objeto de tipo RegistroAgenda.
 * @return El contacto que contiene el nombre, la direccion y el telefono.
 */

    public RegistroAgenda nuevo(){
      System.out.println("Ingresa el nombre:");
      String nombre = scannerstring.nextLine();
      System.out.println("Ingresa la dirección:");
      String direccion = scannerstring.nextLine();
      System.out.println("Ingresa el teléfono:");
      int telefono = scannerint.nextInt();
      RegistroAgenda nuevo = new RegistroAgenda(nombre, direccion, telefono);
      return nuevo;
    }


//<--------------------------- MENU PRINCIPAL ------------------------------->//

/**
 * Imprime el menú para que el usuario sepa cuales son las opciones de las que
 * dispone.
 */

  private void imprimeMenu(){
    System.out.println("Opciones:");
    System.out.println("1: Crear una base de datos");
    System.out.println("2: Cargar de disco");
    System.out.println("3: Guardar la agenda");
    System.out.println("4: Agregar un registro");
    System.out.println("5: Buscar por nombre");
    System.out.println("6: Buscar por teléfono");
    System.out.println("7: Buscar por dirección");
    System.out.println("8: Imprimir todo");
    System.out.println("9: Salir");
  }

//<----------------- METODO CON EL QUE FUNCIONA LA INTERFAZ ------------------//

/**
 * Este método es el que hace que el menú funcione, y se manden a llamar los
 * métodos correspondientes para lo que ingrese el usuario.
 */

  public void ejecuta() {
    System.out.println("<-------- Agenda -------->");
    boolean continuar = true;
    while(continuar){
      imprimeMenu();
      int opcion = leeEntero("Selecciona una opción:");
      switch(opcion){
        case 1:
          System.out.println("Creando una base de datos...");
          basedatos = new BaseDeDatosAgenda();
        break;

        case 2:
          System.out.println("Cargando del disco...");
          System.out.println("Ingresa el nombre del archivo a cargar.");
          String nombre_carga_archivop = scannerstring.nextLine();
          String nombre_carga_archivo = nombre_carga_archivop + ".txt";
          basedatos.carga(nombre_carga_archivo);
          System.out.println("El archivo " + nombre_carga_archivop + " se ha cargado correctamente.");
        break;

        case 3:
          System.out.println("Guardando en la agenda...");
          System.out.println("Ingresa un nombre para guardar el archivo.");
          String nombre_archivop = scannerstring.nextLine();
          String nombre_archivo = nombre_archivop + ".txt";
          basedatos.guardaAgenda(nombre_archivo);
          System.out.println("Guardado en el archivo " + nombre_archivop);
        break;

        case 4:
          System.out.println("Agregando un registro...");
          RegistroAgenda reg = nuevo();
          System.out.println(reg + "\n");
          basedatos.agregaregistro(reg);
        break;

        case 5:
          System.out.println("Buscando por nombre...\nIngresa el nombre:");
          String nombre = scannerstring.nextLine();
          RegistroAgenda n = basedatos.dameRegistroPorNombre(nombre);
          if (n == null){
            System.out.println("No encontré un nombre.\n");
          }else{
            System.out.println(n + "\n");
          }
        break;

        case 6:
          System.out.println("Buscando por teléfono...\nIngresa el teléfono:");
          int telefono = scannerint.nextInt();
          RegistroAgenda t = basedatos.dameRegistroPorTelefono(telefono);
          if (t == null){
            System.out.println("No encontré el teléfono.\n");
          }else{
            System.out.println(t + "\n");
          }
        break;

        case 7:
          System.out.println("Buscando por dirección...\nIngresa la direccion:");
          String direccion = scannerstring.nextLine();
          RegistroAgenda d = basedatos.dameRegistroPorDireccion(direccion);
          if (d == null){
            System.out.println("No encontré la direccion.\n");
          }else{
            System.out.println(d + "\n");
          }
        break;

        case 8:
          System.out.println("Imprimiendo...");
          System.out.println(basedatos);
        break;

        case 9:
          continuar = false;
        break;

        default:
          System.out.println("Esa no es una opción válida del menú.\n");
      }
    }
  }

//<---------------- PIDE UN ENTERO AL USUARIO ------------------------------->//

  /**
   * Método que pide un número al usuario para que funcione el menú.
   * @param  mensaje Le manda un mensaje al usuario para que ingrese un numero.
   * @return         Regresa el número ingresado por el usuario si es que es válido.
   */

    private int leeEntero(String mensaje) {
        System.out.println(mensaje);
        boolean error = false;
        int num = -1;
        try {
            num = Integer.parseInt(scannerint.next());
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

//<---------------------------------------------------------------------------//

  /**
   * En el método main se manda a llamar el método ejecuta para ejecutar el menú.
   * Apartir de un objeto llamado vista de tipo UsoBaseDeDatosAgenda que se crea aquí mismo.
   */

	public static void main(String[] args) {
		// TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
    UsoBaseDeDatosAgenda vista = new UsoBaseDeDatosAgenda();
    vista.ejecuta();
    System.out.println("Base de datos finalizada.");
	}

}

/* </UsoBaseDeDatosAgenda.java> */
