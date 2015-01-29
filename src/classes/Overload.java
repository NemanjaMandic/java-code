
package classes;


public class Overload {
   public static void main(String args[]){
       OverloadDemo ob = new OverloadDemo();
       double result;
       
       ob.test();
       ob.test(10);
       ob.test(10, 20);
      result = ob.test(123.25);
      
       System.out.println("Result of ob.test(123.25) " + result);
   } 
}
/*
run:
No parametars
a: 10
a and b: 10 20
double a: 123.25
Result of ob.test(123.25) 15190.5625
*/