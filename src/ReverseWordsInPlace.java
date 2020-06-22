public class ReverseWordsInPlace {
    public static void reverseWords(char[] message) {
        //first reverse all the char in entire message array
        //gives us right word order but each word backward
        reverseCharacters(message, 0, message.length-1);
        //now make the words forward again by reversing each
        //word's chars
        //hold index of start of the current word
        //as look for end of the current word
        int currWordStartIndex = 0;
        for (int i = 0; i <= message.length; i++) {
            //found the end of the current word
            if(i == message.length || message[i] == ' ') {
                //if we have gotten to end our next word's start is one char ahead
                reverseCharacters(message, currWordStartIndex, i - 1);  
                currWordStartIndex= i + 1;
            }
        }
    }

    private static void reverseCharacters(char[] message, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            char temp = message[leftIndex];
            message[leftIndex] = message[rightIndex];
            message[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}