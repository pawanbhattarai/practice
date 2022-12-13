import java.util.*;
public class productOfArrayExceptAll {


    public static  int[] resust(int array[]) {
        int n=array.length;

        int[] result = new int[n];

for (int i = 0, tmp = 1; i < n; i++) {
    tmp *= array[i];
    result[i] = tmp;
    
}
for (int i = n- 1, tmp = 1; i >= 0; i--) {
    result[i] *= tmp;
    tmp *= array[i];
}
return result;
}
    
    public static void main(String[] args) {
        
    
        int array[]={1,2,3,4};
        System.out.println(resust(array));
    }
}
