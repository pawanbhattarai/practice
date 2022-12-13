import java.io.*;

class studentInfo implements Serializable{
    String Name;
    String Address;
    int age;

    public studentInfo(String Name, String Address, int age){
        this.Name = Name;
        this.Address = Address;
       this.age = age;

    }
}
public class directory {

   
    
    public static void main(String[] args) throws Exception {
    //     String path = "D:\\Java";
    //     File directory = new File(path);
    //     if (! directory.exists()){
    //         directory.mkdir();
    //     }
    //     File f = new File( path + "\\ankit.txt");
    //     if(!f.exists())
    //     {
    //         f.createNewFile();
    //                 }

    //        System.out.println(f.getName());
    //        System.out.println(f.getPath());
    //     System.out.println(f.exists());


    // }



    studentInfo si=new studentInfo("Pawan", "Ktm",19);
    FileOutputStream fos=new FileOutputStream("D:\\Java\\ankit.txt");
    ObjectOutputStream soo=new ObjectOutputStream(fos);
    soo.writeObject(si);
    fos.close();
    System.out.println("Sucessfull");

    FileInputStream fis=new FileInputStream("D:\\Java\\ankit.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    studentInfo result=(studentInfo)ois.readObject();
    System.out.println(result.Name);

}
}
