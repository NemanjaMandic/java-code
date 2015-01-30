

package classes;


public class Stack2Main {
    public static void main(String[] args){
        Stack2 mystack1 = new Stack2();
        Stack2 mystack2 = new Stack2();
        
        //push
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);
            
        //pop
        System.out.println("Stack in mystack1");
        for (int i = 0; i < 10; i++) 
            System.out.println(mystack1.pop());
        
        System.out.println("Stack in mystack2");
        for (int i = 0; i < 10; i++) 
            System.out.println(mystack2.pop());
        
        //these statements are not legal
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}

/*
run:
Stack is full
Stack is full
Stack is full
Stack is full
Stack is full
Stack is full
Stack is full
Stack is full
Stack is full
Stack is full
Stack in mystack1
9
8
7
6
5
4
3
2
1
0
Stack in mystack2
9
8
7
6
5
4
3
2
1
0
*/