/* -*- jde -*- */
/* <GuardaRegistro.java> */

package icc.agenda;

import icc.agenda.*;
import icc.util.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Clase para guardar los registros en un archivo.
 */

public class GuardaRegistro implements IBuscador{

/**
 * Objeto de tipo PrintStream que sirve para imprimir en un archivo.
 */

  PrintStream e;

/**
 * Constructor
 * @param e Es de tipo PrintStream y lo vuelve un objeto de esta clase.
 */

  public GuardaRegistro(PrintStream e){
    this.e = e;
  }

/**
 * Método esEste, utiliza al PrintStream para escribir el contenido del registro.
 * Manda a llamar al método guardaentxt para guardar el registro.
 * @param  e Es de tipo object.
 * @return   False.
 */
  @Override
  public boolean esEste(Object d) {
    RegistroAgenda a = (RegistroAgenda)d;
    a.guardaentxt(e);
    return false;
  }

}

/* </GuardaRegistro.java> */
