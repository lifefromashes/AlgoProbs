
public class ReversedString {
	
	public static String reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}
	
	public static String reverseString2(String str) {
		char [] ch = str.toCharArray();
		for(int i = ch.length - 1; i >=0; i--) {
			System.out.println(ch[i]);
		}
		return ch.toString();
}
	
	public static void main(String[] args) {
		String str = "hello";
		
		String res = reverseString(str);
		System.out.println(res);
		
		String str2 = "java";
		System.out.println(reverseString(str2));
		
	}
	
	

}
