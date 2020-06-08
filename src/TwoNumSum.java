import java.util.Arrays;

public class TwoNumSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);

        int left = 0; 
        int right = array.length - 1;
        while (left < right) {
            int currSum = array[left] + array[right];
            if(currSum == targetSum) {
                return new int[] {array[left], array[right]};
            } else if (currSum < targetSum) {
                left++;
            } else if (currSum > targetSum) {
                right--;
            }
            
        }
        
        return new int[0];
    }
    public static void main(String[] args) {
        int targSum = 10;
        int [] array = {1, 5, 6, 4, 2, 7};
        int[] result = twoNumberSum(array, targSum);
        // for (int el : result) {
        //     System.out.println(el);
        // }
        System.out.println(Arrays.toString(result));

    }
}