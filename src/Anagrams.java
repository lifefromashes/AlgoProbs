import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    //check to see if 2 strings are anagrams of each other
    //ex: rail safety, fairy tales) -->true

    public static void isAnagram(String a, String b) {
        String s1 = a.replaceAll("\\s", "");
        String s2 = b.replaceAll("\\s", "");
        boolean status = true;

        if(s1.length() != s2.length()) {
            status = false;
        } else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            status = Arrays.equals(arr1, arr2);
        }
        if(status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");

        }else {
            System.out.println(s1 + " and" + s2 + " are not anagrams");
        }
    }

        public static Boolean isAnagram2(String a, String b) {
            int aLength = a.length();
            int bLength = b.length();

            if(aLength != bLength) {
                return false;
            }

            a = a.toLowerCase();
            b = b.toLowerCase();

            String s1 = a.replaceAll("\\s", "");
            String s2 = b.replaceAll("\\s", "");

            //create array of size alphabet 26 and holds the count for each letter
            int[] charFreq = new int[26]; 
            for(int i = 0; i < aLength; i++) {
                int currChar = s1.charAt(i);
                int index = currChar - 'a'; //this subtracts between chars and converts it to ascii value and 
                //ascii is associated with the position in char freq array
                charFreq[index]++; 
            }

            for(int i = 0; i < bLength; i++) {
                int currChar = s2.charAt(i);
                int index = currChar - 'a';
                charFreq[index]--; //decremement this so that it will take it back out again
                //bc we want it to be 0 if they are anagrams
            }

            //every element should be zero if they are anagrams
            for (int i = 0; i < 26; i++) { 
                if(charFreq[i] != 0) {
                    return false;
                }
            }
            return true;

        }
    

    
    public static void main(String[] args) {
        isAnagram("Keep", "Peek");
        isAnagram("Mother in law", "Hitler Woman");

        System.out.println(isAnagram2("Keep", "Peek"));
        System.out.println(isAnagram2("Mother in law", "Hitler Woman"));
    }
}