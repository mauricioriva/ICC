package icc.entrada;

public class Fibonacci {

  public static int fibonacci(int n){
    if (n < 0) throw new IllegalArgumentException();
    int fn_2 = 0;
    int fn_1 = 1;
    if(n == 0) return 0;
    else if (n == 1) return 1;
    else { int fn;
      for(int i = 2;i <= n;i ++){
        fn = fn_1 + fn_2;
        fn_2 = fn_1;
        fn_1 = fn;
      }
      return fn;
    }
  }
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    int f = fibonacci(n);
    System.out.println(f);
  }
}
