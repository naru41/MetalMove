import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class LevelSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSet extends World
{
  private static int countI = 1;
    private static boolean cKeyDownU = false;
    private static boolean cKeyDownD = false;
    private static boolean cKeyDownE = false;
    /**
     * Constructor for objects of class LevelSet.
     * 
     */
    public LevelSet()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 575, 1); 
    }
    
     public void key(){
        if(!cKeyDownU&& Greenfoot.isKeyDown("up")){
            if (countI == 1){countI = 4;}
            else{countI--;}
            cKeyDownU = true;
        }else if(cKeyDownU && !Greenfoot.isKeyDown("up")){
            cKeyDownU = false;
        }
        if(!cKeyDownD&& Greenfoot.isKeyDown("down")){
            if (countI == 4){countI = 1;}
            else{countI++;}
            cKeyDownD = true;
        }else if(cKeyDownD && !Greenfoot.isKeyDown("down")){
            cKeyDownD = false;
        }
        
        if(!cKeyDownE&& Greenfoot.isKeyDown("enter")){
            
            cKeyDownE = true;
        }else if(cKeyDownE && !Greenfoot.isKeyDown("enter")){
            setW(countI,Level.hcMode);
            cKeyDownE = false;
        }
    }
    
    public void setBG(int i,boolean b){
        if(b){
            switch(i){
                case 1:setBackground("L1n.png");break;
                case 2:setBackground("L2n.png");break;
                case 3:setBackground("L3n.png");break;
                case 4:setBackground("L4n.png");break;
                
            }
        }else if(!b){
            switch(i){
                case 1:setBackground("L1f.png");break;
                case 2:setBackground("L2f.png");break;
                case 3:setBackground("L3f.png");break;
                case 4:setBackground("L4f.png");break;
                
            }
        }
    }
    
      public void setW(int i,boolean b){
        
            switch(i){
                case 1:Level.mainLevel = 1;break;
                case 2:Level.mainLevel = 3;break;
                case 3:Level.mainLevel = 2;break;
                case 4:if(b){Level.hcMode = false;}
                    else if(!b){Level.hcMode = true;};break;
            
            }
            Greenfoot.setWorld(new Option());
        
    }
    
    public void act(){
        key();
        setBG(countI,Level.hcMode);
        
        
    }
}
