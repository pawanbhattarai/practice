import java.util.*;

public class oop{

    public static void removeDuplicate(String str,int idx, StringBuilder newStr,boolean map[]) {


        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }

    }

    public static int pairingFriends(int n) {

        if(n==1||n==0){
            return n;
        }
        return pairingFriends(n-1)+(n-1)*pairingFriends(n-2);
        
    }
    public static void binaryString(int n, int lastPlace, String str) {

        if(n==0){
            System.out.println(str);
        return;
        }
            binaryString(n-1, 0, str+"0");

            if(lastPlace==0){
                binaryString(n-1, 1, str+"1");
            }
        
    }
    public static void keyFind(int n,int a[],int key) {

        

        
        
            if(n==a.length){

            return;
            }
            if(a[n]==key){
                System.out.println(n+" ");
            }
            keyFind(n+1, a, key);
        }
        
    
    public static void numberToalphabet(int n) {

        if(n==0){
            System.out.println("zero");
        }else if(n==1){
            System.out.println("one");
        }else if(n==2){
            System.out.println("two");
        }else if(n==3){
            System.out.println("three");
        }
        
    }
    public static void stringLenth(String str) {

        if(str.length()==0){
            return;
        }

        int a=str.length();
        System.out.println(a);
        
    }

    public static int count(String str,int i,int j,int n) {

        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int res=count(str, i+1, j, n-1)+count(str, i, j-1, n-1)-count(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
// //   binaryString(4, 0, " ");
//       int a[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
//       int key=2;

    //   System.out.println(pairingFriends(5 ));


    // // keyFind(2);
    // numberToalphabet(201);
    String str="aba";
    int n=str.length();
    // stringLenth(str);
    System.out.println(count(str, 0, n-1, n));
 

    }
}