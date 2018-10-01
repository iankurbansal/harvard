package cscie55.hw2;

public class Elevator {
    private int currentFloor = 1;
    private Building building;
    private boolean isGoingUp = true;
    public static final int CAPACITY = 10;
    private int[] passengersDestinedToEachFloor = new int[Building.FLOORS];

    /**
     * Elevator constructor.
     *
     * @param building
     */
    public Elevator(Building building) {
        this.building = building;
    }

    /**
     * when called moves the elevator one floor at a time
     */
    public void move() {
        if (isGoingUp) {
            if (currentFloor == Building.FLOORS) {
                currentFloor--;
                isGoingUp = false;
            } else {
                currentFloor++;
            }
        } else {
            if (currentFloor == 1) {
                currentFloor++;
                isGoingUp = true;
            } else {
                currentFloor--;
            }
        }
        this.passengersDestinedToEachFloor[currentFloor - 1] = 0;
        int passengersToBoard = building.getFloor(currentFloor).getPassengersWaiting();
        for(int i=0;i<passengersToBoard;i++){
            try {
                boardPassenger(1);
                building.getFloor(currentFloor).decrementWaitingPassengers();
            } catch (ElevatorFullException e) {
                System.out.println("The passenger was unable to board because the elevator is full.");
            }
        }
        System.out.println(this.toString());
    }

    /**
     * @return number of passengers currently on the Elevator
     */
    public int getPassengers() {
        int totalPassengersOnBoard = 0;
        for (int noOFPassengers : passengersDestinedToEachFloor) {
            totalPassengersOnBoard += noOFPassengers;
        }
        return totalPassengersOnBoard;
    }

    @Override
    public String toString() {
        return "Floor " + currentFloor + ": " + getPassengers() + " passengers";
    }

    /**
     * Boards a single passenger in elevator destined to a floor
     *
     * @param destinationFloor
     */
    public void boardPassenger(int destinationFloor) throws ElevatorFullException {
        if (getPassengers() < CAPACITY) {
            System.out.println("The passenger boarded successfully for " + destinationFloor + " floor");
            this.passengersDestinedToEachFloor[destinationFloor - 1] += 1;
        } else {
            throw new ElevatorFullException();
        }
    }

    /**
     * @return current floor number of the elevator
     */
    public int getCurrentFloor() {
        return currentFloor;
    }
}
