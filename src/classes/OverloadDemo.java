//method overloading

package classes;


public class OverloadDemo {
    
    void test(){
        System.out.println("No parametars");
    }
    //overload test for one int parametar
    void test(int a){
        System.out.println("a: " + a);
    }
    // two int parametars
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
}
