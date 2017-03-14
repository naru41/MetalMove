import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Body here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Body extends SmoothMover
{
    /**
     * Act - do whatever the Body wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage image = new GreenfootImage(25 , 25);
    

    public static int x;
    public static int y;
    public static int Rotation;
    public static double mySpeed;
    
    public static double fuelAmmount = 100;
    private double maxSpeed = 2.4;
    
    public static int timeStop = 5;
    
    public void act() 
    {
        
        image.setColor( new greenfoot.Color(1,200,10));
        image.fillOval (0, 0, 19, 19);
        setImage(image);
        if(Level.hcMode){
            key();
        }else{  keyEz();}
        move();
        point();
        x = getX();
        y = getY();
        
        Rotation = getRotation();
        mySpeed = getSpeed();
    }
    
    public void key(){
       isKey("up", 270, 0, 15);
       isKey("down", 90, 0, -15);
       isKey("left" , 180, 15, 0);
       isKey("right" , 0, -15, 0);    
     breakBody();
    }
    
    public void keyEz(){
       isKeyEz("up", 270, 0, 15);
       isKeyEz("down", 90, 0, -15);
       isKeyEz("left" , 180, 15, 0);
       isKeyEz("right" , 0, -15, 0);      
    breakBody();
    }
    
    public void isKeyEz(String action,int r,double pX, double pY){
        if(Greenfoot.isKeyDown(action) && fuelAmmount > 0 ){
            
            addForce( new Vector (r, 0.3));
            
            
            //fuelAmmount -= 1.3;
            
             showFlame(pX,pY);
            
            
        }
        else if (!Greenfoot.isKeyDown(action) && fuelAmmount < 100){
            fuelAmmount += 0.2;
            
        }
        
    }
    
    public void isKey(String action, int r,double pX, double pY){
        if(Greenfoot.isKeyDown(action) && fuelAmmount > 0 ){
            
            addForce( new Vector (r, 0.3));
            
            showFlame(pX,pY);
            fuelAmmount -= 1.3;
            
            
        } if(Greenfoot.isKeyDown(action) && fuelAmmount < 0 ){
            fuelAmmount = -10;
        }
        else if (!Greenfoot.isKeyDown(action) && fuelAmmount < 100){
            fuelAmmount += 0.2;
            
        }
        
    }
    
    private void showFlame(double pX, double pY)
    {
        int i = Greenfoot.getRandomNumber (50);
        double thrusterPos[][] = {{pX, pY}};
        if (i >= 0)
        {
            for (double[] pos: thrusterPos)
            {
                double x = pos[0];
                double y = pos[1];

                double dir = calculateDirection(x, y);
                double dist = calculateMagnitude(x, y);

                dir += getRotation();

                double worldX = getX() + calculateX(dir, dist);
                double worldY = getY() + calculateY(dir, dist);

                getWorld().addObject(new Flame(1,20), (int) worldX, (int) worldY);
            }

        }
    }
    
    
    public void breakBody(){
        if(timeStop == 0 && Greenfoot.isKeyDown("z")&& fuelAmmount > 0){
            stop();
            fuelAmmount -= 5;
            Greenfoot.delay(10);
        }else if(timeStop > 0){timeStop --;}
        
    }
    
    
    public void point(){
        if(isTouching(b3.class)){
            
            revertForce();
            
        }
        
    }
        
        
    
   
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

