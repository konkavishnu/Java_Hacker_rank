import java.util.stream.IntStream;

public class Palin_streams {

    public static void main(String[] args) {

         isPalindrome();
        
    }

    public static boolean isPalindrome(){

        String originalString = "radar";
        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
        System.out.println(tempString);
        return IntStream.range(0, tempString.length() / 2)
            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));


    }
    
}
