public class SumOfNums {

    public static int sumNums(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
             sum += i;
        }
        return sum;
    }
        public static void main(String[] args) {
            int n = 10;
            //sumNums(n);
            System.out.println(sumNums(n));
        }    
}