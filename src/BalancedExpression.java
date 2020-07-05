import java.util.Arrays;
import java.util.List;
import java.util.Stack;


public class BalancedExpression {
    private static List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private static List<Character> rightBrackets = Arrays.asList(')', '>', ']', ']');
    
    public static boolean isbalancedExpression(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if(isLeftBracket(c))
                stack.push(c);

            if (isRightBracket(c)){
                if(stack.empty()) return false;

                var top = stack.pop();
                if(bracketsMatch(top, c)) return false;
            }
        }
    
        return stack.empty();
    }

    private static boolean isLeftBracket(char c) {
        return leftBrackets.contains(c);

    }

    private static boolean isRightBracket(char c) {
        return rightBrackets.contains(c);
    }

    private static boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

    public static void main(String[] args) {
        String st = "((>1] + <2>))[a]";
        String str = "((1 + <2>))[a]";
        String a = "(1 + 2>";
        var result = isbalancedExpression(st);

        System.out.println(result);
        System.out.println(isbalancedExpression(st));
        System.out.println(isbalancedExpression(str));
        System.out.println(isbalancedExpression(a));
    }
}