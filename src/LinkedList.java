import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

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
        
        if(first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
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

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(40));
        


    }
}