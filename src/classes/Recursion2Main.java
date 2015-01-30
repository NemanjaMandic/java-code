

package classes;


public class Recursion2Main {
    public static void main(String[] args){
        Recursion2 ob = new Recursion2(10);
        int i;
        
        for (i = 0; i < 10; i++) ob.values[i] = i;
            
        ob.printArray(i);
        
    }
}

/*
run:
[0] 0
[1] 1
[2] 2
[3] 3
[4] 4
[5] 5
[6] 6
[7] 7
[8] 8
[9] 9
*/