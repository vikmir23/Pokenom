import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Codes for the game over screen when the player runs out of health. 
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class GameOver extends World
{

   /**
     * Constructor for objects of class GameOver.
     * Creates the screen for the game over. 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 700, 1);
        showText("GAME OVER", 1150 /2, 700 / 2);
    }
}
