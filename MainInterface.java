import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainInterface extends World
{

    /**
     * Constructor for objects of class MainInterface.
     * 
     */
    private static int countI = 1;
    private static boolean cKeyDownU = false;
    private static boolean cKeyDownD = false;
    private static boolean cKeyDownE = false;
    
    public static boolean playSo = false;
    public static boolean p = false;
    public MainInterface()
    {    
        
        super(920, 575, 1); 
        
        playSo = true;
        
    }
    
    public void playSou(){
        GreenfootSound m = new GreenfootSound("R"+Greenfoot.getRandomNumber(5)+".mp3");
        if(playSo && !p){
            
            m.play();
            p = true;
            if(!m.isPlaying()){
                m = new GreenfootSound("R"+Greenfoot.getRandomNumber(5)+".mp3");
            }
        }else if (!playSo && p){
            m.stop();
            p = false;
        }
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
            setW(countI);
            cKeyDownE = false;
        }
    }
    
    public void setBG(int i){
        switch(i){
         case 1:setBackground("M1.png");break;
         case 2:setBackground("M2.png");break;
         case 3:setBackground("M3.png");break;
         case 4:setBackground("M4.png");break;
            
        }
    }
    
      public void setW(int i){
          playSo = false;
        switch(i){
         case 1:Greenfoot.setWorld(new Game());break;
         case 2:Greenfoot.setWorld(new Option());break;
         case 3:Greenfoot.setWorld(new HowToPlay());break;
         case 4:Greenfoot.stop();break;
            
        }
        playSo = true;
    }
    
    public void act(){
        key();
        setBG(countI);
        playSou();
        
    }
}
