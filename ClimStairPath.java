import java.util.Scanner;

public class ClimStairPath {


    //Basic Approach
    public static int climbStairPathUsingRecursion(int n){
        if(n == 0 ){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        int n1 = climbStairPathUsingRecursion(n-1);
        int n2 = climbStairPathUsingRecursion(n-2);
        int n3 = climbStairPathUsingRecursion(n-3);

        int cp = n1 + n2 + n3;

        return cp;
    }




    // DP Approach---MEMORIZATION
    public static int climbStairPath(int n, int []dp){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        
        if(dp[n] != 0){
            return dp[n]; 
        
        }

        int n1 = climbStairPath(n-1, dp);
        int n2 = climbStairPath(n-2, dp);
        int n3 = climbStairPath(n-3, dp);


        int cp = n1 + n2 + n3;

        dp[n] = cp;
        return cp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // int ans = climbStairPath(n, new int[n+1]);

        int ans = climbStairPathUsingRecursion(n);
        System.out.println(ans);
    }
}
