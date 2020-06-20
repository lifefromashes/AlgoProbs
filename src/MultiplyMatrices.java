public class MultiplyMatrices {

    public static int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
        if(arr1.length != arr2[0].length) { return null; }

        int xBoundary = Math.min(arr1.length, arr2.length);
        int yBoundary = Math.min(arr1[0].length, arr2[0].length);

        int[][] arr3 = new int[xBoundary][yBoundary];

        for(int x = 0; x< arr3.length; x++) {
            for(int y = 0; y < arr3[0].length; y++) {
                int sum = 0;

                for(int m = 0; m < arr1[0].length; m++) {
                    sum += (arr1[x][m] * arr2[m][y]);
                }

                arr3[x][y] = sum;
            }
        }

        return arr3;
    }
    
}