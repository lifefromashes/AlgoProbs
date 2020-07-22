import java.util.Arrays;

public class ArrayQueue {

    
        private int[] items = new int[5];
        private int rear;
        private int count;
        private int front;

        public ArrayQueue(int capacity) {
            items = new int[capacity];
        }

        public void enqueue(int item) {
           if(count == items.length) throw new IllegalStateException();
            items[rear++] = item;
            count++;
        }

        public int dequeue() {
            var item = items[front];
            items[front++] = 0;
            return item;
        }

        @Override
        public String toString() {
            return Arrays.toString(items);
        }
    
    public static void main(String[] args) {
        ArrayQueue a = new ArrayQueue(5);
        a.enqueue(10);
        a.enqueue(20);
        a.enqueue(30);
        var front = a.dequeue();
        System.out.println(front);
        System.out.println(a);
    } 

    
}