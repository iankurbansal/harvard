package cscie55.hw2;

public class Floor {
    private int passengersWaitingOnFloor;
    private int floorNumber;
    private Building building;

    /**
     * Floor Constructor
     *
     * @param building
     * @param floorNumber
     */
    public Floor(Building building, int floorNumber) {
        this.floorNumber = floorNumber;
        this.building = building;
    }

    /**
     * @return - number of Passengers waiting on this floor
     */
    public int getPassengersWaiting() {
        return this.passengersWaitingOnFloor;
    }

    /**
     * Elevator will be requested to stop on this floor when this method is called
     */
    public void waitForElevator() {
        passengersWaitingOnFloor++;
    }

    /**
     * decrement number of waiting passengers on the floor by 1
     */
    public void decrementWaitingPassengers(){
        passengersWaitingOnFloor--;
    }
}
