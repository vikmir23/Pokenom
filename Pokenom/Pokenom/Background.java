
// package Pokenom;

import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;


/**
 * The Gui for the main world
 * 
 * @author Keontrye Hsieh, Vikram Miryala, Richard Ma
 * @version May 29, 2017
 * @author Period: 3
 * @author Assignment: Pokenom
 *
 * @author Sources: N/A
 */
public class Background extends World
{
    // static Counter counter = new Counter();
    // LinkedList<Position, int> ll = new LinkedList<Position, int>()

    public Munchlax m;

    private GreenfootImage orig;

    // int tog = 0;

    public Battle bat = new Battle();

    private ArrayList<Berry> listBerr = new ArrayList<Berry>();

    private ArrayList<Monster> listMons = new ArrayList<Monster>();

    private ArrayList<Position> listPos = new ArrayList<Position>();

    private Queue<Berry> myQueueBerr = new LinkedList<Berry>();

    private Queue<Monster> myQueueMons = new LinkedList<Monster>();

    private GreenfootSound sound = new GreenfootSound( "csmusic.mp3" );

    private GreenfootSound battlesound = new GreenfootSound(
        "battlemusic.mp3" );
    // GreenfootImage img;

    private String text;

    // Character[][] grid;

    private int counter = 0;


    // public Background(Tester t)
    // {
    // super(1150, 700, 1);
    // addObject(t, 1150/2, 1);
    // }
    /**
     * Constructor for objects of class Background. Constructs a new world with
     * 1150x700 cells with a cell size of 1x1 Displays a munchlax object in the
     * world
     */
    public Background()
    {
        // Create a new world with 1150x700 cells with a cell size of 1x1
        // pixels.
        // int x = 1200, y = 750;
        super( 1150, 700, 1 );

        // grid = new Character[1151][701];
        int x = 1150 / 2;
        int y = 700 / 2;
        m = new Munchlax( x, y );
        orig = new GreenfootImage( m.getImage() );
        // grid[x][y] = m;

        addObject( m, x, y );
        text = "level = " + m.getLevel() + "\nxp = " + m.getXp() + "\nhp = "
            + m.getHp();
        ;
        // img = new GreenfootImage(text, 25, Color.BLACK, Color.WHITE);
        // img.fill();
        // img.drawImage(img, 1050, 50);
        showText( text, 1050, 50 );
        sound.setVolume( 50 );
        battlesound.setVolume( 50 );

        Greenfoot.start();

        // Greenfoot.playSound("csmusic.mp3");
    }


    /**
     * 
     * returns the sound played while munchlax is eating berries
     * 
     * @return sound
     */
    public GreenfootSound getSound()
    {
        return sound;
    }


    /**
     * 
     * returns the sound played in the battle world
     * 
     * @return battleSound
     */
    public GreenfootSound getBattleSound()
    {
        return battlesound;
    }


    /**
     * this method runs the game it allows the characters to move and spawns the
     * berries at random spots on the world it also takes collisions into
     * account and calls the battle world if the character collides with a
     * monster
     */
    public void act()
    {
        m.setImage( orig );
        battlesound.stop();

        if ( counter == 0 )
        {
            sound.playLoop();
        }
        if ( Greenfoot.isKeyDown( "space" ) )
        {
            sound.pause();
        }
        else if ( Greenfoot.isKeyDown( "n" ) )
        {
            sound.play();
        }

        text = "level = " + m.getLevel() + "\nxp = " + m.getXp() + "\nhp = "
            + m.getHp();
        showText( text, 1050, 50 );
        // img = new GreenfootImage(text, 25, Color.BLACK, Color.WHITE);
        // img.fill();
        Berry ch;
        int xp;
        int a = 0;
        int b = 0;
        int z = 0;
        int i = 0;
        // int newX = 0;
        // int newY = 0;
        Berry berr;
        Monster mons;
        m.act();
        // Berry o = new Oran(100, 150);
        // System.out.println(o.getPosition().getX() );
        // System.out.println(o.getPosition().getY());
        int x = m.getPosition().getX();
        int y = m.getPosition().getY();
        for ( int j = 0; j < listBerr.size(); j++ )
        {
            berr = listBerr.get( j );
            if ( ( berr.getPosition().getX() >= x - 25
                && berr.getPosition().getX() <= x + 25 )
                && ( berr.getPosition().getY() >= y - 25
                    && berr.getPosition().getY() <= y + 25 ) )
            {
                // System.out.println( "im in" );
                xp = berr.getXp();
                // System.out.println(xp);
                m.addXp( xp );
                removeObject( berr );
                listBerr.remove( j );
                j--;
            }

        }

        for ( int j = 0; j < listMons.size(); j++ )
        {
            mons = listMons.get( j );
            if ( ( mons.getPosition().getX() >= x - 20
                && mons.getPosition().getX() <= x + 20 )
                && ( mons.getPosition().getY() >= y - 20
                    && mons.getPosition().getY() <= y + 20 ) )
            {
                // m.addXp(mons.getXp());
                removeObject( mons );
                listMons.remove( j );

                sound.pause();
                battlesound.play();

                Greenfoot.setWorld( new Battle( this, m, mons ) );
                // sound.play();
                // battlesound.stop();

            }
        }

        Position pos;
        // Berry berr;
        // Monster mons;
        Berry or;
        Berry ra;
        Berry pi;
        Berry na;
        Berry ca;
        Monster trop;
        Monster trub;
        Monster exe;
        Monster odd;
        Monster cher;
        // ch = new Oran( 100, 150 );
        // x = ch.getPosition().getX();
        // System.out.println( "this is a test " + x );

        counter++;
        removeObject( m );
        addObject( m, x, y );

        z = Greenfoot.getRandomNumber( 10000 );
        a = Greenfoot.getRandomNumber( this.getWidth() - 39 );
        b = Greenfoot.getRandomNumber( this.getHeight() - 39 );
        a += 40;
        b += 40;
        a /= 50;
        a *= 50;

        b /= 50;
        b *= 50;
        if ( z <= 4999 )
        {
            ra = new Razz( a, b );
            myQueueBerr.add( ra );
            // addObject(ra, a, b);
        }
        else if ( z > 4999 && z <= 6999 )
        {
            or = new Oran( a, b );
            myQueueBerr.add( or );
            // addObject(or, a, b);
        }
        else if ( z > 6999 && z <= 8499 )
        {
            pi = new Pinap( a, b );
            myQueueBerr.add( pi );
            // addObject(pi, a, b);
        }
        else if ( z > 8499 && z <= 9499 )
        {
            na = new NabNab( a, b );
            myQueueBerr.add( na );
            // addObject(na, a, b);
        }
        else
        {
            ca = new RareCandy( a, b );
            myQueueBerr.add( ca );
            // addObject(ca, a, b);
        }

        if ( z <= 4999 )
        {
            cher = new Cherubi( a, b );
            myQueueMons.add( cher );
            // addObject(cher, a, b);
        }
        else if ( z > 4999 && z <= 6999 )
        {
            odd = new Oddish( a, b );
            myQueueMons.add( odd );
            // addObject(odd, a, b);
        }
        else if ( z > 6999 && z <= 8499 )
        {
            exe = new Exeggutor( a, b );
            myQueueMons.add( exe );
            // addObject(exe, a, b);
        }
        else if ( z > 8499 && z <= 9499 )
        {
            trop = new Tropius( a, b );
            myQueueMons.add( trop );
            // addObject(trop, a, b);
        }
        else
        {
            trub = new Trubbish( a, b );
            myQueueMons.add( trub );
            // addObject(trub, a, b);
        }

        if ( counter % 50 == 0 )
        {
            // GreenfootSound.stop();
            // counter = 0;
            i = Greenfoot.getRandomNumber( 10 );
            // ch = myQueue.remove();
            if ( i < 7 )
            {
                berr = myQueueBerr.remove();
                pos = berr.getPosition();
                x = pos.getX();
                y = pos.getY();
                // newX = x;
                // newY = y;
                // for ( int j = 0; j < listPos.size(); j++ )
                // {
                while ( listPos.contains( pos ) )
                {
                    // System.out.println( "old x " + x );
                    // System.out.println( "old y " + y );
                    a = Greenfoot.getRandomNumber( this.getWidth() - 39 );
                    b = Greenfoot.getRandomNumber( this.getHeight() - 39 );
                    a += 40;
                    b += 40;
                    a /= 50;
                    a *= 50;

                    b /= 50;
                    b *= 50;
                    berr.getPosition().changePosition( a, b );
                    // System.out.println( "new x " + berr.getPosition().getX()
                    // );
                    // System.out.println( "new y " + berr.getPosition().getY()
                    // );

                    x = berr.getPosition().getX();
                    y = berr.getPosition().getY();
                    pos = new Position( x, y );
                    // j = 0;
                }

                addObject( berr, x, y );
                listPos.add( pos );
                listBerr.add( berr );
            }
            else
            {
                mons = myQueueMons.remove();
                pos = mons.getPosition();
                x = pos.getX();
                y = pos.getY();
                // System.out.println("monster");

                while ( listPos.contains( pos ) )
                {
                    // System.out.println("monster");
                    // System.out.println( "old x " + x );
                    // System.out.println( "old y " + y );
                    a = Greenfoot.getRandomNumber( this.getWidth() - 39 );
                    b = Greenfoot.getRandomNumber( this.getHeight() - 39 );
                    a += 40;
                    b += 40;
                    a /= 50;
                    a *= 50;

                    b /= 50;
                    b *= 50;
                    mons.getPosition().changePosition( a, b );
                    // System.out.println( "new x " + mons.getPosition().getX()
                    // );
                    // System.out.println( "new y " + mons.getPosition().getY()
                    // );
                    // System.out.println( "new x " +
                    // listMons.get(j).getPosition().getX());
                    // System.out.println("new y " +
                    // listMons.get(j).getPosition().getY());
                    x = mons.getPosition().getX();
                    y = mons.getPosition().getY();
                    pos = new Position( x, y );
                }

                addObject( mons, x, y );
                listMons.add( mons );
                listPos.add( pos );
                // System.out.println("monster added");
            }

        }

    }
}