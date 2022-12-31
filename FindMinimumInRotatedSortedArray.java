import java.util.*;
public class FindMinimumInRotatedSortedArray {
 
        public static int findMin(int[] nums) {
            if(nums.length==1)
          return nums[0];
    
          int n=nums.length-1;
          int i=0;
    
          if(nums[n]>nums[0])
          return nums[0];
    
          
    
          while(n>=i){
              int mid=i+(n-i)/2;
    
               if (nums[mid] > nums[mid + 1]) {
                    return nums[mid + 1];
                }
    
                if (nums[mid - 1] > nums[mid]) {
                    return nums[mid];
                }
    
              if(nums[mid]>nums[0]){
                i=mid+1;
              }else{
             
                  n=mid-1;
              }
             
          }
          return 0;
            
        }
    
    
    public static void main(String[] args) {
        int nums[]={3,4,5,0,1,2};
        System.out.println(findMin(nums));
    }
}
