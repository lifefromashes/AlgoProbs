
public class MaxDifference {

    public static int findMaxDifference(int[] arr) {
        int difference = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                difference = Integer.max(difference, arr[j] - arr[i]);
            }
           
        }

        return difference;
    }

    public static int findMaxDiff2(int[] arr) {
        int minimum = arr[0];
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            // if(arr[i] - minimum > diff){
            //     diff = arr[i] - minimum;
            // }
            // if(arr[i] < minimum) {
            //     minimum = arr[i];
            // }
            if(arr[i] < minimum) {
                minimum = arr[i];
            }
            if(arr[i] - minimum > diff) {
                diff = arr[i] - minimum;
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        int [] arr2 = {5, 3, 7, 1};

        int [] arr3 = {5, 3, 7, 1};


        int result = findMaxDifference(arr);
        System.out.println(result);

        System.out.println(findMaxDifference(arr2));

        System.out.println(findMaxDiff2(arr3));
    }
    
}