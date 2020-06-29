import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char findFirstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();
        for(var ch: chars) {
            //if (map.containsKey(ch)){
            //     var count = map.get(ch);
            //     map.put(ch, count);
            // } else 
            //     map.put(ch, 1);
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for(var ch : chars) {
            if(map.get(ch) == 1){
                return ch;
            }
        }
    return Character.MIN_VALUE;
    }
}