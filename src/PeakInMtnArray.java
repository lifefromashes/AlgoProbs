public class PeakInMtnArray {
    public static int peakInMtnArray(int[] arr) {
        //must be 3 or more in length
        if(arr.length < 3) return -1;

        int i = 0;
        while (arr[i] < arr[i + 1]) {
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0};

        System.out.println(peakInMtnArray(arr));
    }
}