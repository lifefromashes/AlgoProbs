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

    
    public static void main(String[] args) {
        isAnagram("Keep", "Peek");
        isAnagram("Mother in law", "Hitler Woman");
    }
}