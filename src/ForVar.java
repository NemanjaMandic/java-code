// parts of the for loop can be empty
public class ForVar {
    public static void main(String[] args){
        int i;
        boolean done = false;
        
        i = 0;
        for(; !done; ){
            System.out.println("i is " + i);
            if(i == 10) done = true;
            i++;
        }
    }  
}
/*
run:
i is 0
i is 1
i is 2
i is 3
i is 4
i is 5
i is 6
i is 7
i is 8
i is 9
i is 10
*/