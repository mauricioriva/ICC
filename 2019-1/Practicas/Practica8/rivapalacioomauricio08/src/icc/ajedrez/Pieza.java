package icc.ajedrez;

import java.util.LinkedList;

public abstract class Pieza{

  protected Posicion posicion;  //Objeto
  protected boolean color;      //Objeto

//<------------------------- CONSTRUCTOR ------------------------------------>//

  protected Pieza(int renglon, char columna){
    posicion = new Posicion(renglon, columna);
    color = true;
  }

//<------------------------- Métodos [Abstractos] (3) ----------------------->//

  public LinkedList<String> posiblesMovimientos(){     //En este método se verifican
    LinkedList<String> list = new LinkedList<>();      //los posibles movimientos que
//                                                     //puede hacer la pieza en el
    return list;                                       //tablero.
  }

  public boolean esValida(int renglon, char columna){   //Este método se encarga de que
    if(renglon < 1 || renglon > 8) return false;       //la pieza no se salga del tablero,
    if(columna < 97 || columna > 104) return false;   //y si la posición sugerida por el
    return true;                                        //usuario es valida.
  }

  public String toString(){                                                     //En este método toString
    return posicion.toString() + " -> Color: " + (color?"Blanco\n":"Negro\n");  //imprime el color de la pieza.
  }

//<------------------------- GETTERS Y SETTERS ------------------------------>//

  public void setRenglon(int renglon){
    posicion.setRenglon(renglon);
  }

  public void setColumna(char columna){
    posicion.setColumna(columna);
  }

  public int getRenglon(){
    return posicion.getRenglon();
  }

  public int getColumna(){
    return posicion.getColumna();
  }

}
