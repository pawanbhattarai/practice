import java.util.*;

public class SumOfSubArray {

    public static int Sum (int array[]) {

        int sum=0;
        int maxsum=array[0];//maxsum=Integer.MIN_VALUE
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            maxsum=Math.max(maxsum, sum);
            

            if(sum<0){
                sum=0;
                
            }
            

        }
      
        return maxsum;

    }
    public static void name(int array[],ArrayList<Integer> ar) {

        for(int i=0;i<array.length;i++){
            
            int p=Math.max(array[0],array[i+1]);
            
            if(p>0){
                ar.add(p);
                
            }

            

        }
        for(int i=0;i<array.length;i++){
            System.out.print(ar.get(i)+" ");
        }
        
    }
    public static void main(String[] args) {

        ArrayList<Integer> ar=new ArrayList<>();

       

        int array[]={-2,1,-3,4,-1,2,1,-5,4};
  System.out.println(
    Sum(array));
    name(array,ar);;

    }
    
}
