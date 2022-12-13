import java.util.*;
public class minimumFromRotatedArray {

   //Time complexity O(logn)
        public static int findMin(int[] num) {
            // This condition is needed to handle the case when
        // array is not rotated at all
        int high=num.length-1;
        int low=0;
        if (high < low)
        return num[0];

    // If there is only one element left
    if (high == low)
        return num[low];

    // Find mid
    int mid
        = low + (high - low) / 2; /*(low + high)/2;*/

    // Check if element (mid+1) is minimum element.
    // Consider the cases like {3, 4, 5, 1, 2}
    if (mid < high && num[mid + 1] < num[mid])
        return num[mid + 1];

    // Check if mid itself is minimum element
    if (mid > low && num[mid] < num[mid - 1])
        return num[mid];

    // Decide whether we need to go to left half or
    // right half
   
    return findMin(num);
}
        //Another apporach O(n)

        public static int mini(int num[]) {

            int min_element=num[0];

            for(int i=0;i<num.length;i++){
                if(num[i]<min_element){
                    min_element=num[i];
                }
            }
            return min_element;
        }
    public static void main(String[] args) {
        int num[]={3,4,5,6,-1,0,2};
        System.out.println(findMin(num));
        System.out.println(mini(num));

    }
}
