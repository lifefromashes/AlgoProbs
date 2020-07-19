
public class ReverseString {
    
    public static String reverse(String s) {
        // String reversed = "";
        // for(int i = s.length() - 1; i >= 0; i--) 
        //     reversed += s.charAt(i);

        // return reversed;
        //BETTER WAY IS TO USE STRINGBUILDER
        if(s == null) return "";
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >=0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        var res = reverse("BLUE");
        System.out.println(res);
        var res2 = reverse(null);
        System.out.println(res2);
    }
}