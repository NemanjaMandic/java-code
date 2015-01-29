
package classes;


public class Box {
   
    double width;
    double height;
    double dept;
    
    Box(double w, double h, double d){
        
        width = w;
        height = h;
        dept = d;
    }
    //compute and return volume
    
    double volume(){
        return width * height * dept;
    }
    
    //sets dimensions of box
    void setDim(double w, double h, double d){
        width = w;
        height = h;
        dept = d;
    }
}
