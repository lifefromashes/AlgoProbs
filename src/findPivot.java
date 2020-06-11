import java.lang.reflect.Array;
import java.util.Arrays;

public class findPivot {

//Given an array of numbers, find the index of the smallest array element (the pivot), for which the sums of all elements to the left and to the right are equal. The array may not be reordered.
 
// Example
// arr=[1,2,3,4,6]
 
// the sum of the first three elements, 1+2+3=6. The value of the last element is 6. 
// Using zero-based indexing, arr[3]=4 is the pivot between the two subarrays.
// The index of the pivot is 3.
 
// Constraints
// 3 ≤ n ≤ 105
// 1 ≤ arr[i] ≤ 2 × 104, where 0 ≤ i < n
// It is guaranteed that a solution always exists.

public static int findPivotofArray(int[] nums) {
    int sum = 0;
    int leftSum = 0;
    for(int x : nums) {
        sum += x;
        
    }
    
    for(int i = 0; i < nums.length; ++i) {
        if(sum - leftSum - nums[i] == leftSum){
        return i; 
        }
        
        leftSum += nums[i];
    }
    return -1;
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 6};

   int resultIndex =  findPivotofArray(nums);
   System.out.println(resultIndex);
}
}

    
    
    //loop through to find total sum

   //now get left sum

   //ex; totalSum = 28
   //[1, 7, 3, 6, 5, 6]

   //int leftSum = 0;
   //[1, 7, 3, 6, 5, 6]

   //totalSum - leftSum - arr[i] = leftSum; if this happens then we found the right index
   //bc 
   //28 - 0 - 1 = leftSum -> 27. 
   //if 27 == 0; then all the nums to the right are equal to the totalSum, the nums to the left--> this is false
   //so iterate again and increment sum if left and right arent' equal, so leftSum = 1;
   //28- 1 - 7 = 20, not equal to total sum so leftsum = 1 + 7
   //28 -8-3 = 17, so then leftSum = 1 + 7 + 8 = 11;
   //28 - 11 - 6 = 11.....11 == 11 so pivot is 6
//    int totalSum = 0;
//    for(int i = 0; i< arr.length; i++) {
//        totalSum += arr[i];
//    }
//    int leftSum = 0;
//    for(int i = 0; i < arr.length; i++) {
//        if(i != 0){
//            leftSum += arr[i - 1];
//            if(totalSum - leftSum - arr[i] == leftSum) {
//                return i;
//            }
//        }
//        return -1;
//    }
// }

  
    


    
