//demonstrate continue
public class Continue {
   public static void main(String[] args){
       for (int i = 0; i < 10; i++) {
           System.out.print(i+" ");
           if(i % 2 == 0) continue;
           System.out.println("");
       }
   } 
}

/*
run:
0 1 
2 3 
4 5 
6 7 
8 9 
*/