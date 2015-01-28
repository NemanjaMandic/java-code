// using break to exit loop

public class BreakLoop {
     public static void main(String[] args){
         for(int i=0; i<100; i++){
             if( i== 10) break; //terminate loop if i is 10
             System.out.println("i: " + i);
         }
         System.out.println("Loop complete.");
     }
}
/*
run:
i: 0
i: 1
i: 2
i: 3
i: 4
i: 5
i: 6
i: 7
i: 8
i: 9
Loop complete.
*/