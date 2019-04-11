package icc.refactorizacion;

public class Lista{

  private Object elemento;
  private Lista siguiente; //Recursion Estructural

  public Lista(Object elemento){
    this.elemento = elemento;
    this.siguiente = null;
  }

  public Object getElemento(){
    return this.elemento;
  }

  public Lista getSiguiente(){
    return this.siguiente;
  }

  public void setSiguiente(Lista siguiente){
    this.siguiente = siguiente;
  }

}
