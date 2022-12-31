import java.util.*;
public class MinStepToMakePilesEqualHeight {

    

    public static int solution2 (int[] que) {

        int n=que.length;
        if(n<=1)
        return 0;

        int ans=0;
        int distinctNumber=0;

        for(int i=1;i<n;i++){
            if(que[i]==que[i-1]){
                ans+=distinctNumber;

            }
            else{
                distinctNumber++;
                ans+=distinctNumber;
            }
        }
        return ans;
    }
public static void main(String[] args) {

    int que[]={5,2,1,1,0};

    System.out.println(solution2(que));
}
    
}