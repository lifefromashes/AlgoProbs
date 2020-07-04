import java.util.Stack;


public class ReverseAString {
    
    public static String reverseString(String str) {
        if(str == null) throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        
        for(char ch : str.toCharArray()){
             stack.push(ch);
        }

        StringBuffer reversed = new StringBuffer();
        while(!stack.empty())
           reversed.append(stack.pop());

    return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseString(str));

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);

        stack.isEmpty();
        top = stack.peek();

        System.out.println(top);
    }
}