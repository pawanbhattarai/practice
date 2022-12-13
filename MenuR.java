
class menu{
    String Name;
    String Link;
    public menu[] childs;
    public menu()
    {
        childs=new menu[10];
    }
}

public class MenuR {

    public static void main(String[] args) {
        
        menu rootMenu=new menu();
        rootMenu.Name="Contact us";
        rootMenu.Link="Youtube.com";


        menu childmenue=new menu();
        childmenue.Name="Chatpate";
        

        menu mashala=new menu();
        mashala.Name="Mashala";
        childmenue.childs[0]=mashala;
        rootMenu.childs[0]=childmenue;

        System.out.println(rootMenu.Name);
         for(var chatpate:rootMenu.childs )
         {
            System.out.println("-----------"+chatpate.Name);
            for(var mas:chatpate.childs )
         {
            System.out.println("----------------------"+mas.Name);
            
         }

         }


    }
    
}
