
public class CapitalizeSentence {
    public static String captialize(String s) {
        if(s.trim().isEmpty()) return "";
        String[] words = s.trim()
                          .replaceAll(" +", " ")
                          .split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);

    }

    public static void main(String[] args) {
        var result = captialize("the trees are big");
        System.out.println(result);
    }
}