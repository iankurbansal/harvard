package cscie55.hw2;

public class Building {
    private Elevator elevator;
    public static final int FLOORS = 7;
    private Floor[] floors = new Floor[FLOORS];

    public Elevator getElevator() {
        return elevator;
    }

    /**
     * Building No arg constructor
     */
    public Building() {
        for (int i = 1; i <= FLOORS; i++) {
            floors[i - 1] = new Floor(this, i);
        }
        this.elevator = new Elevator(this);
    }

    /**
     * @param floorNumber
     * @return - Floor object for given floor number
     */
    public Floor getFloor(int floorNumber) {
        return floors[floorNumber - 1];
    }
}
