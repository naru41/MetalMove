import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trap2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class trap2 extends Level
{
    /**
     * Act - do whatever the trap2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {

        mainLevelAct(Level.mainLevel,270,90);
       move();
        hit();
    }    
}
