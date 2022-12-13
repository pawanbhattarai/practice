public class mergeShortOfString {

    String removeWhiteSpaces(String input){
        StringBuilder output = new StringBuilder();
        
        char[] charArray = input.toCharArray();
        
        for(char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        
        return output.toString();
    }
   
   
    public static void main(String[] args) {
    //    String s="     pawan Bhattarai";
    //    s=s.strip();
    //    System.out.println(s);

        toString("Pawan Bhattarai");

    }
    
}
