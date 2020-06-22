import javax.print.attribute.standard.Finishings;

public class findIndexOfEle {

    public static int findIndexofElement(int[] arr, int target){
        if(arr == null) return -1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndexofElement(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndexofElement(my_array, 77));

    }

    
}