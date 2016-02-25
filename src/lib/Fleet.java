package lib;

public class Fleet {
    protected Ship[] fleet;
    public Fleet() {
        Ship battleship = new Ship("Battleship", 4);
        Ship carrier = new Ship("Carrier", 5);
        Ship cruiser = new Ship("Cruiser", 3 );
        Ship destroyer = new Ship("Destroyer", 2 );
        Ship submarine = new Ship("Submarine", 3 );
        this.fleet = new Ship[]{battleship, carrier, cruiser,destroyer,submarine};
    }
}
