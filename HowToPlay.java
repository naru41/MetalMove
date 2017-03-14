import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{

    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 575, 1); 
        
    }
    private static boolean ba = false;
    
   
   
    public void act() 
    {
       if(!ba && Greenfoot.isKeyDown("backspace")){
            
            ba = true;
        }else if(ba && !Greenfoot.isKeyDown("backspace")){
            
            Greenfoot.setWorld(new MainInterface());
             
            ba = false;
        }
    }
}
