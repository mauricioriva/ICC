package icc.ajedrez;

import java.util.LinkedList;

public class Rey extends Pieza{

//<---------------------------- CONSTRUCTOR --------------------------------->//

  protected Rey(int renglon, char columna){
    super(renglon,columna);
  }

//<----- Método para saber si es valida la posición dentro del tablero ----->//
  @Override
  public boolean esValida(int renglon, char columna){
    return super.esValida(renglon,columna);
  }

//<------------- Metodo to String para imprimir ----------------------------->//
  @Override
  public String toString(){
    return "Rey " + super.toString();
  }

//<--- Método para imprimir la lista de coordenadas posibles para el rey--->//
  public LinkedList<String> posiblesMovimientos(){

      LinkedList<String> listaDePosibles = new LinkedList<String>();

//----Norte-------------------------------------------------------------------//
      int renglonContadorN;

      renglonContadorN = getRenglon() + 1;

      if(renglonContadorN < 9){
        listaDePosibles.add("(" + renglonContadorN + "," + (char) getColumna() + ")");
      }

//----Sur---------------------------------------------------------------------//
      int renglonContadorS;

      renglonContadorS = getRenglon() - 1;

      if(renglonContadorS > 0){
        listaDePosibles.add("(" + renglonContadorS + "," + (char) getColumna() + ")");
      }

//----Este--------------------------------------------------------------------//
      int columnaContadorE;

      columnaContadorE = getColumna() + 1;

      if(columnaContadorE < 105){
        listaDePosibles.add("(" + getRenglon() + "," + (char) columnaContadorE + ")");
      }

//----Oeste-------------------------------------------------------------------//
      int columnaContadorO;

      columnaContadorO = getColumna() - 1;

      if(columnaContadorO > 96){
        listaDePosibles.add("(" + getRenglon() + "," + (char) columnaContadorO + ")");
      }

//----Noreste-------------------------------------------------------------------//
      int renglonContadorNE;
      int columnaContadorNE;

      renglonContadorNE = getRenglon() + 1;
      columnaContadorNE = getColumna() + 1;

      if(renglonContadorNE < 9 && columnaContadorNE < 105){
        listaDePosibles.add("(" + renglonContadorNE + "," + (char) columnaContadorNE + ")");
      }

//----Sureste-------------------------------------------------------------------//
      int renglonContadorSE;
      int columnaContadorSE;

      renglonContadorSE = getRenglon() - 1;
      columnaContadorSE = getColumna() + 1;

      if(renglonContadorSE > 0 && columnaContadorSE < 105){
        listaDePosibles.add("(" + renglonContadorSE + "," + (char) columnaContadorSE + ")");
      }

//----Suroeste-------------------------------------------------------------------//
      int renglonContadorSO;
      int columnaContadorSO;

      renglonContadorSO = getRenglon() - 1;
      columnaContadorSO = getColumna() - 1;

      if(renglonContadorSO > 0 && columnaContadorSO > 96){
        listaDePosibles.add("(" + renglonContadorSO + "," + (char) columnaContadorSO + ")");
      }

//----Noroeste-------------------------------------------------------------------//
      int renglonContadorNO;
      int columnaContadorNO;

      renglonContadorNO = getRenglon() + 1;
      columnaContadorNO = getColumna() - 1;

      if(renglonContadorNO < 9 && columnaContadorNO > 96){
        listaDePosibles.add("(" + renglonContadorNO + "," + (char) columnaContadorNO + ")");
      }

//----------------------------------------------------------------------------//
      return listaDePosibles;
  }
}
