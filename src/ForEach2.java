// Use break with a for-each
public class ForEach2 {
   public static void main(String[] args){
       
       int sum = 0;
       int[] nums = {1,2,3,4,5,6,7,8,9,10};
       
       for(int x : nums){
           System.out.println("Value is: " + x);
           sum += x;
           
           if(x==5) break; //stop the loop when 5 is obtained
       }
       System.out.println("Summation of first 5 elements: " + sum);
   }  
}
/*
run:
Value is: 1
Value is: 2
Value is: 3
Value is: 4
Value is: 5
Summation of first 5 elements: 15
*/