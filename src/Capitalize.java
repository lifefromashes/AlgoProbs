public class Capitalize {

    //make an empty array 'words'
    //split the input string by spaces to get an array
    //for each word in array
    //uppercase the first letter of the word
    //join first letter with rest of the string
   public static void main(String[] args) {
    String A = "hello";
    String B = "world";   
    System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
   }
    
}