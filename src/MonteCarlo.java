public class MonteCarlo {
    public static void randomNumberInCircle() {
		double x, y;
		int nThrows = 0;
		int inside = 0;
		
		while(true) {
		for (int i = 0; i < 1000; i++) {
			x = Math.random() * 2 - 1;
			y = Math.random() * 2 - 1;
			
			nThrows++;
			
			if(x * x + y * y <= 1) {
				inside++;
			}
		}
		System.out.println((double)inside / (double)nThrows);
	}
	}
	public static void main(String[] args) {
		randomNumberInCircle();
	}
}