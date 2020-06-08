
public class AnotherReverseString {

    public static String reverseString(String str) {
        if(str == null || str.isEmpty()) return str;

        char[] chars = str.toCharArray();
        int i = 0; 
        int j = str.length() - 1;
        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abc";

        System.out.println(reverseString(str));
    }

    // @Test
    // public void reverseEmptyString() {
    //     Assert.assertEquals("", reverse(""));
    // }

    // @Test
    // public void reverseString() {
    //     Assert.assertEquals("cba", reverse("abc"));
    // }
    
}