import java.util.*;

public class ChocolateDistribution {

    public static int MinDiff(int array[], int n, int m) {

        if(n==0||m==0){
            return 0;
        }
        
        Arrays.sort(array);

        if(n<m){
            return -1;
        }

        int min_Diff=Integer.MAX_VALUE;

        for(int i=0;i+m-1<n;i++){

            int diff=array[i+m-1]-array[i];
            if(diff<min_Diff){
                min_Diff=diff;
            }


        }
        return min_Diff;
        
    }


    public static void main(String[] args) {

        int array[]={ 12, 4,  7,  9,  2,  23, 25, 41, 30,
            40, 28, 42, 30, 44, 48, 43, 50};
        int m=7;
        int n=array.length;
        System.out.println(MinDiff(array, n, m));
        
    }
    
}
