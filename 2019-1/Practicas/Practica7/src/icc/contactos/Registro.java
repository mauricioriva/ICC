package icc.contactos;

public class Registro{

  private String nombre;
  private String direccion;
  private String telefono;
  Registro siguiente = null;

// Este método es el constructor para asignar a cada contacto un nombre,
// una dirección y un telefono, y se les tiene que asignar algo.

  public Registro(String nombre,String direccion,String telefono){
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    if(nombre == null) throw new ArithmeticException();
    if(direccion == null) throw new ArithmeticException();
    if(telefono == null) throw new ArithmeticException();
  }

  public String getNombre(){
    return nombre;
  }

  public String getDireccion(){
    return direccion;
  }

  public String getTelefono(){
    return telefono;
  }

  public void setNombre(String nombre){
    if(nombre == null) throw new ArithmeticException();
    this.nombre = nombre;
  }

  public void setDireccion(String direccion){
    if(direccion == null) throw new ArithmeticException();
    this.direccion = direccion;
  }

  public void setTelefono(String telefono){
    if(telefono == null) throw new ArithmeticException();
    this.telefono = telefono;
  }

  Registro getSiguiente(){
    return siguiente;
  }

  void setSiguiente(Registro siguiente){
    this.siguiente = siguiente;
  }

// En este método se comparan los nombres para ordenar los
// contactos alfabeticamente

  public int compare(Registro r){
    int i = nombre.compareTo(r.nombre);
    if (i < -1){
      i = -1;
    }
    if (i > 1){
      i = 1;
    }
    if (i == 0){
      i = 0;
    }
    return i;

  }

/*En este método se imprimen los datos del contacto en este formato
* Nombre:
* Dirección:
* Teléfono:
*/
  public String toString(){
    String res = "Nombre: " + nombre + "\n" + "Dirección: " + direccion + "\n" + "Teléfono: " + telefono + "\n";
    return res;
  }

}
