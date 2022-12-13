import java.util.*;
public class stack {
    public static void main(String[] args) {

        Stack  animals=new Stack();
        animals.push("dog") ;
        animals.add("cat");
        System.out.println("stack: "+animals);
        System.out.println("pop: "+animals.pop());
        System.out.println("peek:" +animals.peek());
        System.out.println("empty check:" +animals.empty());
        
    }
    
}
