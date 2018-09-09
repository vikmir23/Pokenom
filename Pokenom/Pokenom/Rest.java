//package Pokenom;
/**
 * One of the moves in the game. This particular move heals 
 * munchlax for 20 health
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Rest extends Move
{
    public final String name = "Rest";
    private int damage = -20;
    /**
     * Default constructor for Rest
     */
    public Rest()
    {
    }
    /**
     * Method that returns the amount of damage that the move does.
     * @return Integer value of the damage.
     */
    public int getDamage()
    {
        return damage;
    }
    /**
     * Method that returns the name of the move. 
     * @return String that is name of the move
     */
    public String getName()
    {
        return name;
    }
}
