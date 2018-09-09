//package Pokenom;
import greenfoot.*;
/**
 * One of the moves in the game. This particular move that used
 * does a variable amount of damage, from 5-40.
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Metronome extends Move
{
    public final String name = "Metronome";
    private int damage;
    /**
     * Default constructor for Metronome
     */
    public Metronome()
    {
    }
     /**
     * Method that returns the amount of damage that the move does.
     * @return Integer value of the damage.
     */
    public int getDamage()
    {
        damage = Greenfoot.getRandomNumber(36) + 5;
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
