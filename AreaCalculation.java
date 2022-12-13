import java.util.Scanner;

abstract class AreaBase{
    abstract float Area();
    float height;
    float width;
    public AreaBase(float h,float w){
        height=h;
        width=w;
    }
}
class BedRoom extends AreaBase{
    float length;
 
    
    public BedRoom(float l,float h, float w){
        

        super(h, w);
        length=l;
    }

public float Area(){
    
    
    return length*height*width;
}
}

class DinningRoom extends AreaBase{
    public DinningRoom(float w, float h){
        super(h, w);

    }
            public float Area(){
                
                return width*height;
            }
        }
    
public class AreaCalculation {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);


        // System.out.println("Enter length");
        // int l=sc.nextFloat();
        // System.out.println("Enter height");
        // int h=sc.nextFloat();
        // System.out.println("Enter width");
        // int w=sc.nextFloat();

        AreaBase ab=new BedRoom(20, 30, 20);
        System.out.println(ab.Area());
        ab=new DinningRoom(20, 30);
        // System.out.println(ab.Area());
        
    }
}
