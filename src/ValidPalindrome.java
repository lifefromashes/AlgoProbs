
public class ValidPalindrome {

	public static boolean validPalindrome(String p) {
		int left = 0;
		int right = p.length() - 1;
		
		while(left < right) {
			if(p.charAt(left++) != p.charAt(right--)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String p = "racecar";
		String o = "hello";
		System.out.println(validPalindrome(p));

		System.out.println(validPalindrome(o));
}
}
