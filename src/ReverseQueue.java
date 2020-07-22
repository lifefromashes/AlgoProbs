import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty())
            stack.push(q.remove());
        while(!stack.isEmpty())
            q.add(stack.pop());
    }
}