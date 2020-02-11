import java.util.Scanner;
public class Shoot{
    private String poziceVeze; 
    private int shoot;
    Scanner sc = new Scanner(System.in);

    

    public  int usersShoot(){
        System.out.println("Zadej cislo pro dolet rakety");
        shoot = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < shoot; i++){
            System.out.print("> ");
        }
        return shoot;
    }

   
    

   
    
}