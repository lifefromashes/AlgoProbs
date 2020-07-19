import java.util.Scanner;
import java.util.Stack;

public class Parser {
   
        public static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if (c == '}' && stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if (c == ']' && stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
        }
        return stack.isEmpty();
        }
    


    public static void main(String[] args) {
        Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
    }
