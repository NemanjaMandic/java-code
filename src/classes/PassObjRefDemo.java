
package classes;

public class PassObjRefDemo {
  public static void main(String args[]){
      
      PassObjRef ob = new PassObjRef(15, 20);
      
      System.out.println("ob.a and ob.b before call: " +
              ob.a + " " + ob.b);
      
      ob.meth(ob);
      System.out.println("ob.a and ob.b after call: " + 
              ob.a + " " + ob.b);
  }  
}

/*
run:
ob.a and ob.b before call: 15 20
ob.a and ob.b after call: 30 10
*/