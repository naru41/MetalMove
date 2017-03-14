import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */

    private FuelIndicator fuel;

    public static int nBlock = 4;
    public static int tAction = -1;
    public static int tLongAct = 200;

    private static int tCountDelateBlock = 0;
    private static int i = 0;
    
    private int delayTrap = 0;
    private int spawnTrap = 40;
    
    public static int level;
    
    private int levelCount = 0;
    private int scoreCount = 0;    
    
    public static String BG = "B1.jpg";
    
    public static boolean over ;
     public static boolean gameOut ;
    
     
    Counter sC = new Counter("Score :");
    CounterL lC = new CounterL("Level :");
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 580, 1); 
       
        setBackground(BG);
        
        
       
        
        over = false;
        gameOut = false;
        Level.subLevel = 1;
        
        
        for(int i = 0 ; i< 35; i++){
            addObject(new T1(),(i*25)+25, 15);
            addObject(new T2(),(i*25)+25, 540);
        }
        for(int i = 0 ; i < 21;i++){
            addObject(new T3(),13, (i*25)+28);
            addObject(new T4(),887, (i*25)+28);
        }
         
        fuel = new FuelIndicator();

        addObject(fuel, getWidth() / 2 , getHeight() - 15);
        if(Level.mainLevel == 1){spawnTrap = 40;}
        if(Level.mainLevel == 2){spawnTrap = 80;}
        if(Level.mainLevel == 3){spawnTrap = 120;}
        
        addObject(new Body(), getWidth() / 2 , getHeight() /2);
        
        
        
        addObject(sC,getWidth()/4, getHeight() -15);
        addObject(lC , (getWidth()/4)*3, getHeight() -15);
        
        
       
        
        
    }

    public void act(){
        if(!gameOut){
             tAction++;
            delayTrap++;
            levelCount++;
            scoreCount++;
        }
        
        if( tAction% tLongAct == 0) AD_Block();
        
        if(delayTrap % spawnTrap == 0){
            subLevelAct(Level.subLevel);
        }
        
        if(levelCount%500 == 0){
            Level.subLevel++;
            lC.value += 1;
        }
        
        if(scoreCount%60 == 0){
            sC.valueS += (Greenfoot.getRandomNumber(7)+3)*(Level.subLevel);
        }
        
      
        if(over){gameOver();}
        
        
    }
    
   
   
    

    public void AD_Block(){
        int xLine = 820/nBlock;
        int y = Greenfoot.getRandomNumber(400)+50;
        int x = (i*xLine)+(Greenfoot.getRandomNumber(xLine%10)*45)+50;

        addObject(new b3(), x, y);

        i++;
        if (i == nBlock) i=0;

    }

  
    
    public void subLevelAct(int l){
        for(int i = 0; i < l;i++){
            int h = Greenfoot.getRandomNumber(20);
            directionTrap(h%4);
        }
          
        
    }
    
    public void directionTrap(int d){
        
        if(d == 0){
            addObject(new trap1(), (Greenfoot.getRandomNumber(35)*25)+25,35);
        }else if(d == 1){
            addObject(new trap2(), (Greenfoot.getRandomNumber(35)*25)+25,520);
        }else if(d == 2){
            addObject(new trap3(), 30 ,(Greenfoot.getRandomNumber(21)*25)+28);
        }else if(d == 3){
            addObject(new trap4(), 870 ,(Greenfoot.getRandomNumber(21)*25)+28);
        }
    }
    
    public void gameOver() 
    {
            String gameSaying[] = {"TASTER!!", "YOU LOST!!", "FAIL!!!", "THAT'S BAD...", "WINNER!...NOT!", "GETTING GOOD!", "EH..."};
            int i = Greenfoot.getRandomNumber(5);
    
            gameOut = true;
            addObject(new reStart(),(getWidth()/5)*4,getHeight() / 2);
            
            addObject(new ScoreBoard(Counter.valueS, gameSaying[4]), getWidth() / 2, getHeight() / 2);
            
            
            over = false;
        
    }
    
    
   
    
   
}