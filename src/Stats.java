import java.util.Arrays;
import java.util.HashMap;

public class Stats{

public static double mean (int[] numbers) {
		double sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

public static double median (int[] numbers) {
		double median = 0;
		Arrays.sort(numbers);
		if(numbers.length % 2 == 0) {
			for(int i = 0; i < numbers.length / 2; i ++) {
				median = (numbers[i] + numbers[(i+1)]) /2.0;
			}
			return median;
		} for(int i = 0; i < numbers.length/2; i ++) {
			median = numbers[i+1];	
		}
		return median;
	}

  public static int mode(int[] numbers) {
		// doesn't work for more than one mode :(
		Arrays.sort(numbers);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 1;
		int temp = 0;
		for(int i = 0; i < numbers.length; i++) {
	        if (map.get(numbers[i]) != null) {
	            int count = map.get(numbers[i]);
	            count++;
	            map.put(numbers[i], count);
	            if(count > max) {
	                max  = count;
	                temp = numbers[i];
	            }
	        }
	        else 
	            map.put(numbers[i],1);
	    }
	    return temp;
	}

  public static double variance(int[] numbers){
    //find the mean -> xbar
    //sum up (x[i]-xbar)^2
    // variance =  sum/numbers.length
    double xbar = Stats.mean(numbers);
    double sum = 0.0;
    for (int i: numbers) {
      sum += (i-xbar) * (i-xbar);
    }
    return sum / numbers.length;
  }

  public static double stdDev(int[] numbers){
    //squrt(variance(numbers))-> stddev
    return Math.pow(variance(numbers), .5);
  }

 public static double pCoeff(int[] x, int[]y){
 //compute sumsqr for x -> sumsqx = variance(x)*x.length;
 //compute sumsqr for y -> sumsqy = variance(y)*x.length;
 //compute mean for x -> xbar = mean(x);
 //compute mean for y -> ybar = mean(y);
 //Loop through i from 0 to x.length -1; sumxy +- (x[i]-xbar)*(y[i]-ybar)
 //pcoeff = sumxy/(sumsqrx*sumsqry);
 double xbar = mean(x);
 double ybar = mean(y);

 double sumsqrx = variance(x) ;
 double sumsqry = variance(y) ;

 double sumxy = 0;

 for (int i = 0; i < x.length - 1; i++) {
   sumxy += (x[i] - xbar)*(y[i] - ybar);
 }

  return Math.pow(sumxy/(sumsqrx * sumsqry),0.5);
 }

public static double[] linearReg(int[]x, int[]y){
  double coeff[] = {0.0, 0.0};
  coeff[0] = pCoeff(x,y)*stdDev(y)/stdDev(x);
  coeff[1] = mean(y) -coeff[0]*mean(x);
  return coeff;
} 
}