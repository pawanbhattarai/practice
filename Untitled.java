import java.util.*;

class item{


   public String Name,code;
   public float Rate;
   public float quentity;

   
 public float TotalAmount(){
    var amount=Rate*13f/100f;
    return amount;
 }
}
class resturentItem extends item{

    public String Ingrediants; 
    }

}
class Untitled{
    public static void main(String[] args)
    {
        resturentItem rrItem = new resturentItem();
        rrItem.Rate=100;
        rrItem.Name="PIZZA";
        float amount=rrItem.TotalAmount();
        System.out.println(rrItem.Name);
    }
}
