public class Subtractmatrix {

    public static int[][] matrixSubtraction(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b.length];
        if(a.length != b.length || a[0].length != b[0].length) return null;

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < b.length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }
    
}