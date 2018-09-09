 
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The character superclass. All the interactable objects are
 * characters, and share these parameters.
 * 
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public  class Character extends Actor
{
    Position p;
    int xp;
    /**
     * Method that returns the position of a character in the map.
     * @return Position, in (x,y) form of the specified character.
     */
    public Position getPosition()
    {
        return p;
    }
    /**
     * Method that returns the experience value of the a certain character
     * @return Integer value of the amount of experience a character has.
     */
    public int getXp()
    {
        return xp;
    }
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
