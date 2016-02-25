import lib.Ship;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ShipTest {
    private Ship battleship;
    private Ship carrier;
    private Ship destroyer;
    @Before
    public void initialize() {
        String [] battleshipPositions = {"A1","A2","A3","A4"};
        String [] destroyerPositions = {"G1","G2"};
        battleship = new Ship("Battleship", 4);
        carrier = new Ship("Carrier", 5);
        destroyer = new Ship( "Destroyer", 2 );
        try {
            carrier.deployAtPositions(battleshipPositions);
            destroyer.deployAtPositions(destroyerPositions);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void testInitiallyShipShouldBeAlive(){
        assertEquals(true,battleship.isAlive());
    }
    @Test
    public void testInitiallyPositionsShouldBeEmpty(){
        String [] expected = {null,null,null,null};
        assertArrayEquals(battleship.getPositions(), expected);
    }
    @Test
    public void testDeployAtPositionsShouldSetThePositionOfAShip(){
        String [] expected = {"A1","A2","A3","A4"};
        assertArrayEquals(carrier.getPositions(),expected );
    }
    @Test
    public void testDeployAtPositionsShouldThrowExceptionWhenSomeOneTrayToDeployAgain(){
        String [] expected = {"A1","A2","A3","A4","A5"};
        try {
            carrier.deployAtPositions(expected);
        } catch (Exception e) {
            assertEquals( "Can not deploy again", e.getMessage() );
        }
    }
    @Test
    public void testGotHitWillGiveTrueOnTheEventOfHit (){
        boolean result = destroyer.gotHitAt("G2");
        assertEquals( true, result );
    }
    @Test
    public void testGotHitWillGiveFalseOnTheEventOfMiss (){
        boolean result = destroyer.gotHitAt("K2");
        assertEquals( false, result );
    }
    @Test
    public void testIsAliveShouldGiveFalseIfTheShipAsGotAsManyHitAsHisLives (){
        destroyer.gotHitAt( "G1" );
        destroyer.gotHitAt( "G2" );
        assertEquals( false, destroyer.isAlive());
    }

}