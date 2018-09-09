
// package Pokenom;
import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * One of the monsters in the game. This particular monster is the 
 * monster for the OranBerry.  
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Oddish extends Monster
{
    Position p;

    public final int attack = 20;

    public int hp = 40;

    public final int xp = 20;

    private GreenfootImage oddish = new GreenfootImage( "oddishbig.png" );

    /**
     * Constructor to create the Oddish monster at a certain 
     * position in the map. 
     * @param x is the x coordinate
     * @param y is the y coordinate
     */
    public Oddish( int x, int y )
    {
        p = new Position( x, y );
        // Background.addObject(this, x, y);

    }
/**
     * Method that return the position of character, specified for
     * Exeggutor.
     * @return Position that is given in x,y coordinates
     */
    public Position getPosition()
    {
        return p;
    }
    /**
     * Method that returns the picture that is used during battles.
     * @return GreenFootImage which is the image.
     */
    public GreenfootImage getBigPicture()
    {
        return oddish;
    }
    /**
     * Method that returns the amount of health that the monster has.
     * @return Integer that is amount of health.
     */
    public int getHp()
    {
        return hp;
    }
    /**
     * Method that takes in the amount of damage done, and subtracts the
     * damage from the health. 
     */
    public void looseHp(int dmg)
    {
        hp -= dmg;
    }
    /**
     * Method that returns the attack value of a the monster.
     * @return Integer value of the attack.
     */
    public int getAttack()
    {
        return attack;
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
