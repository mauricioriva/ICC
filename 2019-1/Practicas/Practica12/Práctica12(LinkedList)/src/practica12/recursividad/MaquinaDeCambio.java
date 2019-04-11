
package practica12.recursividad;

import practica12.recursividad.*;
import java.util.LinkedList;

public class MaquinaDeCambio{
	
	private int cont;
	private LinkedList<Cambio> list;

	public LinkedList<Cambio> getCambio(int cambio){
		list = new LinkedList<>();
		cont = 0;
		Cambio c = new Cambio(1,1,1,1);
		Cambio a = new Cambio();
		getCambio(a,cambio,c);
		System.out.println("Iteraciones: " + cont);
		return list;
	}

	public void getCambio(Cambio actual, int cantidad, Cambio monedas){
		int next;
		Cambio aux;
		cont++;
		if(cantidad == 0){
			list.add(actual);
		}else{
			next = getNext(monedas,cantidad);
			if(next != 0){
				aux = new Cambio(monedas);
				takeCoin(aux,next);
				getCambio(new Cambio(actual),cantidad,aux);
				giveCoin(actual,next);
				getCambio(actual,cantidad - next, monedas);
			}
		}
	}

	public int getNext(Cambio c, int i){
		if(c.getNumDiez() > 0 && i >= 10){
			return 10;
		}else if (c.getNumCinco() > 0 && i >= 5){
			return 5;
		}else if (c.getNumDos() > 0 && i >= 2){
			return 2;
		}else if (c.getNumUno() > 0 && i >= 1){
			return 1;
		}else{
			return 0;
		}
	}

	public void takeCoin(Cambio c, int i){
		if(i == 10){
			c.setNumDiez(0);
		}else if(i == 5){
			c.setNumCinco(0);
		}else if(i == 2){
			c.setNumDos(0);
		}else if(i == 1){
			c.setNumUno(0);
		}
	}

	public void giveCoin(Cambio c, int i){
		if(i == 10){
			c.setNumDiez(c.getNumDiez()+1);
		}else if(i == 5){
			c.setNumCinco(c.getNumCinco()+1);
		}else if(i == 2){
			c.setNumDos(c.getNumDos()+1);
		}else if(i == 1){
			c.setNumUno(c.getNumUno()+1);
		}
	}

}