
package classes;

public class RetObDemo {
    public static void main(String args[]){
        RetOb ob1 = new RetOb(2);
        RetOb ob2;
        
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
    }
}

/*
run:
ob1.a: 2
ob2.a: 12
ob2.a after second increase: 22
*/