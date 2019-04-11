package icc1.practica3;

import icc1.interfaz.Consola;

/*
Practica 3: Variables, tipos y operadores
Mauricio Riva Palacio Orozco  316666343
*/
public class Prueba {

  public static void main (String[] args) {
    Consola c;
    c = new Consola ("Valores de variables");
    //c.imprime ("Hola Mundo");
    System.out.println("Valores de variables\n");
    System.out.println("Hola mundo.\n");
    System.out.print("Hola mundo.");
    System.out.print("Adios mundo.\n");
    System.out.println();
    System.out.println("Hola mundo.");
    System.out.println("Adios mundo.\n");

    int a;
    a = 5;
    System.out.println("a = " + a + "\n");

    int b = 2;
    float o = (float) 1.5;
    System.out.println("2 + 1.5 = " + (b + o) +"\n");

    int d = 13;
    int e = 19;
    int f = d | e;
    System.out.println("13 | 19 = " + f + "\n");

    int g = 3 + 2 * 5;
    System.out.println("3 + 2 * 5 = " + g + "\n");

    int h = (3 + 2) * 5;
    System.out.println("(3 + 2) * 5 = " + h + "\n");
/*
  int i += 10
  Es lo mismo que:
  int i = i + 10
*/  System.out.println("a++");
    int j = 5;
    int k = j++;
    System.out.println(j + "\n" + k + "\n");

    System.out.println("++a");
    int l = 5;
    int m = ++l;
    System.out.println(l + "\n" + m + "\n");


/*
  if (n < o && o < p);

  int q = (r < s) ? 1 : 0;

  int t = (u < 0) ? -u : u;
*/

    System.out.println("Ejercicios\n");
    System.out.println("Modulo de 2 flotantes");
    System.out.print("9.8 % 5.2 = ");
    float w = (float)9.8;
    float s = (float)5.2;
    float r = w % s;
    System.out.print(r);
    System.out.println("\n");

    System.out.println("Resta de flotantes");
    float x = 1F;
    float y = 0.00000001F;
    float z = y - x;
    System.out.println(z + "\n");

    System.out.println("1 >> 1");
    System.out.println(1>>1);
    System.out.println();
    System.out.println("-1 >> 1");
    System.out.println(-1>>1);
    System.out.println();

    boolean p = true;
    boolean q = false;

    System.out.println("p = true\tq = false");
    System.out.println("¬(p ∧ q)");
    boolean t = !(p && q);
    System.out.println(t + "\n");

    System.out.println("¬p v ¬q");
    boolean u = (!p || !q);
    System.out.println(u + "\n");

    System.out.println("De Morgan 4 casos");
    System.out.println("p\tq\t¬(p ∧ q)\t¬p v ¬q\n");
    System.out.println("0\t0\t  "+t+"\t\t "+u);
    System.out.println("0\t1\t  "+t+"\t\t "+u);
    System.out.println("1\t0\t  "+t+"\t\t "+u);
    System.out.println("1\t1\t  "+(!t)+"\t\t "+(!u)+"\n");

    int a1 = 1;
    int b2 = 2;
    int c3 = 3;
    System.out.println("(a > 3 && ++a <= 2) ? b++ : c--)");
    int d4 = ((a1 > 3 && ++a1 <= 2) ? b2++ : c3--);
    System.out.println("a = "+a1+"\nb = "+b2+"\nc = "+c3+"\n");

  }
}
