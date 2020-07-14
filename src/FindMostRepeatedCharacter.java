public class FindMostRepeatedCharacter {
    //have to keep track of how many times have seen the character

    public static char getMaxOccuringChar(String str) {
        if(str.isEmpty() || str == null) throw new IllegalArgumentException();
        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];

        for (char ch: str.toCharArray()) {
            frequencies[ch]++;
        }

        int max = 0;
        char result = ' ';
        for(int i = 0; i < frequencies.length; i++) {
            if(frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        var result = getMaxOccuringChar("Trees are beautiful");
        System.out.println(result);
    }
}