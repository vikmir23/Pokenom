//package Pokenom;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * The Monster superclass that extends character. All monsters extend  this
 * superclass, and have the parameters and methods required of monsters. 
 *
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Monster extends Character
{
    private Position p;
    int hp = 0;
    int attack = 0;
    private GreenfootImage x = null;
    //public double defense;
    /**
     * Default Constructor of Monster. Creates a monster at the default 
     * position
     */
    public Monster ()
    {
        p = new Position (0,0);
      //  defense = 0;
    }
     /**
     * Method that returns the picture used for the monster in the 
     * battle screen.
     * @return GreenFootImage that is the picture for the battle.
     */
    public GreenfootImage getBigPicture()
    {
        return x;
    }
    /**
     * Method that returns the Health of the monster
     * @return Integer value of the health
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
    
//    public double getDefense()
//    {
//        return defense;
//    }
    
}
