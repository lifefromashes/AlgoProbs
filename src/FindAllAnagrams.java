import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || s == null) return result;

        int[] charCount = new int[26];

        for(char c : p.toCharArray()) {
            charCount[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int count = p.length();

        while(right < s.length()) {
            if(charCount[s.charAt(right++) - 'a']-- >= 1) count--;

            if(count ==0 ) {
                result.add(left);
            }

            if (right - left == p.length() && charCount[s.charAt(left++)- 'a']++ >= 0) count++; {
          
            }
        }

        return result;

        
    }
    
}