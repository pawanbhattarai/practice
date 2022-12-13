class student{
    int mark;
}
public class passingByValue {

  
    static void incrementByten(student std){
        std.mark=std.mark+10;
    }
    public static void main(String[] args) {
        int marks=20;
        System.out.println(marks);
        incrementByTen(mark);
        
        System.out.println(marks);
        System.out.println("Call by reference");

        student std=new student();
        std.mark=20;
        System.out.println(std.mark);
        incrementByten(std);
        System.out.println(std.mark);

    }
    static void incrementByTen(int value){
        value+=10;
    }
}
