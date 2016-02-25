import org.junit.Test;

import org.junit.Assert;

public class ShipTest {
    @Test
    public void testInitiallyShipShouldBeAlive(){
        Ship battleship = new Ship("Battleship", 4);
        Assert.assertEquals(true,battleship.isAlive());
    }
    @Test
    public void testInitiallyPositionsShouldBeEmpty(){
        Ship battleship = new Ship("Battleship", 4);
        String [] expected = {null,null,null,null};
        Assert.assertArrayEquals(battleship.getPositions(), expected);
    }
}