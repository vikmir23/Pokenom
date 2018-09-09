
// package Pokenom;
import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;


/**
 * The gui for the battle world
 * 
 * @author Keontrye Hsieh, Vikram Miryala, Richard Ma
 * @version May 29, 2017
 * @author Period: 3
 * @author Assignment: Pokenom
 *
 * @author Sources: N/A
 */
public class Battle extends World
{

    private Background b;

    private int counter = 0;

    private ArrayList<Move> move;

    private Tackle t = new Tackle();

    private Rest r = new Rest();

    private Metronome met = new Metronome();

    private SolarBeam sb = new SolarBeam();

    private Munchlax m;

    private Monster mon;

    private GreenfootSound sound;

    private GreenfootSound battleSound;

    private GreenfootSound lossSound = new GreenfootSound( "GameOver.mp3" );

    private GreenfootImage orig;

    private GreenfootImage munchlax;

    private GreenfootImage monster;


    /**
     * Constructor for objects of class Battle.
     * 
     */
    public Battle()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super( 600, 400, 1 );
    }


    /**
     * Constructor for objects of class Background. Constructs a new world with
     * 1150x700 cells with a cell size of 1x1 Displays munch and mons in the
     * world
     * 
     * @param bac
     *            holds an instance of the background world so that the game can
     *            return to the background world
     * @param munch
     *            holds an instance to the munchlax object present in background
     * @param mons
     *            holds an instance to the Monster that munchlax collided with
     *            and now has to battle
     */
    public Battle( Background bac, Munchlax munch, Monster mons )
    {
        super( 1150, 700, 1 );
        b = bac;
        m = munch;
        mon = mons;
        showText( "You Encountered a Monster", 1150 / 2, 500 );
        munchlax = m.getBigPicture();
        orig = m.getImage();
        m.setImage( munchlax );
        monster = mon.getBigPicture();
        mon.setImage( monster );
        addObject( mon, 900, 350 );
    }


    /**
     * gives the objects present in the class a chance to perform the action
     * that they are supposed to perform
     * 
     * has the code for instigating the battle between two different monsters
     */
    public void act()
    {

        // move = m.getMove();
        addObject( m, 100, 350 );
        showText( "munchlax hp = " + m.getHp(), 150, 500 );
        showText( "monster hp = " + mon.getHp(), 900, 500 );
        int dmg = 0;

        counter++;

        showText(
            "Pick a move by typing it in (t for tackle, m for metronome, s and b for "
                + "solarbeam, or r for rest)",
            1150 / 2,
            600 );
        if ( counter % 5 == 0 && counter >= 150 )
        {
            if ( Greenfoot.isKeyDown( "t" ) )
            {
                m.useMove( t, mon );
            }
            else if ( Greenfoot.isKeyDown( "m" ) )
            {
                m.useMove( met, mon );
            }
            else if ( Greenfoot.isKeyDown( "s" ) && Greenfoot.isKeyDown( "b" ) )
            {
                m.useMove( sb, mon );
            }
            else if ( Greenfoot.isKeyDown( "r" ) )
            {
                m.looseHp( r.getDamage() );
            }
        }
        if ( counter % 50 == 0 && counter > 150 )
        {
            m.looseHp( mon.getAttack() );
        }

        if ( mon.getHp() <= 0 )
        {
            m.setImage( orig );
            m.addXp( mon.getXp() );
            sound = b.getSound();
            // battleSound.stop();
            sound.play();
            m.setImage( orig );
            Greenfoot.setWorld( b );

        }
        if ( m.getHp() == 0 )
        {
            battleSound = b.getBattleSound();
            battleSound.stop();
            lossSound.play();
            Greenfoot.setWorld( new GameOver() );
        }

    }

}
