package icc.ajedrez;

import java.util.LinkedList;

public class Reina extends Pieza{

//<---------------------------- CONSTRUCTOR --------------------------------->//

  protected Reina(int renglon, char columna){
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
    return "Reina " + super.toString();
  }

//<--- Método para imprimir la lista de coordenadas posibles para la reina--->//
  public LinkedList<String> posiblesMovimientos(){

      LinkedList<String> listaDePosibles = new LinkedList<String>();

//----Norte-------------------------------------------------------------------//
      int renglonContadorN;

      renglonContadorN = getRenglon() + 1;

      while(renglonContadorN < 9){
        listaDePosibles.add("(" + renglonContadorN + "," + (char) getColumna() + ")");
        renglonContadorN += 1;
      }

//----Sur---------------------------------------------------------------------//
      int renglonContadorS;

      renglonContadorS = getRenglon() - 1;

      while(renglonContadorS > 0){
        listaDePosibles.add("(" + renglonContadorS + "," + (char) getColumna() + ")");
        renglonContadorS -= 1;
      }

//----Este--------------------------------------------------------------------//
      int columnaContadorE;

      columnaContadorE = getColumna() + 1;

      while(columnaContadorE < 105){
        listaDePosibles.add("(" + getRenglon() + "," + (char) columnaContadorE + ")");
        columnaContadorE += 1;
      }

//----Oeste-------------------------------------------------------------------//
      int columnaContadorO;

      columnaContadorO = getColumna() - 1;

      while(columnaContadorO > 96){
        listaDePosibles.add("(" + getRenglon() + "," + (char) columnaContadorO + ")");
        columnaContadorO -= 1;
      }

//----Noreste-------------------------------------------------------------------//
      int renglonContadorNE;
      int columnaContadorNE;

      renglonContadorNE = getRenglon() + 1;
      columnaContadorNE = getColumna() + 1;

      while(renglonContadorNE < 9 && columnaContadorNE < 105){
        listaDePosibles.add("(" + renglonContadorNE + "," + (char) columnaContadorNE + ")");
        renglonContadorNE += 1;
        columnaContadorNE += 1;
      }

//----Sureste-------------------------------------------------------------------//
      int renglonContadorSE;
      int columnaContadorSE;

      renglonContadorSE = getRenglon() - 1;
      columnaContadorSE = getColumna() + 1;

      while(renglonContadorSE > 0 && columnaContadorSE < 105){
        listaDePosibles.add("(" + renglonContadorSE + "," + (char) columnaContadorSE + ")");
        renglonContadorSE -= 1;
        columnaContadorSE += 1;
      }

//----Suroeste-------------------------------------------------------------------//
      int renglonContadorSO;
      int columnaContadorSO;

      renglonContadorSO = getRenglon() - 1;
      columnaContadorSO = getColumna() - 1;

      while(renglonContadorSO > 0 && columnaContadorSO > 96){
        listaDePosibles.add("(" + renglonContadorSO + "," + (char) columnaContadorSO + ")");
        renglonContadorSO -= 1;
        columnaContadorSO -= 1;
      }

//----Noroeste-------------------------------------------------------------------//
      int renglonContadorNO;
      int columnaContadorNO;

      renglonContadorNO = getRenglon() + 1;
      columnaContadorNO = getColumna() - 1;

      while(renglonContadorNO < 9 && columnaContadorNO > 96){
        listaDePosibles.add("(" + renglonContadorNO + "," + (char) columnaContadorNO + ")");
        renglonContadorNO += 1;
        columnaContadorNO -= 1;
      }

//----------------------------------------------------------------------------//
      return listaDePosibles;
  }

//<-------------------------------- MOVIMIENTO ------------------------------>//
/*
  Casos (4):
    La columna se mantiene y cambian los renglones  (arriba y abajo)
    El numero de renglon se mantiene y cambia la columna  (izquierda y derecha)
    Cuando aumentan o disminuyen ambos parametros 1 a 1 (diagonal derecha)
    Cuando aumenta el renglon y disminuye la columna o viceversa 1 a 1(diagonal izquierda)
*/
}
