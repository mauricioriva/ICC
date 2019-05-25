
package icc.primitivos;

public class PruebasPrimitivos{

  public static void main(String args[]){
    ImpresoraBinario ib = new ImpresoraBinario();

//Se establecieron todas las variables del programa
    int max = Integer.MAX_VALUE;
    double nan = Double.NaN;
    double minf = Double.NEGATIVE_INFINITY;
    double pinf = Double.POSITIVE_INFINITY;
    double cero = 0.0;
    double mcero = -0.0;
    double maxdouble = Double.MAX_VALUE;
    double mindouble = Double.MIN_VALUE;
    short permisos = 0754;

    int num1 = 456;
    long num2 = 456;
    float num3 = 456;
    double num4 = 456;

    int num5 = -456;
    long num6 = -456;
    float num7 = -456;
    double num8 = -456;

    int mascara = 15;
    int num = 1408;

    int num9 = (int) -456.601;
    long num10 = (long) -456.601;
    float num11 = (float) -456.601;
    double num12 = (double) -456.601;

//Titulo de la Practica y nombre

    System.out.println("\033[4mPráctica 2 Tipos primitivos y bits\033[0m");
    System.out.println();
    System.out.println("\033[4mMauricio Riva Palacio Orozco\033[0m");
    System.out.println();

//El maximo valor de un entero con 4 bytes y lo que pasa si le sumas 1
    System.out.println("\033[34mInteger max value\033[0m");
    System.out.println(max);
    System.out.println(max+1);
    ib.imprime(max);
    ib.imprime(max+1);
    System.out.println();

//Como expresar la division entre cero ya que no está definida
    System.out.println("\033[34mNot a number 0/0\033[0m");
    System.out.println(nan);
    ib.imprime(nan);
    System.out.println();

//El infinito negativo como se representa en bits
    System.out.println("\033[34mNegative Infinity\033[0m");
    System.out.println(minf);
    ib.imprime(minf);
    System.out.println();

//El infinito positivo como se representa en bits
    System.out.println("\033[34mPositive Infinity\033[0m");
    System.out.println(pinf);
    ib.imprime(pinf);
    System.out.println();

//El cero positivo como se representa
    System.out.println("\033[34mPositive cero\033[0m");
    System.out.println(cero);
    ib.imprime(cero);
    System.out.println();

//El cero negativo como se representa
    System.out.println("\033[34mNegative cero\033[0m");
    System.out.println(mcero);
    ib.imprime(mcero);
    System.out.println();

//Para dar permisos de lectura, escritura y ejecucion
    System.out.println("\033[34mPermisos\033[0m");
    System.out.println(permisos);
    ib.imprime(permisos);
    System.out.println();

//El valor maximo de un numero racional con 8 bytes
    System.out.println("\033[34mDouble max value\033[0m");
    System.out.println(maxdouble);
    ib.imprime(maxdouble);
    System.out.println();

//El valor minimo de un numero racional con 8 bytes
    System.out.println("\033[34mDouble min value\033[0m");
    System.out.println(mindouble);
    ib.imprime(mindouble);
    System.out.println();

//Mover los permisos al agregar 1 cero
    System.out.println("\033[34mCorrimiento de Permisos(1 bit)\033[0m");
    System.out.println(permisos << 1);
    ib.imprime(permisos << 1);
    System.out.println(permisos >> 1);
    ib.imprime(permisos >> 1);
    System.out.println(permisos >>> 1);
    ib.imprime(permisos >>> 1);
    System.out.println();

//Mover los permisos al agregar 3 ceros
    System.out.println("\033[34mCorrimiento de Permisos(3 bits)\033[0m");
    System.out.println(permisos << 3);
    ib.imprime(permisos << 3);
    System.out.println(permisos >> 3);
    ib.imprime(permisos >> 3);
    System.out.println(permisos >>> 3);
    ib.imprime(permisos >>> 3);
    System.out.println();

//Para que todos los usuarios tengan por lo menos permisos de escritura
    System.out.println("\033[34mPermisos de escritura\033[0m");
    System.out.println(permisos | 27);
    ib.imprime(permisos | 27);
    System.out.println();

//Representar un numero en bits
    System.out.println("\033[34mRepresentación del número 456 en bits\033[0m");
    System.out.println("\033[32mint\033[0m");
    ib.imprime(num1);
    System.out.println();

    System.out.println("\033[32mlong\033[0m");
    ib.imprime(num2);
    System.out.println();

    System.out.println("\033[32mfloat\033[0m");
    ib.imprime(num3);
    System.out.println();

    System.out.println("\033[32mdouble\033[0m");
    ib.imprime(num4);
    System.out.println();

//Representar un numero negativo en bits
    System.out.println("\033[34mRepresentación del número -456 en bits\033[0m");
    System.out.println("\033[32mint\033[0m");
    ib.imprime(num5);
    System.out.println();

    System.out.println("\033[32mlong\033[0m");
    ib.imprime(num6);
    System.out.println();

    System.out.println("\033[32mfloat\033[0m");
    ib.imprime(num7);
    System.out.println();

    System.out.println("\033[32mdouble\033[0m");
    ib.imprime(num8);
    System.out.println();

//Hacer que una variable pueda representar un numero al quitarle los puntos decimales
    System.out.println("\033[34mCasting de -456.601\033[0m");
    System.out.println("\033[32mint\033[0m");
    System.out.println(num9);
    ib.imprime(num9);
    System.out.println();

    System.out.println("\033[32mlong\033[0m");
    System.out.println(num10);
    ib.imprime(num10);
    System.out.println();

    System.out.println("\033[32mfloat\033[0m");
    System.out.println(num11);
    ib.imprime(num11);
    System.out.println();

    System.out.println("\033[32mdouble\033[0m");
    System.out.println(num12);
    ib.imprime(num12);
    System.out.println();

//Es un corrimiento de un numero
    System.out.println("\033[34mMascara\033[0m");
    System.out.println(mascara);
    ib.imprime(mascara);
    System.out.println();
    System.out.println(mascara << 3);
    ib.imprime(mascara << 3);
    System.out.println();

//Operaciones usando variables
    System.out.println("\033[34mOperaciones\033[0m");
    System.out.println("\033[32mnum & mascara\033[0m");
    System.out.println(num & mascara);
    ib.imprime(num & mascara);
    System.out.println("\n\033[32mnum | mascara\033[0m");
    System.out.println(num | mascara);
    ib.imprime(num | mascara);
    System.out.println("\n\033[32mnum ^ mascara\033[0m");
    System.out.println(num ^ mascara);
    ib.imprime(num ^ mascara);
    System.out.println();

  }

}
