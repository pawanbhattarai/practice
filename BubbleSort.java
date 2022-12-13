import java.util.Scanner;

public class BubbleSort {
    public static void swap(int a[]) {

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){

                if(a[j]>a[j+1]){

            int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
            }
            }

        }
        

        
    }

    
        

        public static void printBublle(int a[]) {
            
         
            System.out.println("The sorted array using Bubble Sort");

            for(int i=0;i<a.length;i++){
                
                System.out.println(a[i]+" ");
            }
            
         }
        

      

    

    

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        BubbleSort ob=new BubbleSort();
        System.out.println("Enter the size for array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        ob.swap(a);
       ob.printBublle(a);
        
    }
    
}
