import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enter extends Actor
{
    /**
     * Act - do whatever the enter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    private static boolean cKeyDownE = false;
    
    public void act() 
    {
       if(!cKeyDownE&& Greenfoot.isKeyDown("enter")){
            
            cKeyDownE = true;
        }else if(cKeyDownE && !Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainInterface());
            cKeyDownE = false;
        }
        
    }    
}
