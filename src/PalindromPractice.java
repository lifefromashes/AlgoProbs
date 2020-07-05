public class PalindromPractice {
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }

   

    public static void main(String[] args) {
        
        String str = "racecar";

        String str2 = "orange";
        String str3 = "deed";
        String str4 = "ratemeter";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
        System.out.println(isPalindrome(str4));

    }
}