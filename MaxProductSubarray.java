public class MaxProductSubarray {

    public static int  maxpoduct(int array[]) {
//here i initilize all to the arry[0] because 
//if the only one number of arry is in -ve this method return that value as a max product
        int max=array[0];
        int min=array[0];
        int ans=array[0];

        int n=array.length;

        if(n==0){
            return 0;
        }

        for(int i=1;i<n;i++){


            int temp=max;
            max=Math.max(Math.max(max*array[i], min*array[i]),array[i]);
            min=Math.min(Math.min(temp*array[i], min*array[i]),array[i]);

            if(max>ans){
                ans=max;
            }

        }
  
        return ans;
    }

    public static void main(String[] args) {
        int array[]={-2};

        System.out.println(maxpoduct(array));
    }
}
