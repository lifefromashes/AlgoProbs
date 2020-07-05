import java.util.Arrays;

public class BuildStackFromArray {
    private int[] items = new int[5];
    private int count;

    public  void push(int item) {
        if(count == items.length) 
            throw new StackOverflowError();
        items[count++] = item;

    }

    public  int pop() {
        if(count == 0) throw new IllegalStateException();
        
        count--;
        return items[count];
    }

    public int peek() {
        if(count == 0) throw new IllegalStateException();
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
       return Arrays.toString(content);
    }

    public static void main(String[] args) {
        BuildStackFromArray b = new BuildStackFromArray();
        b.push(10);
        b.push(20);
        b.push(30);
        System.out.println(b.peek());
        System.out.println(b.isEmpty());
    }
}