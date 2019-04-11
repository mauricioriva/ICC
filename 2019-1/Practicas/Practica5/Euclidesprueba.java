package icc.recursion;

public class Euclides{

  public static int mcd(int a, int b){

    if (a < 0 || b < 0) throw new ArithmeticException("No se permiten números negativos");

    if (b == 0) return a;
    else return mcd(b, a % b);

  }

  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    }

    if(args.length == 2){
      int r = mcd(a,b);
      System.out.println("mcd(" + a + "," + b + ") = " + r);
    }
  }
}
