package cscie55.hw1.elevatortest;

import cscie55.hw1.elevator.Elevator;

public class ElevatorTest {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        // Boarding passengers
        elevator.boardPassenger(3);
        elevator.boardPassenger(3);
        elevator.boardPassenger(5);

        // Moving elevator from ground to top
        for (int i = 0; i < 6; i++) {
            elevator.move();
        }
        // Moving elevator from top to ground
        for (int i = 0; i < 7; i++) {
            elevator.move();
        }

    }
}
