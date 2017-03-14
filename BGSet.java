import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BGSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BGSet extends World
{

    /**
     * Constructor for objects of class BGSet.
     * 
     */
    private static int countI = 1;
    private static boolean cKeyDownL = false;
    private static boolean cKeyDownR = false;
    private static boolean cKeyDownE = false;
    
    public BGSet()
    {    
        
        super(920, 575, 1); 
        
        
    }
    
    public void key(){
        if(!cKeyDownL&& Greenfoot.isKeyDown("left")){
            if (countI == 1){countI = 8;}
            else{countI--;}
            cKeyDownL = true;
        }else if(cKeyDownL && !Greenfoot.isKeyDown("left")){
            cKeyDownL = false;
        }
        if(!cKeyDownR&& Greenfoot.isKeyDown("right")){
            if (countI == 8){countI = 1;}
            else{countI++;}
            cKeyDownR = true;
        }else if(cKeyDownR && !Greenfoot.isKeyDown("right")){
            cKeyDownR = false;
        }
        
        if(!cKeyDownE&& Greenfoot.isKeyDown("enter")){
            
            cKeyDownE = true;
        }else if(cKeyDownE && !Greenfoot.isKeyDown("enter")){
            setW(countI);
            cKeyDownE = false;
        }
    }
    
    public void setBG(int i){
        String x = "B" + String.valueOf(i) +".jpg";
         setBackground(x);
         
            
        
    }
    
      public void setW(int i){
        Game.BG = "B" + String.valueOf(i) +".jpg";
        Greenfoot.setWorld(new Option());
    }
    
    public void act(){
        key();
        setBG(countI);
        
        
    }
    
}
