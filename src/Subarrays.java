
public class Subarrays {
	
	public static int[] chunkArray(int [] arr, int size) {
		
		//Algorithm
		//Create empty array to hold chunks called 'chunked'
		//for each element in 'unchunked array
		//retrieve the last element in chunked
		//if the last element does not exist or length is equal to chunksize
		//push a new chunk into chunked with current element
		//else add the current element into the chunk
		
		int[] chunked = new int[size];
		for (int i = 0; i < arr.length; i++) {
			 int last = chunked[chunked.length - 1];
			 if(last == arr.length) {
				 
			 }
		}
		
		
		return chunked;
	}

}
