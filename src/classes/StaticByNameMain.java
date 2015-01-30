
package classes;


public class StaticByNameMain {
    public static void main(String[] args){
        StaticByName.callme();
        System.out.println("b = " + StaticByName.b);
    }
}

/*
run:
a = 42
b = 99
*/