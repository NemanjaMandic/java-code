// using break to exit from nested loops
public class BreakLoop4 {
     public static void main(String[] args){
         outer: for(int i=0; i<3; i++){
             System.out.print("Pass " + i + ": ");
             for(int j=0; j<100; j++){
                 if(j == 10) break outer; //exit both loops
                 System.out.print(j+" ");
             }
             System.out.println("This will not print");
         }
         System.out.println("Loops complete");
     }
}

/*
run:
Pass 0: 0 1 2 3 4 5 6 7 8 9 Loops complete
*/