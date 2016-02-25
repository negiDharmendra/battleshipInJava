import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FleetTest {
    Fleet fleet;
    @Before
    public void setUp(){
        fleet = new Fleet();
    }
    @Test
    public void testFleetShouldProvideAFleetOfFiveShip(){
        assertEquals(fleet.size(),5);
    }
    @Test
    public void testDeploySipAtShouldSayTrueIfShipHaveBeenDeployed(){
        boolean reply;
        try {
            reply = fleet.deployeShipAt("Battleship","A1","vertical");
            assertTrue(reply);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}