import java.util.*;


public class ReverseAndAscendingTheArray {

    //This method is created to push array on the Stack 

    public static void PrintArray(int n,int array[],Stack<Integer> Array) {
        
        for(int i=0;i<n;i++){
            Array.push(array[i]);
           
        }
    }

    //This method is created to add array on priority queue
        public static void PrintAss(int n,int array[],PriorityQueue<Integer> pq) {
        
            for(int i=0;i<n;i++){
               
                pq.add(array[i]);
            }
    
        
    }

    //This method is created to print the array int the reverse form

    public static void Printing(int n,Stack<Integer> Array) {

        System.out.println("The reverse form of the entered array are ");
        for(int i=0;i<n;i++){
            int ans=Array.pop();
        
            
            System.out.println(ans);
            
        }
        System.out.println();
        
    }

    
    //This method is created to print the array on ascending order 
    public static void Print(int n,int array[],PriorityQueue<Integer> pq) {
        System.out.println("The Ascending order of the entered array are ");
        for(int i=0;i<n;i++){

            int answ=pq.poll();
            System.out.println(answ);
           
        }
    }

    public static void main(String[] args) {

        Stack<Integer> Array=new Stack<Integer>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size for the array");
        int n=sc.nextInt();
        System.out.println("Enter the Array elements");
        int array[]=new int[n];
        for(int i=0;i<n;i++){
           array[i]= sc.nextInt();
        }
        
        PrintArray(n, array, Array);
        
        PrintAss(n, array, pq);
        Printing(n, Array);
        Print(n, array, pq);
        
        
        
        
    }
}