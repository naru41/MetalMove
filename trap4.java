import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class trap4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class trap4 extends Level
{
    /**
     * Act - do whatever the trap4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
          mainLevelAct(Level.mainLevel,180,180);
       move();
        hit();
    }    
}
