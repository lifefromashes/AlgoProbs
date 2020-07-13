public class NumOfVowels {
    public static int countVowels(String n) {
        if(n == null) return 0;
        int count = 0;
        //aeiou
        String vowels = "aeiou"; //use set if long string
        for (var ch : n.toLowerCase().toCharArray()) {
           if(vowels.indexOf(ch) != -1) {
               count++;
           }
          
        }
        return count;

    }

    public static void main(String[] args) {
        var count = countVowels("Hello World");
        System.out.println(count);

        var count1 = countVowels("HELLO");
        System.out.println(count1);
    }
}