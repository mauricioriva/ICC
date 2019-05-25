package icc.recursion;

public class Euclides{

  public static void main(String[] args){
    int i,j;
    if(args.length == 2){
      i = Integer.parseInt(args[0]);
      j = Integer.parseInt(args[1]);
      demo(i,j);
    }else{
        System.out.println("El numero de parametros no es válido.");
        demo(6,4);
        demo(7,5);
        demo(50,5);
        demo(1,9);
        demo(6235487,522378);
    }
  }

  public static void demo(int i, int j){
    int r;
    System.out.println();
    r = euclides(i,j);
    System.out.println("El mcd de " + i + " y " + j + " es: " + r);
    System.out.println("------------\n");
  }


  public static int euclides(int a,int b){
    int aux;
    if (a <= 0) throw new ArithmeticException("El parametro " + a + " no es mayor a cero.");
    if (b <= 0) throw new ArithmeticException("El parametro " + a + " no es mayor a cero.");
    if (a < b){
      aux = a;
      a = b;
      b = aux;
    }

    return euc(a,b);
  }

  private static int euc (int a, int b){
    if (b == 0) return a;
    else return euc(b, a % b);
  }

}
