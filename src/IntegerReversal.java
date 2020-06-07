
public class IntegerReversal {

	public static int reverseInt(int n) {		
		int reverse = 0;
		
		while(n != 0) {
			int digit = n % 10; //removes the right most digit
			reverse = reverse * 10 + digit; //mult by 10 moves it to the left
			n /= 10; //dividing by 10 removes the rightmost digit
		}
		
		return reverse;
			
		
	}
		

	public static void main(String[] args) {
		int n = 1234;
		int res = reverseInt(n);
		System.out.println(res);
		
	}
}
