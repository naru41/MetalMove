import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Option here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Option extends World
{

    /**
     * Constructor for objects of class Option.
     * 
     */
     private static int countI = 1;
    private static boolean cKeyDownU = false;
    private static boolean cKeyDownD = false;
    private static boolean cKeyDownE = false;
    
    public Option()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 575, 1); 
    }
    
    public void key(){
        if(!cKeyDownU&& Greenfoot.isKeyDown("up")){
            if (countI == 1){countI = 3;}
            else{countI--;}
            cKeyDownU = true;
        }else if(cKeyDownU && !Greenfoot.isKeyDown("up")){
            cKeyDownU = false;
        }
        if(!cKeyDownD&& Greenfoot.isKeyDown("down")){
            if (countI == 3){countI = 1;}
            else{countI++;}
            cKeyDownD = true;
        }else if(cKeyDownD && !Greenfoot.isKeyDown("down")){
            cKeyDownD = false;
        }
        
        if(!cKeyDownE&& Greenfoot.isKeyDown("enter")){
            
            cKeyDownE = true;
        }else if(cKeyDownE && !Greenfoot.isKeyDown("enter")){
            setW(countI);
            cKeyDownE = false;
        }
    }
    
    public void setBG(int i){
        switch(i){
         case 1:setBackground("O1.png");break;
         case 2:setBackground("O2.png");break;
         case 3:setBackground("O3.png");break;
            
        }
    }
    
      public void setW(int i){
        switch(i){
         case 1:Greenfoot.setWorld(new LevelSet());break;
         case 2:Greenfoot.setWorld(new BGSet());break;
         case 3:Greenfoot.setWorld(new MainInterface());break;
            
        }
    }
    
    public void act(){
        key();
        setBG(countI);
        
        
    }
}
