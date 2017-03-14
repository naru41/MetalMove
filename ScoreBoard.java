import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


import java.util.Calendar;

/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and several numbers.
 * 
 * @author M Kolling
 * @version 1.0
 */
public class ScoreBoard extends Actor
{
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    public static int score;
    public String saying;
    
   // private int rgb[] = {Greenfoot.getRandomNumber(255), Greenfoot.getRandomNumber(255), Greenfoot.getRandomNumber(255)};

    /**
     * Create a score board with dummy result for testing.
     */
    public ScoreBoard()
    {
        
    }
    public void act(){
        if(score != Counter.valueS)
        {
            score = Counter.valueS;
            makeImage(saying, "Score: ", score);
        }
         
    }
    /**
     * Create a score board for the final result.
     */
    public ScoreBoard(int score, String saying)
    {
       score = this.score;
        this.saying = saying;
        makeImage(saying, "Score : ", score);
    }

    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score )
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(3, 2, 5, 5));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        
        Font font = image.getFont();
        font = font.deriveFont(25);
        
       image.setFont(font);
        image.setColor(new Color(232, 125, 30));
        
        image.drawString(title, 50, image.getHeight()/4-(( image.getHeight()/4)/2));
        image.drawString(prefix + score, 50, image.getHeight()/4 * 3-(( image.getHeight()/4)/2));
        
        image.drawString("Level : " + Level.subLevel, 50,  image.getHeight()/4 * 2-(( image.getHeight()/4)/2));
        image.drawString("Hight Score : " + reStart.hS, 50,  image.getHeight()/4 * 4-(( image.getHeight()/4)/2));
        
        setImage(image);
        
    }
}
