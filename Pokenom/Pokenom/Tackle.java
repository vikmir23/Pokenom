//package Pokenom;
import greenfoot.*;
//import java.awt.*;
import java.util.*;
//import java.awt.*;
/**
 * One of the moves in the game. This particular move does
 * 10 damage 
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Tackle extends Move
{
    

    public final String name = "Tackle";
    private final int damage = 10;
    /**
     * Default constructor for Tackle
     */
    public Tackle()
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
