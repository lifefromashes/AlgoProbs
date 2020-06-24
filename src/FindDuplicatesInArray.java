public class FindDuplicatesInArray {
    
    public static void findDuplicates(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex < rightIndex) {
            if(arr[leftIndex] == arr[rightIndex]){
                System.out.println("Duplicate found at : " + arr[rightIndex]);
            
            leftIndex++;
            rightIndex--;
            }
        }

        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         if(arr[i] == arr[j] && i != j) {
        //             System.out.println("Duplicate found: " + arr[j]);

        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

        findDuplicates(my_array);

    }
}