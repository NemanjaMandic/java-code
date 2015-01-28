/*
 * When used inside a set of nested loops, the break statement will only break out of the
   innermost loop. For example:
 */


public class BreakLoop3 {
     public static void main(String[] args){
         for(int i=0; i<3; i++){
             System.out.print("Pass " + i + ": ");
             for(int j=0; j<100; j++){
                 if(j == 10) break; //terminate loop if j is 1o
                 System.out.print(j+" ");
             }
             System.out.println();
         }
         System.out.println("Loops complete.");
     }
}
/*
run:
Pass 0: 0 1 2 3 4 5 6 7 8 9 
Pass 1: 0 1 2 3 4 5 6 7 8 9 
Pass 2: 0 1 2 3 4 5 6 7 8 9 
Loops complete.
*/