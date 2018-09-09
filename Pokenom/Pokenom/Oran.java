//package Pokenom;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  A berry in the game. Eating the berry gains xp.  
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Oran extends Berry
{
    private Position p;
    public final int xp = 10;
     /**
     * Constructor to create the Oran berry at a certain 
     * position in the map. 
     * @param x is the x coordinate
     * @param y is the y coordinate
     */
    public Oran(int x, int y)
    {
        p = new Position (x,y);
    }
    /**
     * Method that return the position of character, specified for
     * the Oran berry.
     * @return Position that is given in x,y coordinates
     */
    public Position getPosition()
    {
        return p;
    }
    /**
     * Method that returns the experience value of the monster.
     * @return Integer value of the experience 
     */
    public int getXp()
    {
        return xp;
    }
      
}
