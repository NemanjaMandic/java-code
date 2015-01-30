//static variables

package classes;


public class UseStatic {
  
    static int a = 3;
    static int b;
    
    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static{
        System.out.println("static block initialized");
        b = a * 4;
    }
    public static void main(String[] args){
        meth(42);
    }
}

/*
run:
static block initialized
x = 42
a = 3
b = 12
*/