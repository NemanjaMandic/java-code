//demonstrate an inner class

package classes;

public class Outer {
    int outer_x = 100;
    
    void test(){
      Inner inner = new Inner();
      inner.display();
    }
    //inner class
    class Inner{
        void display(){
            System.out.println("Display: outer_x = " + outer_x);
        }
    }
}
