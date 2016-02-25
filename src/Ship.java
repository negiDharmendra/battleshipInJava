
public class Ship {
    private final String name;
    private final int lives;
    private int vanishedLives = 0;
    private String [] positions;

    public Ship(String name, int size) {
        this.name = name;
        this.lives = size;
        this.positions = new String[size];
    }

    public boolean isAlive() {
        return 0 == this.vanishedLives;
    }

    public String[] getPositions() {
        return this.positions;
    }
}
