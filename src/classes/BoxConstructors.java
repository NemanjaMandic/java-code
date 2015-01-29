
package classes;


public class BoxConstructors {
    
    double width;
    double height;
    double dept;
    
    BoxConstructors(double w, double h, double d){
        width = w;
        height = h;
        dept = d;
    }

    public BoxConstructors() {
        width = -1; //use -1 to indicate an uninitialize box
        height = -1;
        dept = -1;
    }
    BoxConstructors(double len){
        width = height * dept *len;
    }
    double volume(){
        return width * height * dept;
    }
}
