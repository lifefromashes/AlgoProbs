import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {
    
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if(numRows == 0) return triangle;
        triangle.add(new ArrayList(Arrays.asList(1)));
        if(numRows == 1) return triangle;
 
        
        for(int i=1; i < numRows; i++) {
            List row = new ArrayList();
            row.add(1);
            for(int j = 1; j < i && i > 1; j++) {
                row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        
        List<List<Integer>> result = generate(5);
        System.out.println(result);
        
    }
}