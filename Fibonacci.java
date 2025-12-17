import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = fibonacci(n, new int[n+1]);
        System.out.println(ans);
    }

    //Using basic approachhit 
//     private static int fibonacci(int n) {
//         if(n ==0 || n==1){
//             return n;
//         }
//         //System.out.println("Fibonacci called for n="+n);
//         return fibonacci(n-1)+fibonacci(n-2);
       
//   }

  //Using DP approach

  private static int fibonacci(int n, int[] qb) {
    if(n ==0 || n==1){
        return n;
    }
    //check if ans already exists
    if(qb[n] != 0){
        return qb[n];
    }

    int fib1 = fibonacci(n-1, qb);
    int fib2 = fibonacci(n-2, qb);

    return qb[n] = fib1 + fib2;

   }
}
