import java.util.*;
public class employee{
    String name;
    class innerAddress{

        String street;
        String city;

    


    
    public String getaddress(){

 
        return  name+" "+street+" "+city;
    }

    }
public static void main(String[] args) {
    



   


employee oe=new employee();
oe.name="lucifer";
employee.innerAddress address=oe.new innerAddress();
address.street="anamnager";
address.city=" ktm";
System.out.println(address.getaddress());
}
}

