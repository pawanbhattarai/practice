import java.util.Arrays;

public class kthLargest {

    //kth largest

    public static int  largest(int array[],int k) {

        Arrays.sort(array);

        return array[array.length-k];
        
    }

    //kth smallest
    
    public static int smallest(int array[],int k) {

        Arrays.sort(array);

    return array[k-1];
        
    }

    public static void main(String[] args) {
        int k=3;
        int array[]={2,7,1,0,4,6,2,4};
        System.out.println(largest(array, k));
        System.out.println(smallest(array, k));
    }
    
}
