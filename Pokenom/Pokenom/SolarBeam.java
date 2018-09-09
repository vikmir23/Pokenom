//package Pokenom;
/**
 * One of the moves in the game. This particular move does
 * 80 Damage.
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class SolarBeam extends Move
{
    public final String name = "SolarBeam";
    private int damage = 80;
     /**
     * Default constructor for SolarBeam
     */
    public SolarBeam()
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
