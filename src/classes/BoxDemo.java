//this class declares an object of class Box
package classes;


public class BoxDemo {
   public static void main(String[] args){
    Box mybox = new Box(25,20,10);
    Box mybox1 = new Box(4,5,3);
    
    
    double vol;
    
    
       vol = mybox.volume();
       System.out.println("Volume is: " + vol);
       
       vol = mybox1.volume();
       System.out.println("Volume is: " + vol);
  }
}

/*
run:
Volume is: 3000.0
Volume is: 162.0
*/