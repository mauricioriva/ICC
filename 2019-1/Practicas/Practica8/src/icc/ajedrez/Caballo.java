package icc.ajedrez;

import java.util.LinkedList;

public class Caballo extends Pieza{
  //<---------------------------- CONSTRUCTOR --------------------------------->//

    protected Caballo(int renglon, char columna){
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
      return "Caballo " + super.toString();
}

//<--- Método para imprimir la lista de coordenadas posibles para el caballo--->//
  public LinkedList<String> posiblesMovimientos(){

      LinkedList<String> listaDePosibles = new LinkedList<String>();

//----NorteDerecho-------------------------------------------------------------------//
      int renglonContadorND;
      int columnaContadorND;

      renglonContadorND = getRenglon() + 2;
      columnaContadorND = getColumna() + 1;

      if(renglonContadorND < 9 && columnaContadorND < 105){
        listaDePosibles.add("(" + renglonContadorND + "," + (char) columnaContadorND + ")");
      }

//----Noreste-------------------------------------------------------------------//
      int renglonContadorNE;
      int columnaContadorNE;

      renglonContadorNE = getRenglon() + 1;
      columnaContadorNE = getColumna() + 2;

      if(renglonContadorNE < 9 && columnaContadorNE < 105){
      listaDePosibles.add("(" + renglonContadorNE + "," + (char) columnaContadorNE + ")");
      }

//----Sureste-------------------------------------------------------------------//
      int renglonContadorSE;
      int columnaContadorSE;

      renglonContadorSE = getRenglon() - 1;
      columnaContadorSE = getColumna() + 2;

      if(renglonContadorSE > 0 && columnaContadorSE < 105){
        listaDePosibles.add("(" + renglonContadorSE + "," + (char) columnaContadorSE + ")");
      }

//----SurDerecho-------------------------------------------------------------------//
      int renglonContadorSD;
      int columnaContadorSD;

      renglonContadorSD = getRenglon() - 2;
      columnaContadorSD = getColumna() + 1;

      if(renglonContadorSD > 0 && columnaContadorSD < 105){
        listaDePosibles.add("(" + renglonContadorSD + "," + (char) columnaContadorSD + ")");
      }

//----SurIzquierdo-------------------------------------------------------------------//
      int renglonContadorSI;
      int columnaContadorSI;

      renglonContadorSI = getRenglon() - 2;
      columnaContadorSI = getColumna() - 1;

      if(renglonContadorSI > 0 && columnaContadorSI > 96){
        listaDePosibles.add("(" + renglonContadorSI + "," + (char) columnaContadorSI + ")");
      }

//----SurOeste-------------------------------------------------------------------//
      int renglonContadorSO;
      int columnaContadorSO;

      renglonContadorSO = getRenglon() - 1;
      columnaContadorSO = getColumna() - 2;

      if(renglonContadorSO > 0 && columnaContadorSO > 96){
        listaDePosibles.add("(" + renglonContadorSO + "," + (char) columnaContadorSO + ")");
      }

//----Noroeste-------------------------------------------------------------------//
      int renglonContadorNO;
      int columnaContadorNO;

      renglonContadorNO = getRenglon() + 1;
      columnaContadorNO = getColumna() - 2;

      if(renglonContadorNO < 9 && columnaContadorNO > 96){
        listaDePosibles.add("(" + renglonContadorNO + "," + (char) columnaContadorNO + ")");
      }

//----NorteIzquierdo-------------------------------------------------------------------//
      int renglonContadorNI;
      int columnaContadorNI;

      renglonContadorNI = getRenglon() + 2;
      columnaContadorNI = getColumna() - 1;

      if(renglonContadorNI < 9 && columnaContadorNI > 96){
        listaDePosibles.add("(" + renglonContadorNI + "," + (char) columnaContadorNI + ")");
      }

//----------------------------------------------------------------------------//
      return listaDePosibles;
  }
}
