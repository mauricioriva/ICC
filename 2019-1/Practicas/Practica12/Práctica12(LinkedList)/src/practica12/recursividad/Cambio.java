
package practica12.recursividad;

import practica12.recursividad.*;


public class Cambio{
	
	int numDiez;
	int numCinco;
	int numDos;
	int numUno;

	public Cambio(int numDiez, int numCinco, int numDos, int numUno){
		this.numDiez = numDiez;
		this.numCinco = numCinco;
		this.numDos = numDos;
		this.numUno = numUno;
	}

	public Cambio(Cambio c){
		this(c.numDiez,c.numCinco,c.numDos,c.numUno);
	}

	public Cambio(){
		this(0,0,0,0);
	}

	public int getNumDiez(){
		return numDiez;
	}

	public int getNumCinco(){
		return numCinco;
	}

	public int getNumDos(){
		return numDos;
	}

	public int getNumUno(){
		return numUno;
	}

	public void setNumDiez(int numDiez){
		this.numDiez = numDiez;
	}

	public void setNumCinco(int numCinco){
		this.numCinco = numCinco;
	}

	public void setNumDos(int numDos){
		this.numDos = numDos;
	}

	public void setNumUno(int numUno){
		this.numUno = numUno;
	}

	public String toString(){
		return "[Coins of 10:" + numDiez + ", Coins of 5:" + numCinco + ", Coins of 2:" + numDos + ", Coins of 1:" + numUno + "]\n";
	}

}