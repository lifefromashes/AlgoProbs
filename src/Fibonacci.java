public class Fibonacci {

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        else {
            return fib(n-1) + fib(n - 2);
        }
        
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
    
}