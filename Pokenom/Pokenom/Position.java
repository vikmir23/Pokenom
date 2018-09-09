//package Pokenom;
/**
 * The position class. This codes for all the the position that
 * characters will use within the map.  
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Position
{
    private int x;
    private int y;
    
    /**
     * Default constructor. Sets the position at 0,0
     */
    public Position()
    {
        x = 0;
        y = 0;
    }
    /**
     * Constructor for position. sets the position to x,y
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Method that returns the x coordinate
     * @return Integer of the x coordinate
     */
    public int getX()
    {
        return x;
    }
    /**
     * Method that returns the y coordinate
     * @return Integer of the y coordinate
     */
    public int getY()
    {
        return y;
    }
    /**
     * Method that changes the position of a certain character
     * @param newX the new x coordinate
     * @param newY the new y coordinate
     */
    public void changePosition(int newX, int newY)
    {
        x = newX;
        y = newY;
    }

}
