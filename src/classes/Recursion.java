

package classes;

public class Recursion {
    public static void main(String[] args){
        Factorial f = new Factorial();
        
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 5 is " + f.fact(5));
    }
}

/*
run:
Factorial of 3 is 6
Factorial of 4 is 24
Factorial of 5 is 120
*/