
public class Arreglos{

	public static void main(String[] args) {
		
	}

	public void m(int x, int y){
		int array [];
		array = new int[x];//x puede ser cero pero no negativo
		for(int i = 0; i < array.length; i++){
			array [i] = y;
		}
	}
	//Declarando arreglos
	int [] a1,a2,a3,a4; //Hacer esto para declarar varios arreglos juntoa
	int b1 [], b2; b3; //NO

	int a [] = new int [6];

	int [] array = {0,2,2,3,4} //extension

	int [] array1 = new int [10];

	int tam = Integer.parseInt(BufferedReader.readline());
	string [] array = new String [tam];
	int i = 0;
	String next = "";
	while(next = BufferedReader.readline()) != null){
		array[i] = next;
		i++;
	}
	BufferedReader.close();
}


	int [] a; //declaracion
	a = new int [//numero de casillas que se apartan(longitud arreglo)];
	//Es un objeto y se guarda en hip
	a.length //que tan grande es el arreglo

	double [] f = new double [5];

	Object [] o = new Object [5]; //Arreglo de referencias

	int x = a[1] //Leer lo que se encuentra en la posición 1

	for(int i = 0;i<a.length;i++){
		System.out.println(a[i]);
		//Sumar todo y dividir entre a.length para la media
	}

	o[3] = "HM";
	o[2] = new Lista();
	o[1] = new Integer(5);
	String x = (String) o[3]; //Aqui se necesita hacer un casting para que funcione.

	//Porque no se puede guardar un object en un string?
	//El hijo tiene mas metodos y atributos que el papá.
	//Toda cadena es un object pero no todo object es una cadena.

	o[0] = new Object[];

	  0	  1 
	0[ 3][2]
	1[-1][8]

	//Declaracion de arreglo de 2 dimensiones

	int [][] m;
	m = new int [2][2];

	m[0][0] = 3;

	m[0][1] = 2;

	m[1][0] = -1;

	m[1][1] = 8;

	Ordenamientos

	Insertion Sort

	private static void swap(int [] a, int i, int j){
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
	}

	public static void ordena(int [] a){
		if (a == null) throw new NullPointerException();

		for (int i = 1; i < a.length ; i++) {
			
			for (int j = i; j>0 && (a[j-1] > a[j]) ; j-- ) {
				swap(a,j,j-1);
			}

		}
	}

	Busqueda

	Debe estar ordenado

	public static int busca(int [] a, int num){

		if (a == null) throw new NullPointerException();

		//if(a.length == 0) return -1;

		if (a.length == 0 || a[0] > num || a[a.length-1] < num) return -1;

		int dini = 0;
		int dfin = a.length-1;
		int m = (dfin + dini) / 2;

		while(dini < dfin){
			if(a[m] == num) return m;
			else if(a[m] < num){ //Derecha
				dini = m + 1;
			}else{ //Izquierda
				dfin = m - 1;
			}
			m = (dfin + dini) / 2;
		}

	}


