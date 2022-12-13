import java.util.*;

public class BestTimeToBuyStock {

    public static int maxProfit(int numbers[]) {

        int profit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            buy=Math.min(buy, numbers[i]);
            profit=Math.max(profit, numbers[i]-buy);
        }

        return profit;
        
    }

    public static void main(String[] args) {
        int numbers[]={1,3,6,2};

        System.out.println(maxProfit(numbers));
    }
    
}