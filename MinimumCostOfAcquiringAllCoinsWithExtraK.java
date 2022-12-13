import java.util.Arrays;

public class MinimumCostOfAcquiringAllCoinsWithExtraK {
    public static int solution(int coins[],int k) {
        int n=coins.length;
        int ans=0;
        Arrays.sort(coins);
        int need_coins=(int)Math.ceil(1.0*n/(k+1));
        // System.out.println(need_coins);
        for(int i=0;i<need_coins;i++){
            ans+=coins[i];
            System.out.println(coins[i]);
            System.out.println();
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int coins[]={100, 20, 50, 10, 2, 5};
        int k=3;
        System.out.println(solution(coins, k));
    }
}
