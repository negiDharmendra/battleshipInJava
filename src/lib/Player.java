package lib;

public class Player {
    String[] usedPositions;
    String[] sunkShips;
    String[] hit;
    String[] miss;
    String name;
    Fleet fleet;
    boolean readyState;
    boolean isAlive;
    public Player(String name){
        this.name = name;
        this.readyState = false;
        this.isAlive = true;
        this.fleet = new Fleet();
    }
}
