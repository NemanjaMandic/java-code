// demonstrate do-while loop
public class DoWhile {
   public static void main(String args[]){
       int n = 10;
       
       do{
           System.out.println("tick " + n);
           n--;
       }while(n > 0);
               
   }  
}

/*
tick 10
tick 9
tick 8
tick 7
tick 6
tick 5
tick 4
tick 3
tick 2
tick 1
*/