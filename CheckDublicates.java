import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class CheckDublicates {

    //Using has set! O(n)

    public static boolean check(int array[]) {
        Set<Integer> pq=new HashSet<Integer>();
        for(int arrays: array){
            
            if(pq.contains(arrays)){
        
            return true;
        }else pq.add(arrays);
        

        

        
    }
        return false;
    }

    // using condition statement

    public static boolean Chek(int array[]) {

        if(array.length<2){
            return false; 
        }
            Arrays.sort(array);
            for(int i=0;i<array.length-1;i++){

                if(array[i]==array[i+1]){
                    return true;
                }

            }
            return false;
        
        
    }
    public static void main(String[] args) {
        
        int array[]={2,1,3,4,6,3,1};

        System.out.println(Chek(array));

        System.out.println(check(array));




    
}
    
}
