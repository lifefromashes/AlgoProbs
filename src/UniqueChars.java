import java.util.HashMap;
import java.util.HashSet;

public class UniqueChars {

    public static void countUniques(String str) {


        HashSet<Character> set = new HashSet<>();
        char[] charArr = str.toCharArray();

        // for(int i = 0; i < charArr.length; i++) {
        //     set.add(charArr[i]);
        // }
        for(char c: charArr) {
            set.add(c);
        }
      
       
        HashSet<String> set2 = new HashSet<>();
        String[] arr = str.split(" ");
        // for(int i = 0; i < arr.length; i++) {
        //     set2.add(arr[i]);
        // }
        for(String s: arr) {
            set2.add(s);
        }

        HashSet<String> set3 = new HashSet<>();
        String[] arr2 = str.split("\\.");
        for(int i = 0; i < arr2.length; i++) {
            set3.add(arr2[i]);
        } 
    
        System.out.println("UniqueCharacters: " + set.size());
        System.out.println("Unique Words: " + set2.size());
        System.out.println("Unique Sentences: " + set3.size());
    }

    public static void main(String[] args) {
        String string = "Hello, my name is Joe. Today is my birthday. Today is my birthday. No really, today is my birthday!";
        countUniques(string);


    }
    
}