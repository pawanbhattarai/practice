import java.util.*;

public class FormTheBiggestNumber {

    public static void solution(Vector<String> v) {
        
  

    Collections.sort(v,new Comparator<String>(){
        @Override
        public int compare(String x,String y) {

            String xy=x+y;
            String yx=y+x;

            return xy.compareTo(yx)>0? -1: 1;


            
        }
    });

    Iterator it=v.iterator();

    while(it.hasNext()){
        System.out.print(it.next());
    }
}
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("54");
        v.add("546");
        v.add("548");
        v.add("60");

      solution(v);
      
    }
}
