//switch example
public class SampleSwitch {
   public static void main(String args[]){
       for (int i = 0; i < 6; i++) {
           switch(i){
               case 0:
                   System.out.println("i is zero");
                   break;
               case 1:
                   System.out.println("i is 1");
                   break;
               case 2:
                   System.out.println("i is 2");
                   break;
               case 3:
                   System.out.println("i is 3");
                   break;
               default:
                   System.out.println("i is greater than 3");
           }
       }
   } 
}
/*
i is zero
i is 1
i is 2
i is 3
i is greater than 3
i is greater than 3
*/