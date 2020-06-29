import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;
    private int size;

    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

    public void addLast(int item) {
        var node = new Node(item);

        //check to see if list is empty
        if (first == null) {
            first = node;
            last = node;
        }
        else {
            last.next = node;
            last = node;
        }
        size++;
    
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if(isEmpty()) 
            first = last = node;
        

        // if(first == null ) 
        //     first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while(current != null) {
            if(current.value == item) return index;
        current = current.next;
        index++;
        }
        return -1;
    }

    public void removeFirst() {
        if(isEmpty()) throw new
            NoSuchElementException();
        
        if(first == last) 
            first = last = null;
        
        else {        
        var second = first.next;
        first.next = null;
        first = second;
        }

        size--;
    }

    public void removeLast() {
        if(isEmpty()) throw new NoSuchElementException();

        if(first == last) 
            first = last = null;
        else{
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
        }

        size--;
        
    }

    private Node getPrevious(Node node) {
        
        var current = first;
        while(current != null) {
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    //O(1)
    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        var index = 0;

        while(current != null) {
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1 ;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

    }

    public void reverse() {
        //[10 -> 20 ->30]
        //        p     c   n  (first iteration)
        //(p)revious and (c)urrent node vars
        //declare another var called next n = c.next;
        //c.next = p
        if(isEmpty()) return;

        var previous = first;
        var current = first.next;
        while(current!= null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
        
    }

    private int getKthFromTheEnd(int k) {
        //find kth node from end of linked list in one pass
        //[10 -> 20 -> 30 -> 40 -> 50]
        //k = 3 (50) distance of pointers = 2
        //k - 1 node apart

        //linked list questions can be solved with
        //two pointers
        if(isEmpty()) throw new IllegalStateException();
        
        var a = first;
        var b = first;
        for(int i = 0; i < k -1; i++) {
            b = b.next; //moves 2nd pointer forward
            if(b == null) throw new IllegalArgumentException();
            while(b != last) {
                a = a.next;
                b = b.next;
            }
        }
        return a.value;

    }

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.size);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        System.out.println(list.getKthFromTheEnd(3));
        
        // System.out.println(list.size);

        // list.addLast(30);
        // list.removeLast();
        // list.addFirst(50);
        // list.reverse();
        // System.out.println(list.size);
        // System.out.println(list.indexOf(10));
        // System.out.println(list.contains(40));

        // var array = list.toArray();
        // System.out.println(Arrays.toString(array));

        





        


    }
}