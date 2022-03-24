package interfaces;

public class Caravan implements Movable, Habitable {
    private int maxCapacity;
    private int location; // distance from 0(home) to current location

    public Caravan(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Caravan(int maxCapacity, int location) {
        this.maxCapacity = maxCapacity;
        this.location = location;
    }

    @Override
    public void move(int distance) {
        location += distance;
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= maxCapacity;
    }
}
