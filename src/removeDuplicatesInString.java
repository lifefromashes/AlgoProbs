import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesInString {
    
    public static String removeDuplicates(String str) {
        if (str == null) return "";

        StringBuffer output = new StringBuffer();
        Set<Character> seen = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if(!seen.contains(ch)){
                seen.add(ch);
                output.append(ch);
            }
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String output = "Trees are very beautiful";

        var res = removeDuplicates(output);
        System.out.println(res);
    }

}