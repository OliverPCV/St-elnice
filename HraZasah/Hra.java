
class Hra{
    public static void main(String args[]){

        int x = 0;

        StartMessage message = new StartMessage();
        message.spawnMessage();

        Bunker range = new Bunker();
        Bunker generaterange = new Bunker();
        Space spacegap = new Space();
        Shoot usersshoot = new Shoot();
            
        do{
            spacegap.generateSpace();
            range.randomNumber();
            range.drawBunker(generaterange.randomNumber());
            spacegap.generateSpace();
        
        
            CalculateShoot calculated = new CalculateShoot(usersshoot.usersShoot(), generaterange.randomNumber());
            
           

            calculated.calculatedShoot();
            x++;
         }while(x < 5);
        

        }
        
    }
