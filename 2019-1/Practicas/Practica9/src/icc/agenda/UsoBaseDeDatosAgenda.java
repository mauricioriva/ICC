/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.agenda;

import icc.agenda.*;
import icc.util.*;
/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {

	/*  Número de caracteres que debe tener el registro nombre. */
	private static final int TAM_NOMBRE    = 20;
	/*  Número de caracteres que debe tener el registro dirección. */
	private static final int TAM_DIRECCION = 30;
	/*  Número de caracteres que debe tener el registro teléfono. */
	private static final int TAM_TELEFONO  = 8;

	private static final String tabla1 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Juan Pérez García   "+"Avenida Siempre Viva # 40     "+"55554466"+
	"Arturo López Estrada"+"Calle de la abundancia # 12   "+"55557733"+
	"Edgar Hernández Levi"+"Oriente 110 # 14              "+"55512112"+
	"María García Sánchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
	"Pedro Páramo Rulfo  "+"Avenida Méxio Lindo # 23      "+"54471499"+
	"José Arcadio Buendía"+"Macondo # 30                  "+"56230190"+
	"Florentino Ariza    "+"Calle de la Cólera # 11       "+"55551221";

	private static final String tabla2 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Galio Bermúdez      "+"Sótanos de México # 45        "+"55552112"+
	"Carlos García Vigil "+"La República # 1              "+"55554332"+
	"Eligio García Agusto"+"Ciudades Desiertas # 90       "+"56344325";

/**En el método main se realizan unas consultas con su respectiva tabla
  *para encontrar todo el registro por nombre, telefono y dirección.
  */
	public static void main(String[] args) {
		// TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
    BaseDeDatosAgenda a = new BaseDeDatosAgenda(tabla1,TAM_NOMBRE,TAM_DIRECCION,TAM_TELEFONO);
    BaseDeDatosAgenda b = new BaseDeDatosAgenda(tabla2,TAM_NOMBRE,TAM_DIRECCION,TAM_TELEFONO);

    System.out.println("<---------------- Base de datos de una Agenda ----------------->\n");
    System.out.println(a.dameRegistroPorNombre("Arturo"));
    System.out.println(a.dameRegistroPorTelefono(56742391));
    System.out.println(a.dameRegistroPorDireccion("Macondo"));

    System.out.println();

    System.out.println(b.dameRegistroPorNombre("Eligio"));
    System.out.println(b.dameRegistroPorTelefono(55552112));
    System.out.println(b.dameRegistroPorDireccion("La"));

    System.out.println("<-------------------------------------------------------------->");
	}

}

/* </UsoBaseDeDatosAgenda.java> */
