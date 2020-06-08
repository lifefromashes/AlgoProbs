public class StringToInt{

    public static int stringToInt(String str) {
       char[] chars = str.toCharArray();
       
        int answer = 0;
       int multiplier=1;

       for (int i = chars.length - 1; i >=0; i--) {
           answer += (chars[i] - '0') * multiplier;
           multiplier *= 10;
       }
       return answer;
    }

    public static void main(String[] args) {
        String p = "123";

        int res = stringToInt(p);
        System.out.println(res);
    }
}