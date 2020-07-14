public class StringRotations {
    
    //ABCD      -> DABC order of chars don't change
    //by 2 char -> CDAB
    //by 3 chars -> BCDA
    //can concatenate the string1 and itself together and see if contains str2
    public static boolean areRotations(String str1, String str2) {
        if(str1.length() != str2.length()) return false;

        if(!(str1 + str2).contains(str2)) return false;

        return true;

    }

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "BCDA";

       var res = areRotations(str1, str2);
       System.out.println(res);
    }
}