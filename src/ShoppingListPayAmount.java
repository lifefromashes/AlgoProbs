import java.util.ArrayList;
import java.util.List;

public class ShoppingListPayAmount {
    // Alex has a list of items to purchase at a market. The owner offers to discount each item after the first one by the lowest marked price among the prior items. No item's price can be discounted below 0, and the list of items may not be reordered. Calculate the payable amount.
 
    // Example
    // prices = [2, 5, 1, 4]
    // Alex pays 2 for the first item since there are no previous items to compare to.
    // The second item costs 5 - 2 = 3.
    // The third item is free: max(1 - min(2, 5), 0) = max(-1, 0) = 0. 
    // The fourth item costs 4 - 1 = 3.
    // The total cost to purchase all items is 2 + 3 + 0 + 3 = 8.
    // The first item is never discounted and the minimum cost of any item is 0.
    
    public static int calculatePayment(int[] arr) {
    //    int  totalCost = 0;

    //     List<Integer> list = new ArrayList<>();
    //     list.add(prices[0]);
        
    //     for (int i = 0; i < prices.length - 2; i++){
    //         int cost = prices[i + 1] - prices[i]; 
    //         list.add(cost);         
    //     }
    //     for (int el : list) {
    //         totalCost += el;
    //     }

    //     return totalCost;

       // _________________________________________________

        int sum = 0;
        int discount = 0;


        for (int i  = 0; i < arr.length; i++) {
            int pay = arr[i] - discount;
            if(pay < 0) {
                pay = 0;
            }
            sum += pay;
            if(discount == 0 || arr[i] < discount) {
                discount = arr[i];
            }
        }
        return sum;
        

              
    }

    public static void main(String[] args) {
        int[] prices = {2, 5, 1, 4};

        System.out.println(calculatePayment(prices));
    }
}