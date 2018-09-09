//package Pokenom;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

   /**
 *  The berry superclass. All berries extend this.
 *  In this class, there are methods that are all shared within
 *  the berries. 
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Berry extends Character
{
    private Position p;
    private int xp = 0;
    /**
     * Default constructor for the Berry class. Creates a berry at the
     * default position.
     */
    public Berry ()
    {
        p = new Position(0,0);
    }
    /**
     * Constructor for the Berry. This one constructs a berry at the
     * specified coordinates.
     * @param x is the x coordinate
     * @param y is the y coordinate
     */
    public Berry ( int x, int y)
    {
        p = new Position(x,y);
    }
     /**
     * Method that give the experience amount for the particular berry.
     * Every berry is different. 
     * @return Integer value that is the experience value. 
     */
    public int getXp()
    {
        return xp;
    }
    
    /**
     * Act - do whatever the Berry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
