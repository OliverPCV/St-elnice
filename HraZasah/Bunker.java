
import java.util.*;
public class Bunker{
    private int hracipole;
    private int pole[] = new int[hracipole];

    
    
    public  int randomNumber(){
        hracipole = (int)((Math.random() * 49)+ 1);
        
        return hracipole;
    }

    

    public  int drawBunker(int hracipole){
        
        for(int i = 0; i < hracipole; i++){
            System.out.print(" ");
        }
        System.out.println(" W");
        return hracipole;

        
       
    }
}
