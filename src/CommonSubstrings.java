import java.util.HashSet;

public class CommonSubstrings {
    
    public static String twoStrings(String s1, String s2){

        HashSet<Character> set = new HashSet<Character>();

        char[] str = s1.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            set.add(str[i]);
        }

        for(char element : s2.toCharArray()) {
            if(set.contains(element)) {
               return "Yes";
            }    

            }
            return "No";
    }

    public static void commonSubstring2(String[]arr1, String[] arr2) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (String s : arr2) {
            if(set.contains(s)) {
                System.out.println("Yes");
            } 
        }
        System.out.println("No");

    }

    
    public static void main(String[] args) {
        // String s1 = "hello ";
        // String s2 = "world";    

        // String s3= "hi";
        // String s4 = "world";

        // System.out.println(twoStrings(s1, s2));
        // System.out.println(twoStrings(s3, s4));


        String[] a = {"ab", "cd", "ef"};
        String[] b = {"af", "ee", "ef"};

        commonSubstring2(a, b);

    }
}