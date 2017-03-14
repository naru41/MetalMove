import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends SmoothMover
{
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int mainLevel = 1;
    public static int subLevel;
    
    int z = Greenfoot.getRandomNumber(4)%2;
    
    public static boolean hcMode = true;
    
    
    public void act() 
    {
        
    }    
    
     public void hit(){
         
        if (isTouching(Body.class)){
            removeTouching(Body.class);
            Body.fuelAmmount = 100;
            Game.over = true ;
        }
        
        if(isTouching(b3.class)){
            getWorld().removeObject(this);
        }
    
        
    }
    
    
     public void mainLevelAct(int l,int r,int x){
         if(!Game.gameOut){  
        if(l == 1){
             addForce(new Vector(r , 0.1));
        }
        
        if(l == 2){
            
            if(z == 1){ addForce(new Vector(r+Greenfoot.getRandomNumber(90) , 0.2));}
            else if ( z == 0){addForce(new Vector(r-Greenfoot.getRandomNumber(90),0.2));}
            
            addForce(new Vector(r , 0.2));
            
            
            
        }
        if(l == 3 ){
            
            
            turnTowards(Body.x, Body.y);
           
            addForce(new Vector(getRotation(), 0.05));
            setRotation(getRotation()+x);
        }
    }
    }
}
