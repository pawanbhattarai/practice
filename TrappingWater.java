public class TrappingWater {

    public static int trapping(int piller[]) {

        int left=0;
        int right=piller.length-1;
        int left_Max=0;
        int right_Max=0;
        int sum=0;

        while(left<=right){
            left_Max=Math.max(left_Max,piller[left]);
            right_Max=Math.max(right_Max,piller[right]);

            if(left_Max<right_Max){
                sum+=left_Max-piller[left++];
            }else{
                sum+=right_Max-piller[right--];
            }
        }
        return sum;
        
    }

    public static void main(String[] args) {
        
        int piller[]={4,2,0,3,2,5};
        System.out.println(trapping(piller));
    }
    
}
