// use a for-each style for loop
public class ForEach {
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        
        //use for-each to display 
        for(int x : nums){
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}
/*
run:
Value is: 1
Value is: 2
Value is: 3
Value is: 4
Value is: 5
Value is: 6
Value is: 7
Value is: 8
Value is: 9
Value is: 10
Summation: 55
*/