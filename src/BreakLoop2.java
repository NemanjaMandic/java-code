// using break to exit a while loop
public class BreakLoop2 {
     public static void main(String[] args){
         int i=0;
         
         while(i<100){
             if(i==10) break; //terminate loop if i is 10
             System.out.println("i: " + i);
             i++;
         }
         System.out.println("Loop completed");
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
Loop completed
*/