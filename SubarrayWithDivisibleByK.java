import java.util.*;

public class SubarrayWithDivisibleByK {


    public static int solution(int array[],int k) {

        Map<Integer,  Integer> mp = new HashMap<>();
 

        int max_len=0;
        int sum=0;

        for(int i=0;i<array.length;i++){
            sum+=array[i];

            int mod=((sum%k)+k)%k;

            if(mod==0)
            max_len=i+1;

            if(!mp.containsKey(mod)){
                mp.put(mod, i);
            }else{
                int size=i-mp.get(mod);
                max_len=Math.max(max_len, size);
            }
        }
        return max_len;
        
    }

    public static void main(String[] args) {

        int array[]={ 2, 7, 6, 1, 4, 5 };
        int k=3;

        System.out.println(solution(array, k));
        
    }
    
}
