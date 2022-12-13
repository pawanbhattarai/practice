public class pairWithSumOfSortedAndRotedArr {

    public static boolean find(int array[],int x) {

        int i;
        int n=array.length;
        for( i=0;i<n-1;i++){
            if(array[i]>array[i+1]){
                break;
            }
        }
        // l is now index of smallest element
        //int l=(i+1)%n
            int l=(i+1)%n;

            // r is now index of largest element
            int r=i;
            while(l!=r){
                if(array[l]+array[r]==x)
                return true;

                if(array[l]+array[r]<x)
                l=(l+1)%n;

                else
                r=(n+r-1)%n;
            }
           
        
        return false;
    }
    
    public static void main(String[] args) {
        int array[]={11, 15, 6, 8, 9, 10 };
        int x=15;

        

        System.out.println(find(array,x));
    }
}
