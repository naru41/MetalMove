import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FuelIndicator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuelIndicator extends Actor
{
    GreenfootImage image = getImage();
    private String percent = (int) Body.fuelAmmount + "%";
    private int length = percent.length();
    public FuelIndicator()
    {
        image.clear();
        image.setColor(new Color(100, 250, 0));
        image.scale((int)Body.fuelAmmount, image.getHeight());
        image.fillRect(0, 0, image.getWidth(), image.getHeight());
        image.setColor(Color.RED);
        image.drawString(percent, (image.getWidth() / 2) - (percent.length() * 3), image.getHeight());
    }

    /**
     * Act - do whatever the FuelIndicator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateImage();
        percent = (int) Body.fuelAmmount + "%";
    }    

    private void updateImage()
    {
        if (Body.fuelAmmount < 2)
        {
            image.clear();
            image.setColor(new Color(100, 150, 0));
            image.fillRect(0, 0, 1, image.getHeight());
            image.setColor(Color.RED);
            image.drawString(percent, (image.getWidth() / 2) - (percent.length() * 3), image.getHeight());
        }
        else
        {
            image.clear();
            image.setColor(new Color(100, 250, 0));
            image.fillRect(0, 0, (int) Body.fuelAmmount, image.getHeight());
            image.setColor(Color.RED);
            image.drawString(percent, (image.getWidth() / 2) - (percent.length() * 3), image.getHeight());
        }
    }
}
