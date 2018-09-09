//package Pokenom;

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
public class RareCandy extends Berry
{
    // instance variables - replace the example below with your own
    private Position p;

    public final int xp = 50;


     /**
     * Constructor to create the Rare candy at a certain 
     * position in the map. 
     * @param x is the x coordinate
     * @param y is the y coordinate
     */
    public RareCandy( int x, int y )
    {
        p = new Position( x, y );
    }


     /**
     * Method that return the position of character, specified for
     * the Rare Candy berry.
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
