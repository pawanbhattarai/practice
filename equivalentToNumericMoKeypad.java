import java.util.*;

public class equivalentToNumericMoKeypad {

    public static String solution(String str[],String input) {
        int n=input.length();
        

        String output=" ";

        for(int i=0;i<n;i++){

            if(input.charAt(i)==' ')
            output+="0";
            else{
                int position=input.charAt(i)-'A';
                System.out.println(position);
                output+=str[position];
            }

        }
        return output;
        
    }
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter the string to convert it equivalent to numeric mobile keypad");
        String input=sc.next().toUpperCase();
        String str[]={"2" , "22","222","3","33","333",
                             "4","44","444","5","55","555",
                             "6","66","666","7","77","777",
                             "7777","8","88","888","9","99",
                             "999","9999"};
        System.out.println(solution(str, input));
     

        
    }
    
}
