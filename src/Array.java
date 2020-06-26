public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];

    }

    public void insert(int item) {
        //if array is full, resize
        if(items.length == count) {

            //create a new larger array(twice/size)
            int[] newItems = new int[count * 2];

            //copy existing into new array
            for(int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            
            //set items to this new array
                items = newItems;
            
        }
        
        //add new item at end of curr array
        items[count++] = item;
        //count++; //moved to inline
        
    }

    public void removeAt(int index) {
        //validate the index and make sure in range
        if(index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        //shift items to left to fill the hole.
        //[10, 20, 30, 40] index: 1
        //1 <- 2
        //2 <- 3
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];

            count--; //decrement to shorten the array
        }

    }

    public int indexOf(int item) {
        //if we find it return index
        //else return -1
        for (int i = 0; i < count; i++) {
            if(items[i] == item) {
                return i;
            }
        }
        return-1;

    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }

        
    }
    public static void main(String[] args) {
        Array nums = new Array(3);
        nums.insert(10);
        nums.insert(40);
        nums.insert(50);
        nums.insert(60);
        //System.out.println(nums.indexOf(40));
       // nums.removeAt(0);


        nums.print();
        
    }
}