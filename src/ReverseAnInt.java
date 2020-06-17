public class ReverseAnInt {

    public static int reverse(int num) {
        int reversed = 0; 

        while(num != 0 ) {
            if(reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) return 0;            
        
            reversed = reversed * 10 + num % 10;
            num /= 10;
    }
    return reversed;
}

    public static void main(String[] args) {
        int num = 1234;
        int num2 = 5426;

        int result = reverse(num);

        System.out.println(result);

        System.out.println(reverse(num2));


    }
    
}