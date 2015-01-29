//objects are passed through their references

package classes;


public class PassObjRef {
   
    int a, b;

    public PassObjRef(int i, int j) {
        a = i;
        b = j;
    }
    
    void meth(PassObjRef o){
        o.a *= 2;
        o.b /= 2;
    }
}
