
import greenfoot.*;


/**
 * Write a description of class Tester here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester extends Actor
{
    // instance variables - replace the example below with your own
    // private int x;
    GreenfootImage image = new GreenfootImage( 200, 200 );


    /**
     * Constructor for objects of class Tester
     */
    public Tester()
    {
        image.drawString( "Tester", 1150 / 2, 700 / 2 );
    }


    public void position()
    {
        Position p = new Position();
        Position pos = new Position( 250, 200 );
        int x = p.getX();
        int y = p.getY();
        boolean isTrue = ( x == 0 && y == 0 );
        System.out
            .println( "Position.getX and Position.getY\n" + isTrue + "\n" );
        x = pos.getX();
        y = pos.getY();
        isTrue = ( x == 250 && y == 200 );
        System.out
            .println( "Position.getX and Position.getY\n" + isTrue + "\n" );
        pos.changePosition( 600, 650 );

        x = pos.getX();
        y = pos.getY();
        isTrue = ( x == 600 && y == 650 );
        System.out.println( "Position.changePosition\n" + isTrue + "\n" );
    }


    public void razzberryposition()
    {
        Berry razz = new Razz( 100, 200 );
        Position p = razz.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "Razzberry.getPosition\n" + isTrue + "\n" );

    }


    public void razzberryxp()
    {
        Berry razz = new Razz( 100, 200 );
        int i = razz.getXp();
        boolean isTrue = ( 5 == i );
        System.out.println( "Razzberry.getXp\n" + isTrue + "\n" );

    }


    public void oranberryposition()
    {
        Berry oran = new Oran( 100, 200 );
        Position p = oran.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "OranBerry.getPosition\n" + isTrue + "\n" );
    }


    public void oranberryxp()
    {
        Berry oran = new Oran( 100, 200 );
        int i = oran.getXp();
        boolean isTrue = ( 10 == i );
        System.out.println( "OranBerry.getXp\n" + isTrue + "\n" );

    }


    public void pinapberryposition()
    {
        Berry pinap = new Pinap( 100, 200 );
        Position p = pinap.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "PinapBerry.getPosition\n" + isTrue + "\n" );
    }


    public void pinapberryxp()
    {
        Berry pinap = new Pinap( 100, 200 );
        int i = pinap.getXp();
        boolean isTrue = ( 15 == i );
        System.out.println( "PinapBerry.getXp\n" + isTrue + "\n" );

    }


    public void NabNabberryposition()
    {
        Berry nab = new NabNab( 100, 200 );
        Position p = nab.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "NabNabBerry.getPosition\n" + isTrue + "\n" );
    }


    public void NabNabberryxp()
    {
        Berry nab = new NabNab( 100, 200 );
        int i = nab.getXp();
        boolean isTrue = ( 25 == i );
        System.out.println( "NabNabBerry.getXp\n" + isTrue + "\n" );

    }


    public void rarecandyposition()
    {
        Berry rare = new RareCandy( 100, 200 );
        Position p = rare.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "RareCandy.getPosition\n" + isTrue + "\n" );
    }


    public void rarecandyxp()
    {
        Berry rare = new RareCandy( 100, 200 );
        int i = rare.getXp();
        boolean isTrue = ( 50 == i );
        System.out.println( "RareCandy.getXp\n" + isTrue + "\n" );

    }


    public void cherubiposition()
    {
        Monster cherubi = new Cherubi( 100, 200 );
        Position p = cherubi.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "Cherubi.getPosition\n" + isTrue + "\n" );
    }


    public void cherubihp()
    {
        Monster cherubi = new Cherubi( 100, 200 );
        int i = cherubi.getHp();
        boolean isTrue = ( i == 20 );
        System.out.println( "Cherubi.getHp\n" + isTrue + "\n" );
    }


    public void cherubilosehp()
    {
        Monster cherubi = new Cherubi( 100, 200 );
        int dmg = 10;
        cherubi.looseHp( dmg );
        int hp = cherubi.getHp();
        boolean isTrue = ( hp == 10 );
        // if ( isTrue )
        // {
        System.out.println( "Cherubi.loseHp\n" + isTrue + "\n" );
        // }
    }


    public void cherubigetAttack()
    {
        Monster cherubi = new Cherubi( 100, 200 );
        int i = cherubi.getAttack();
        boolean isTrue = ( i == 10 );
        System.out.println( "Cherubi.getAttack\n" + isTrue + "\n" );
    }


    public void cherubigetxp()
    {
        Monster cherubi = new Cherubi( 100, 200 );
        int i = cherubi.getXp();
        boolean isTrue = ( i == 10 );
        System.out.println( "Cherubi.getXp\n" + isTrue + "\n" );
    }


    public void oddishposition()
    {
        Monster oddish = new Oddish( 100, 200 );
        Position p = oddish.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "Oddish.getPosition\n" + isTrue + "\n" );
    }


    public void oddishhp()
    {
        Monster oddish = new Oddish( 100, 200 );
        int i = oddish.getHp();
        boolean isTrue = ( i == 40 );
        System.out.println( "Oddish.getHp\n" + isTrue + "\n" );
    }


    public void oddishlosehp()
    {
        Monster oddish = new Oddish( 100, 200 );
        int dmg = 10;
        oddish.looseHp( dmg );
        int hp = oddish.getHp();
        boolean isTrue = ( hp == 30 );
        // if ( isTrue )
        // {
        System.out.println( "Oddish.loseHp\n" + isTrue + "\n" );
        // }
    }


    public void oddishgetAttack()
    {
        Monster oddish = new Oddish( 100, 200 );
        int i = oddish.getAttack();
        boolean isTrue = ( i == 20 );
        System.out.println( "Oddish.getAttack\n" + isTrue + "\n" );
    }


    public void oddishgetxp()
    {
        Monster oddish = new Oddish( 100, 200 );
        int i = oddish.getXp();
        boolean isTrue = ( i == 20 );
        System.out.println( "Oddish.getXp\n" + isTrue + "\n" );
    }


    public void exeggutorposition()
    {
        Monster exeggutor = new Exeggutor( 100, 200 );
        Position p = exeggutor.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "Exeggutor.getPosition\n" + isTrue + "\n" );
    }


    public void exeggutorhp()
    {
        Monster exeggutor = new Exeggutor( 100, 200 );
        int i = exeggutor.getHp();
        boolean isTrue = ( i == 60 );
        System.out.println( "Exeggutor.getHp\n" + isTrue + "\n" );
    }


    public void exeggutorlosehp()
    {
        Monster exeggutor = new Exeggutor( 100, 200 );
        int dmg = 10;
        exeggutor.looseHp( dmg );
        int hp = exeggutor.getHp();
        boolean isTrue = ( hp == 50 );
        // if ( isTrue )
        // {
        System.out.println( "Exeggutor.loseHp\n" + isTrue + "\n" );
        // }
    }


    public void exeggutorgetAttack()
    {
        Monster exeggutor = new Exeggutor( 100, 200 );
        int i = exeggutor.getAttack();
        boolean isTrue = ( i == 30 );
        System.out.println( "Exeggutor.getAttack\n" + isTrue + "\n" );
    }


    public void exeggutorgetxp()
    {
        Monster exeggutor = new Exeggutor( 100, 200 );
        int i = exeggutor.getXp();
        boolean isTrue = ( i == 30 );
        System.out.println( "Exeggutor.getXp\n" + isTrue + "\n" );
    }


    public void tropiusposition()
    {
        Monster tropicus = new Tropius( 100, 200 );
        Position p = tropicus.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "Tropicus.getPosition\n" + isTrue + "\n" );
    }


    public void tropiushp()
    {
        Monster tropicus = new Tropius( 100, 200 );
        int i = tropicus.getHp();
        boolean isTrue = ( i == 100 );
        System.out.println( "Tropicus.getHp\n" + isTrue + "\n" );
    }


    public void tropiuslosehp()
    {
        Monster tropicus = new Tropius( 100, 200 );
        int dmg = 10;
        tropicus.looseHp( dmg );
        int hp = tropicus.getHp();
        boolean isTrue = ( hp == 90 );
        // if ( isTrue )
        // {
        System.out.println( "Tropicus.loseHp\n" + isTrue + "\n" );
        // }
    }


    public void tropiusgetAttack()
    {
        Monster tropicus = new Tropius( 100, 200 );
        int i = tropicus.getAttack();
        boolean isTrue = ( i == 50 );
        System.out.println( "Tropicus.getAttack\n" + isTrue + "\n" );
    }


    public void tropiusgetxp()
    {
        Monster tropicus = new Tropius( 100, 200 );
        int i = tropicus.getXp();
        boolean isTrue = ( i == 50 );
        System.out.println( "Tropicus.getXp\n" + isTrue + "\n" );
    }


    public void trubbishposition()
    {
        Monster trubbish = new Trubbish( 100, 200 );
        Position p = trubbish.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "Trubbish.getPosition\n" + isTrue + "\n" );
    }


    public void trubbishhp()
    {
        Monster trubbish = new Trubbish( 100, 200 );
        int i = trubbish.getHp();
        boolean isTrue = ( i == 10 );
        System.out.println( "Trubbish.getHp\n" + isTrue + "\n" );
    }


    public void trubbishlosehp()
    {
        Monster trubbish = new Trubbish( 100, 200 );
        int dmg = 10;
        trubbish.looseHp( dmg );
        int hp = trubbish.getHp();
        boolean isTrue = ( hp == 0 );
        // if ( isTrue )
        // {
        System.out.println( "Trubbish.loseHp\n" + isTrue + "\n" );
        // }
    }


    public void trubbishgetAttack()
    {
        Monster trubbish = new Trubbish( 100, 200 );
        int i = trubbish.getAttack();
        boolean isTrue = ( i == 10 );
        System.out.println( "Trubbish.getAttack\n" + isTrue + "\n" );
    }


    public void trubbishgetxp()
    {
        Monster trubbish = new Trubbish( 100, 200 );
        int i = trubbish.getXp();
        boolean isTrue = ( i == -50 );
        System.out.println( "Trubbish.getXp\n" + isTrue + "\n" );
    }


    public void munchlaxgetPosition()
    {
        Munchlax m = new Munchlax( 100, 200 );
        Position p = m.getPosition();
        Position test = new Position( 100, 200 );
        boolean isTrue = ( test.getX() == p.getX() && test.getY() == p.getY() );
        System.out.println( "Munchlax.getPosition\n" + isTrue + "\n" );
    }


    public void munchlaxgetXp()
    {
        Munchlax m = new Munchlax( 100, 200 );
        int i = m.getXp();
        boolean isTrue = ( i == 0 );
        System.out.println( "Munchlax.getXp\n" + isTrue + "\n" );
    }


    public void munchlaxaddXp()
    {
        Munchlax m = new Munchlax( 100, 200 );
        int a = m.getXp();
        int r = 4;
        m.addXp( r );
        boolean isTrue = ( m.getXp() == a + r );
        System.out.println( "Munchlax.addXp\n" + isTrue + "\n" );
    }


    public void munchlaxgetLevel()
    {
        Munchlax m = new Munchlax( 100, 200 );
        boolean isTrue = ( m.getLevel() == 5 );
        System.out.println( "Munchlax.getLevel\n" + isTrue + "\n" );
    }


    public void munchlaxLevel()
    {
        Munchlax m = new Munchlax( 100, 200 );
        for ( int i = 0; i < 15; i++ )
        {
            m.increaseLvl();
        }
        boolean isTrue = ( m.getLevel() == 20 );
        System.out.println( "Munchlax.getLevel\n" + isTrue + "\n" );
        //if ( isTrue )
        //{
            m.addXp( -50 );
            int a = m.xpNeeded;
            int i = a - 50;
            isTrue = ( m.getLevel() == 19 && m.getXp() == i );

            System.out.println( "Munchlax.looseLevel\n" + isTrue + "\n" );
        //}
    }


    public void munchlaxHp()
    {
        Munchlax m = new Munchlax( 100, 200 );
        int hp = m.getHp();
        boolean isTrue = ( hp == 30 );
        System.out.println( "Munchlax.getHp\n" + isTrue + "\n" );
        m.increaseLvl();
        isTrue = ( m.getHp() == hp + 5 );
        System.out.println( "Munchlax.getHp\n" + isTrue + "\n" );
        m.looseHp( 5 );
        isTrue = ( 30 == m.getHp() );
        System.out.println( "Munchlax.looseHp\n" + isTrue + "\n" );
        m.looseHp( -1000 );
        isTrue = ( 35 == m.getHp() );
        System.out.println( "Munchlax.looseHp\n" + isTrue + "\n" );
        m.looseHp( 1000 );
        isTrue = ( 0 == m.getHp() );
        System.out.println( "Munchlax.looseHp\n" + isTrue + "\n" );

    }


    public void Restdamage()
    {
        Move move = new Rest();
        int i = move.getDamage();
        boolean istrue = ( i == -20 );
        System.out.println( "Rest.getDamage\n" + istrue + "\n" );
    }


    public void RestgetName()
    {
        Move move = new Rest();
        String s = move.getName();
        boolean istrue = ( s.equals( "Rest" ) );
        System.out.println( "Rest.getName\n" + istrue + "\n" );
    }


    public void SolarBeamdamage()
    {
        Move move = new SolarBeam();
        int i = move.getDamage();
        boolean istrue = ( i == 80 );
        System.out.println( "SolarBeam.getDamage\n" + istrue + "\n" );
    }


    public void SolarBeamgetName()
    {
        Move move = new SolarBeam();
        String s = move.getName();
        boolean istrue = ( s.equals( "SolarBeam" ) );
        System.out.println( "SolarBeam.getName\n" + istrue + "\n" );
    }


    public void Tackledamage()
    {
        Move move = new Tackle();
        int i = move.getDamage();
        boolean istrue = ( i == 10 );
        System.out.println( "Tackle.getDamage\n" + istrue + "\n" );
    }


    public void TacklegetName()
    {
        Move move = new Tackle();
        String s = move.getName();
        boolean istrue = ( s.equals( "Tackle" ) );
        System.out.println( "Tackle.getName\n" + istrue + "\n" );
    }


    public void Metronomedamage()
    {
        Move move = new Metronome();
        int i = move.getDamage();
        boolean istrue = ( i <= 40 && i >= 5 );
        System.out.println( "Metronome.getDamage\n" + istrue + "\n" );
    }


    public void MetronomegetName()
    {
        Move move = new Metronome();
        String s = move.getName();
        boolean istrue = ( s.equals( "Metronome" ) );
        System.out.println( "Metronome.getName\n" + istrue + "\n" );
    }


    public void testAll()
    {
        razzberryposition();
        razzberryxp();
        
        oranberryposition();
        oranberryxp();
        
        pinapberryposition();
        pinapberryxp();
        
        NabNabberryposition();
        NabNabberryxp();
        
        rarecandyposition();
        rarecandyxp();
        
        cherubiposition();
        cherubihp();
        cherubilosehp();
        cherubigetAttack();
        cherubigetxp();
        
        oddishposition();
        oddishhp();
        oddishlosehp();
        oddishgetAttack();
        oddishgetxp();
        
        exeggutorposition();
        exeggutorhp();
        exeggutorlosehp();
        exeggutorgetAttack();
        exeggutorgetxp();
        
        tropiusposition();
        tropiushp();
        tropiuslosehp();
        tropiusgetAttack();
        tropiusgetxp();
        
        trubbishposition();
        trubbishhp();
        trubbishlosehp();
        trubbishgetAttack();
        trubbishgetxp();
        
        munchlaxgetPosition();
        munchlaxgetXp();
        munchlaxaddXp();
        munchlaxgetLevel();
        munchlaxLevel();
        munchlaxHp();
        
        Restdamage();
        RestgetName();
        
        SolarBeamdamage();
        SolarBeamgetName();
        
        Tackledamage();
        TacklegetName();
        
        Metronomedamage();
        MetronomegetName();

    }

}