import java.util.*;
public class PermutationCoefficientDP {

    // Time complexity is O(n);
    public static int calculate(int n, int k) {

        int dp[]=new int[n+1];
        dp[0]=1;

        for(int i=1;i<=n;i++){
            dp[i]=i*dp[i-1];
        }
        return dp[n]/dp[n-k];
        
    }
//Time complexity ifs O(n) and space complexity is O(1)
    public static long  solution2(int n,int k) {

        long fn=1;
        long fk=1;

        for(int i=1;i<=n;i++){
            fn*=i;
            if(i==n-k)
            fk=fn;
        }
        long ans=fn/fk;
        return ans;
        
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();

        System.out.println("The permutation cofficient of P("+n+","+ k+")=  "+calculate(n, k));
        System.out.println("The permutation cofficient using second optimum approach of P("+n+","+ k+")=  "+solution2(n, k));
        
        
    }
}