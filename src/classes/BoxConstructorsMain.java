
package classes;


public class BoxConstructorsMain {
    public static void main(String args[]){
        BoxConstructors box1 = new BoxConstructors(10,20,15);
        BoxConstructors box2 = new BoxConstructors();
        BoxConstructors box3 = new BoxConstructors(7);
        
        double vol;
        
        vol = box1.volume();
        System.out.println("Volume of box1 is: " + box1);
        
         vol = box2.volume();
        System.out.println("Volume of box2 is: " + box2);
        
         vol = box3.volume();
        System.out.println("Volume of box3 is: " + box3);
    }
}
