//this class defines an integer stack that can hold 10 values
package classes;

public class Stack2 {
   
    private int stck[] = new int[10];
    private int tos;
    
    Stack2(){
        tos = -1;
    }
    void push(int item){
        if(tos==9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }
    int pop(){
        if(tos<0){
            System.out.println("Stack is underlow");
            return 0;
        }else
            return stck[tos--];
    }
}
