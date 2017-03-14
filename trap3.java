import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trap3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trap3 extends Level
{
    /**
     * Act - do whatever the trap3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
       mainLevelAct(Level.mainLevel,0,0);
       move();
       hit();
    
    }    
}
