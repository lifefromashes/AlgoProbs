import java.util.HashMap;
import java.util.Map;

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
    }
}