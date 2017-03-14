import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class b3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class b3 extends Actor
{
    
    private static int countDelete = 1;
    
    
    
    public void act() 
    {
       countDelete ++ ;
        if (countDelete % (20-((Game.nBlock)*(Game.tLongAct))) == 0){
            getWorld().removeObject(this);
        } 
        
       
    }    
}
