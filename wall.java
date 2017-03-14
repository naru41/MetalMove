import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actor
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }   
    
    public void wallHit(){
         if (isTouching(Body.class)){
            removeTouching(Body.class);
            Body.fuelAmmount = 100;
            Game.over = true ;
        }
        if(isTouching(trap1.class)){
            removeTouching(trap1.class);
        }
        if(isTouching(trap2.class)){
            removeTouching(trap2.class);
        }if(isTouching(trap3.class)){
            removeTouching(trap3.class);
        }if(isTouching(trap4.class)){
            removeTouching(trap4.class);
        }
    }
}
