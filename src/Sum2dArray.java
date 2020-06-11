public class Sum2dArray {

    public static int sumIntsIn2DArray(int[][] arr, int xStart, int yStart, int xEnd, int yEnd) {
        int sum = 0;

        for (int x = xStart; x < xEnd - 1; x++) {
            for (int y = yStart; y < yEnd - 1; y++) {
                sum += arr[x][y];
            }
        }
        return sum;

        
    }
    public static void main(String[] args) {
        int xStart = 1;
        int yStart = 2;
        int xEnd = 6;
        int yEnd = 4;

        int[][] arr = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {10, 20, 30, 40, 50, 60, 70, 80, 90, 100},
            {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000},
            {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000},
            {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000}
        };
        
        int result = sumIntsIn2DArray(arr, xStart, yStart, xEnd, yEnd);
        System.out.println(result);

    }
    
}