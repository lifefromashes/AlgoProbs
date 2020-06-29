import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HMPract {
    public static void main(String[] args) {

  //find first non repeated Character
  // a green apple
  // a = 2 bc we have 2 a's in this string
  //  = 2 (bc we have two spaces)
  //g = 1
  //etc
        CharFinder fin = new CharFinder();
        var ch = fin.findFirstNonRepeatingCharacter("a green apple");
        System.out.println(ch);

        Set<Integer> set = new HashSet<>();
        int[] nums = {1, 2, 2, 2, 3, 4, 4, 4, 5, 6};
        for (var num : nums)
            set.add(num);
        System.out.println(set);
        set.remove(2);

        
    }
}