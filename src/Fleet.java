public class Fleet {
    private Ship[] fleet = new Ship[5];
    private String[] ships = {"BATTLESHIP", "CARRIER", "CRUISER", "DESTROYER", "SUBMARINE"};
    private int[] size = {4, 5, 3, 2, 3};

    public Fleet() {
        for (int i = 0; i < ships.length; i++) {
            this.fleet[i] = new Ship( ships[i], size[i] );
        }
    }

    public int size() {
        return fleet.length;
    }

    public boolean deployeShipAt(String shipName, String position, String orientation) throws Exception {
        Ship ship = getShip( shipName );
        int size = ship.getSize();
        /*Here grid class will be used to validate the ship deployment*/
        String [] positions = {"A1","B1","C1","D1"};
        ship.deployAtPositions(positions);
        return true;
    }

    private Ship getShip(String name){
        for (Ship ship : fleet)
            if (ship.getName().equals( name.toUpperCase( ) ))
                return ship;
        throw  new RuntimeException( "Ship "+name+" does not exists");
    }
}
