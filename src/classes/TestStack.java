

package classes;


public class TestStack {
    public static void main(String[] args){
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        
        //push some numbers onto the stack
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);
            
        //pop those numbers of the stack
        
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) 
            System.out.println(mystack1.pop());
        
        System.out.println("Stack in mystack2");
        for (int i = 0; i < 10; i++) 
            System.out.println(mystack2.pop());
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
Stack in mystack1:
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