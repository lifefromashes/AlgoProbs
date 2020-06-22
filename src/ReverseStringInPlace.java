public class ReverseStringInPlace {
    public static void reverse(char[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while(leftIndex < rightIndex) {
            //swap chars
            char temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            //move towards middle
            leftIndex++;
            rightIndex--;

            //O(n) time and O(1) space
        }
    }
}