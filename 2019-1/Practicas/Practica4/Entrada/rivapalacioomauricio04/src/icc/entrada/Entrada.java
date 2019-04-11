package icc.entrada;

public class Entrada {

  public static void main(String[] args) {
    int r;
    boolean b;

    if(args.length == 1){
      r = Integer.parseInt(args[0]);
      System.out.println("\n>" + r);

      b = esPrimo(r);
      if(b){
        System.out.println("El numero " + r + " es primo.\n");
      }else{
        System.out.println("El numero " + r + " NO es primo.\n");
      }

    }

  }

  public static boolean esPrimo(int n) {
    if(n <= 1){
      return false;
    }
    if (n == 2){
      return true;
    }
    int contador = 2;
    if((n % contador) != 0){
      while((n % contador) != 0){
        contador++;
        if((n == contador)){
          return true;
        }
      }
    }
    return false;
  }
}
