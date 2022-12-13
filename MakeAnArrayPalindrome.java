import java.util.*;
public class MakeAnArrayPalindrome {


    //Time complexity=0(n)

    public static int solution(int array[],int n) {

        int ans=0;
        for(int i=0,j=n-1; i<=j;){

            

            if(array[i]==array[j]){
                i++;
                j--;
            }else if(array[i]>array[j]){
                j--;
                array[j]+=array[j+1];
                ans++;
            }else{
                i++;
                array[i]+=array[i-1];
                ans++;
            }

        }
        return ans;


        
    }

    public static void main(String[] args) {
        

        int array[]={15, 4, 15};
        int n=array.length;

        System.out.println(solution(array, n));


    }
    
}
