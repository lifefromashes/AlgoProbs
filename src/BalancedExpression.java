import java.util.Stack;

public class BalancedExpression {
    public static boolean isbalancedExpression(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if(c == '(') 
                stack.push(c);

            if(c == ')'){
                if(stack.empty()) return false;
                stack.pop();
            }
        }
    
        return stack.empty();
    }

    public static void main(String[] args) {
        String st = "((<1] + <2>))[a]";
        String str = "((1 + <2>))[a]";
        String a = "(1 + 2)";

        System.out.println(isbalancedExpression(st));
        System.out.println(isbalancedExpression(str));
        System.out.println(isbalancedExpression(a));
    }
}