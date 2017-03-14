import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


import java.awt.Graphics;

/**
 * Counter that displays a text and number.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class CounterL extends Actor
{
    private static final Color textColor = new Color(255, 180, 150);
    
    public int value = 0;
    private  int target = 0;
    private String text;
    private int stringLength;

    public CounterL()
    {
        this("");
    }

    public CounterL(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 10;

        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);

        updateImage();
    }
    
    public void act() {
            value = Level.subLevel;
        
            updateImage();
       
         
    }

    

    /**
     * Make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 12);
    }
}
