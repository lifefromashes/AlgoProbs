public class CountAndSay {
    public static String countAndSaySequence(int n) {
        if(n <= 0) return "";
        
        String res = "1";
        while(n > 1) {
            StringBuffer curr = new StringBuffer();
            for (int i = 0; i < res.length(); i++) {
                int count = 1;
                while (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
                    count++;
                    i++;
                }
                curr.append(count).append(res.charAt(i));
            }
            res = curr.toString();
            n--;
        }
        return res;
    }

    public static void main(String[] args) {
        
        System.out.println(countAndSaySequence(4));

    }
}