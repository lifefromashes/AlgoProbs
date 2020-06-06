
public class FizzBuzz {
	
	public static int fizzBuzz(int n) {
		for(int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		int k = 25;
		int res = fizzBuzz(k);
		System.out.println(res);
	}

}
