
//compute distance light travels using long variables
public class Light {
  
    public static void main(String[] args){
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        
        
        //aproximate speed of light in mils per second
        lightSpeed = 186000;
        
        days = 1000; //specify number of days here
        
        seconds = days * 24 * 60 * 60; // convert to seconds
        
        distance = lightSpeed * seconds; // compute distance
        
        System.out.print("in " + days);
        System.out.print(" days light will travel about " );
        System.out.println(distance + " miles");
    }
}
