import java.util.ArrayList;
import java.util.List;

public class Hailstone {

    public static int hailstoneSequence(int n) {
        int next = 0;
        if (n == 1) return 1;

        if(n % 2 == 0) { 
            next = n /2;
            System.out.println(next + "");
            return hailstoneSequence(next);
            
            
        } else {
            next = (n * 3) + 1;
            System.out.println(next + "");

            return hailstoneSequence(next);
        }
            
        
        
    }
    public static void main(String[] args) {
        int n = 4;
        hailstoneSequence(n);
    }

}