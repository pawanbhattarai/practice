import java.util.*;

class name{
    String firstName,lastName;
    int age;

String NameFirst(String newfirstName,String newlastName){

    firstName=newfirstName;
    lastName=newlastName;
    return firstName+lastName;

}
void takeAge(int newage){

    age=newage;

}
}
  public class Untitled{
    public static void main(String[] args) {
        
    name o=new name();
    // o.NameFirst("pawan", "Bhattarai");
    System.out.println(o.NameFirst("Pawan", "Bhattarai"));
        
    }
        
}
    

