import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frist extends World
{

    /**
     * Constructor for objects of class Frist.
     * 
     */
    public Frist()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 575, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        enter enter = new enter();
        addObject(enter,462,453);
        enter.setLocation(461,447);
    }
}
