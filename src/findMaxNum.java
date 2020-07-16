import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

   // Given an array of long integers (arr) and a number (num). Iterate through the elements in arr and double the value of num whenever an element equals num. 
   //arr can be reordered before the iteration to maximize the value of num. Find the maximum possible value of num.
//Example
// 

public static long FindMaxNum(int [] arr, int n) {

    Arrays.sort(arr);
    //int maxNum = 0;

    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == n) {
            n = 2 * n;
            set.add(n);
        }
    }
    
    return Collections.max(set);
    
}

public static long findmaxNum2(int[] arr, int n) {

    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == n) {
            n *= 2;
        }
    }
    return n;
}


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 11, 12, 8};
        int num = 2;

        System.out.println(FindMaxNum(arr, num));
        System.out.println(findmaxNum2(arr, num));

    }
    
}