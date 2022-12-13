public class ContainerWithMostWater {


    //Time Complexity :- BigO(N)

//Space COmplexity :- BigO(1)


    public static int solution(int height[]) {

        int left=0;
        int right=height.length-1;
        int max=0;

    while(left<right){
        int width=right-left;
        int heights=Math.min(height[left],height[right]);
        int area=heights*width;
        max=Math.max(max, area);
      
        if(height[left]==height[right]){
            left++;
            right--;
        }
        if(height[left]<height[right]){
            left++;
        }else{

            right--;
      
        }



        
    }
    return max;
        
    }
    public static void main(String[] args) {

        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println(solution(height));
        
    }
}
