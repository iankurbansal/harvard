package cscie55.hw1.elevator;

public class Elevator {
    private static final int NO_OF_FLOORS_IN_BUILDING = 7;
    private int currentFloor = 1;
    private boolean isGoingUp = true;
    private int[] passengersOnEachFloor = new int[NO_OF_FLOORS_IN_BUILDING];

    // when called moves the elevator one floor at a time
    public void move() {
        this.passengersOnEachFloor[currentFloor-1] = 0;
        System.out.println(this.toString());
        if (isGoingUp) {
            if (currentFloor == NO_OF_FLOORS_IN_BUILDING) {
                isGoingUp = false;
                currentFloor--;
            } else {
                currentFloor++;
            }
        } else {
            if (currentFloor == 1) {
                isGoingUp = true;
                currentFloor++;
            } else {
                currentFloor--;
            }
        }
    }

    private int getTotalPassengers() {
        int totalPassengersOnBoard = 0;
        for (int noOFPassengers : passengersOnEachFloor) {
            totalPassengersOnBoard += noOFPassengers;
        }
        return totalPassengersOnBoard;
    }

    @Override
    public String toString() {
        return "Floor " + currentFloor + ": " + getTotalPassengers() + " passengers";
    }

    public void boardPassenger(int destinationFloor) {
        this.passengersOnEachFloor[destinationFloor-1] += 1;
    }
}
