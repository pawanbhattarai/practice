import java.util.*;
public class SearchINRotatedArray {

    public static int Search(int arr[],int target) {
//base case;
        if(arr.length==0)
        return -1;

        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(target==arr[mid])
            return mid;

            if(arr[left]<=arr[mid]){

                if(arr[left]<=target&&target<arr[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }

            }
            else{

                if(arr[mid]<target&&target<arr[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }
        return -1;

        
    }

    public static void main(String[] args) {
        
        int arr[]={4,5,6,7,0,1,2,3};

        int target=2;

        System.out.println(Search(arr, target));

    }
}