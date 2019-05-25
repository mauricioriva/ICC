package icc.contactos;

public class Contactos{

  private Registro reg = null;

/* En este método el usuario busca el contacto por medio de una cadena
   ingresada y la busca en el nombre, la direccion y el telefono
*/
  public Registro consultar(String query){
    Registro aux = reg;
    while(aux != null){
      if(aux.getNombre().contains(query)){
        return aux;
      }
      aux = aux.siguiente;
    }return null;
  }

/*En este metodo se insertan los contactos y se guardan en una lista,
  y para ordenarlos se llama a otro metodo para ordenar la Lista
  alfabeticamente
*/
  public void insertaContacto(Registro r){
    Registro aux = reg;
    //lista vacía
    if(reg == null){
      reg = r;
    }else if(reg.siguiente == null){ //lista 1 elemento
      if(reg.compare(r) == 1){
        aux = reg;
        reg = r;
        reg.siguiente = aux;
      }else
        reg.siguiente = r;
      }else{ //lista más de 1 elemento
        if(reg.compare(r) == 1){
          aux = reg;
          reg = r;
          reg.siguiente = aux;
        }else{
          aux = reg;
          while(aux != null){
            if(aux.siguiente.compare(r) == 1){
              r.siguiente = aux.siguiente;
              aux.siguiente = r;
              break;
            }else{
              aux = aux.siguiente;
              if(aux.siguiente == null){
                aux.siguiente = r;
                break;
              }
            }
          }
        }
      }
  }

/* En este metodo se imprimen los contactos una vez ingresados
*/
  public void imprimeContactos(){
    Registro aux = reg;
    String contacto = "";
    while(aux != null){
      contacto = aux.toString();
      System.out.println(contacto);
      aux = aux.getSiguiente();
    }
  }

}
