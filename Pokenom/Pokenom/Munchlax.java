//package Pokenom;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Munchax, a character. This is the player, and it runs across the map 
 * while collecting berries. The player can control the movement. Just like
 * all other characters, munchlax has health and experience, but that influences
 * his health for battles. 
 *  @author  Keontrye Hsieh, Vikram Miryala, Richard Ma
 *  @version May 29, 2017
 *  @author  Period: 3
 *  @author  Assignment: Pokenom
 *
 *  @author  Sources: N/A
 */
public class Munchlax extends Character
{
    
    private int xp = 0;

    public int xpNeeded = 5;
    private GreenfootImage munchlax = new GreenfootImage("munchlaxbig.png");

    private int lvl = 5;
    
    private int maxHp = 30;

    private int hp = 30;
    

    private Position p;

    /**
     * Default constructor for munchlax.
     */
    public Munchlax()
    {
        p = new Position( 0, 0 );
    }


    /**
 * Constructor for munchlax. Creates a munchlax and places it on the map
 * @param x is the x coordinate
 * @param y is the y coordinate
 */
    public Munchlax( int x, int y )
    {
        p = new Position( x, y );
    }

 /**
     * Method that return the position of character, specified for
     * munchlax.
     * @return Position that is given in x,y coordinates
     */
    public Position getPosition()
    {
        return p;
    }

/**
 * Method: Adds the amount of xp that Munchlax gains from 
 * either eating berries or winning battles
 * @param xp Integer value of the experience gained 
 */
    public void addXp( int xp )
    {
        this.xp += xp;
        if ( this.xp >= xpNeeded )
        {
            //System.out.println("hi");
            this.xp -= xpNeeded;
            increaseLvl();
            addXp( 0 );
        }
        else if(this.xp < 0)
        {
            removeLvl();
        }
        
        else
        {
            return;
        }
    }
    /**
     * Method that codes for losing experience when you fight a trubbish
     */
    public void removeLvl()
    {
        lvl--;
        xpNeeded = (int) (xpNeeded / 1.5);
        xp = xpNeeded + xp;
        addXp(0);
    }
    /**
     * Method that increase your level for every time you gain enough xp
     * 
     */
    public void increaseLvl()
    {
        lvl++;
        xpNeeded = (int) (xpNeeded * 1.5);
        maxHp += 5;
        hp += 5;
        //addMove();
        
    }
    /**
     * Method that returns the level for munchlax
     * @return Integer value of munchlax level.
     */
    public int getLevel()
    {
        return lvl;
    }
    /**
     * Method that returns the attack value of munchlax.
     * @return Integer value of the attack.
     */
    public int getXp()
    {
        return xp;
    }
    /**
     * Method that returns the amount of health that munchlax has.
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
    public void looseHp(int att)
    {
        hp -= att;
        if (hp > maxHp)
        {
            hp = maxHp;
        }
        if (hp < 0)
        {
            hp = 0;
        }
        
    }
    /**
     * Method that returns the picture that is used during battles.
     * @return GreenFootImage which is the image.
     */
    public GreenfootImage getBigPicture()
    {
        return munchlax;
    }
    /**
     * Allows Munchlax to use moves in the game
     */
    public void useMove(Move m, Monster mon)
    {
        int rand = Greenfoot.getRandomNumber(1000) + 1;
        if (rand > 10)
        {
            mon.looseHp(m.getDamage());
        }
    }
    
    
    
    
    /**
     * Act - do whatever the Munchlax wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //System.out.println("munchlax entered");
        //while(!(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down") ||
        //Greenfoot.isKeyDown("right") ||Greenfoot.isKeyDown("left")))
        {
            //System.out.println("hit");
            //System.wait(
            //return;
        }
        if(Greenfoot.isKeyDown("right"))
        {
            Position a = this.getPosition();
            if(a.getX() + 5 <= 1150)
            {
                Position b = new Position(a.getX() + 5, a.getY());
                p = b;
                move(5);
            }
            //System.out.println("hit1");
            
            return;
            //g.moveUp(m, m.getPosition());
        
        }
        if(Greenfoot.isKeyDown("left"))
        {
            Position a = this.getPosition();
            if(a.getX() - 5 >= 0)
            {
                Position b = new Position(a.getX() - 5, a.getY());
                p = b;
                turn(180);
                move(5);
                turn(-180);
            }
            return;
        
        }
        if(Greenfoot.isKeyDown("down"))
        {
            Position a = this.getPosition();
            if(a.getY() + 5 <= 700)
            {
                Position b = new Position(a.getX(), a.getY() + 5);
                p = b;
                turn(90);
                move(5);
                turn(-90);
            }
            return;
        
        }
        if(Greenfoot.isKeyDown("up"))
        {
            Position a = this.getPosition();
            if(a.getY() - 5 >= 0)
            {
                Position b = new Position(this.getPosition().getX(), this.getPosition().getY() - 5);
                p = b;
                turn(-90);
                move(5);
                turn(90);
            }
            return;
        
        }
        
        // Add your action code here.
    }    
}
