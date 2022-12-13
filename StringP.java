import java.util.*;
public class StringP {

    //Most commonly used java String class methods

    public static void main(String[] args) {
        
        String name="Pawan Bhattarai";
        String name2="Ankit Mishra";


        //.replace is used to replace current string to required
       String name3=name.replace(name2,name);
       System.out.println(name2);

       //.length() is used to find out the length of string along with space
     int l=name2.length();
        System.out.println(l);

      //.equals() is used to compare between two string 
        boolean a=name3.equals(name);
        System.out.println(a);

        //.charAt is used to get character of desire index

        char chr=name.charAt(4);
        System.out.println(chr);

        // .concat() is used to concatinate to string or character in a single line
        String concat=name.concat(" "+name2);
        System.out.println(concat);

        
        //.toUpperCase is used to make all String to uppercase 
        System.out.println(name.toUpperCase());

        //.toLowerCase is used to make all String to lowerCase
        System.out.println(name.toLowerCase());
        // String repl=name.replace("Bhattarai","Mishra");

        
        String ans=name.substring(0,5);
       System.out.println(ans);


        
      
 
        
        
    }
    
}
