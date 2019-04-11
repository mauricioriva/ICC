package icc.ajedrez;

public class Posicion{

  private int renglon;    //Objeto
  private char columna;   //Objeto

//<--------------------------- CONSTRUCTOR ---------------------------------->//

  public Posicion(int renglon, char columna){
    this.renglon = renglon;
    this.columna = columna;
  }

//<---------------------------- GETTERS ------------------------------------->//

  public int getRenglon(){
    return renglon;
  }

  public char getColumna(){
    return columna;
  }

//<---------------------------- SETTERS ------------------------------------->//

  public void setRenglon(int renglon){
    if(1 > renglon || renglon > 8) throw new IllegalArgumentException("Renglon invalido, solo numeros del [1-8]");
    this.renglon = renglon;
  }

    public void setColumna(char columna){
      if(columna < 97 || columna > 104) throw new IllegalArgumentException("Columna invalida, solo caracteres de la [a-h]");
      this.columna = columna;
    }

//<------------------------- METODO TO STRING ------------------------------>//

  public String toString(){                       //Este método toString imprime
    return "(" + renglon + "," + columna + ")";   //la posición de la pieza en
  }                                               //forma de coordenadas

}
