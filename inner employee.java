import java.util.*;
public class employee{
    String name;
    class innerAddress{

        String street;
        String city;

    }


    
    public String getaddress(){

 
        return street+city;
    }


public static void main(String[] args) {
    



   


employee oe=new employee();
oe.name="lucifer";
employee.inneraddress=oe.new inneraddress();
address.street="anamnager";
address.city="ktm";
System.out.println(address.getaddress());
}
}

