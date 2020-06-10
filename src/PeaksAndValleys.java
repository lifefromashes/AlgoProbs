import java.util.ArrayList;
import java.util.List;

public class PeaksAndValleys {
    
    public static void findPeaksAndValleys(int[] arr) {
        
        List<Integer> peakList = new ArrayList<>();
        List<Integer> valleyList = new ArrayList<>();


        for (int i = 0; i < arr.length - 2 ; i++) {
            if(arr[i] < arr[i + 1] && arr[i + 2] < arr[i + 1]) {
                peakList.add(arr[i + 1]);

            } 
            if (arr[i] > arr[i + 1] && arr[i + 2] > arr[i + 1]) {
                valleyList.add(arr[i + 1]);
            }
        }
            
            System.out.println("Peaks: " + peakList + " " + "Valleys: " + valleyList);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4,3,6,7,9,8};

       findPeaksAndValleys(arr);
    }
}   