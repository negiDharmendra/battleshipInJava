package lib;

public class Ship {
    private final String name;
    private final int lives;
    private int vanishedLives = 0;
    private String[] positions;

    public Ship(String name, int size) {
        this.name = name;
        this.lives = size;
        this.positions = new String[size];
    }

    public boolean isAlive() {
        return lives > vanishedLives;
    }


    public void deployAtPositions(String[] positions) throws Exception {
        if (isDeployed())
            throw new Exception( "Can not deploy again" );
        this.positions = positions;
    }

    private boolean isDeployed() {
        for (String position : positions)
            if (position == null) return false;
        return true;
    }

    public boolean gotHitAt(String shoot) {
        for (String position : positions)
            if (position.equals( shoot )) {
                vanishedLives++;
                return true;
            }
        return false;
    }

    public String[] getPositions() {
        return this.positions;
    }

    public int getSize() {
        return lives;
    }

    public String getName() {
        return name;
    }
}
