import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reStart extends Actor
{
    /**
     * Act - do whatever the reStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static boolean en = false;
    private static boolean ba = false;
    
    public static int hS;
    
    public void act() 
    {
       if(Counter.valueS > hS){
           hS = Counter.valueS;
          
        }
        keyC();
    }
    
    public void keyC(){
        if(!en && Greenfoot.isKeyDown("enter")){
            
            en = true;
        }else if(en && !Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MainInterface());
             Counter.valueS = 0;
            en = false;
        }
        if(!ba && Greenfoot.isKeyDown("backspace")){
            
            ba = true;
        }else if(ba && !Greenfoot.isKeyDown("backspace")){
            Counter.valueS = 0;
            Greenfoot.setWorld(new Game());
             
            ba = false;
        }
        
        
    }
}
