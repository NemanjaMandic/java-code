//Demonstrate ++
public class IncDec {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c;
        int d;
        
        c = ++b;
        d = a++;
        
        c++;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
/*
output
  a = 2
  b = 3
c = 4
d = 1
*/