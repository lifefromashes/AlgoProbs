import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    
    public char findFirstRepeatedChar(String str) {
    Set<Character> set = new HashSet<>();
    var chars = str.toCharArray();
    for(var ch : set) {
        if(set.contains(ch)) return ch;

        set.add(ch);
        }
    
    return Character.MIN_VALUE;
    }
}
    
