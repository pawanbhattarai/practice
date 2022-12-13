public class StringBufferP {
    public static void main(String[] args) {
        
        StringBuffer practice=new StringBuffer("Hi i am pawan ");
    //.length() is used to print length of the String buffer
        System.out.println(practice.length());
        //.capacity() is used to print the occupied string
        System.out.println(practice.capacity());

        //.append() is used to concatinate the two string on a single line
        System.out.println(practice.append(" Bhattarai"));

        //.insert() is used to insert the value on desire index
        System.out.println(practice.insert(3, "Everyone, "));

        //.delete() is used to delete the string from given starting index to ending index
        System.out.println(practice.delete(2, 11));

        //.deleteCharAt() is used to delete the character of given index
        System.out.println(practice.deleteCharAt(2));
        
          //.reverse() is used to reverse the StringBuffer
          StringBuffer a=new StringBuffer("43244");
        System.out.println(a.reverse());
    }
    
}
