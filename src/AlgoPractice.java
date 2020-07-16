import java.util.HashSet;
import java.util.Set;

public class AlgoPractice {
    public static int fibonacci(int n) {
        if(n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static String reversedString(String s) {
        if(s == null) return " ";
        //create stringbuilder var so can be mutable
        StringBuilder reversed = new StringBuilder();
        //iterate over string going backwards
        for (int i = s.length() - 1; i >= 0; i--) 
        //append the result to string builder
            reversed.append(s.charAt(i));

                //return rev as string and not sb object
        return reversed.toString();
    }

    public static String reversedSentence(String sentence) {
        if(sentence.isEmpty() || sentence == null) return "";
        //split the string by spaces
        String[] words = sentence.split(" ");
        //create SB so can use it's features
        StringBuilder reversed  = new StringBuilder();
        //iterate over words and reverse them
        for (int i = words.length - 1; i >=0; i--) 
            reversed.append(words[i] + " ");

        //return reversed but have to turn it back into string
        //not a string builder object & trim white spaces.
        return reversed.toString().trim();

    }

    public static String removeDuplicates(String s) {
        //check if s is null
        if(s == null) return ""; //so don't get null pointer in future 
        //create set so duplicates aren't stored
        Set<Character> seen = new HashSet<>();
        //create a stringbuilder to append chars
        StringBuilder sb = new StringBuilder();
        //iterate through chars in s
        for(char c : s.toCharArray()) {
            //if c is not in seen, add it
            if(!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        var res = fibonacci(9);
        System.out.println(res);

        var res1 = reversedString("hello");
        System.out.println(res1);

        var removedups = removeDuplicates("Hello There");
        System.out.println(removedups);
    }
}