import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInSentence {
    public static String reverseWords(String sentence) {
        // String[] words = sentence.split(" ");
        // StringBuilder reversed = new StringBuilder();
        // for (int i = words.length - 1; i >= 0; i--) 
        //     reversed.append(words[i] + " ");

        // return reversed.toString().trim(); //trim otherwise would have extra whitespace from append
        //BELOW: More succinct way to code it
        if(sentence == null) return "";
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        var res = reverseWords("You Are Beautiful!");
        System.out.println(res);
    }
}