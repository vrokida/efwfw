import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RoverTest {


    @Test
    public void shouldSetRightPosition() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();

        Rover rover = new Rover(expectedX, expectedY, 'N');

        assertPositionRover(rover, expectedX, expectedY, 'N');
    }

    @Test
    public void shouldMoveOneStepNorth() {
        int expectedX = 1;
        int expectedY = getRandomInt();
        Rover rover = new Rover(0, expectedY, 'N');

        rover.followInstructions("M");

        assertPositionRover(rover, expectedX, expectedY, 'N');
    }

    @Test
    public void shouldMoveOneStepSouth() {
        int expectedX = -1;
        int expectedY = getRandomInt();
        Rover rover = new Rover(0, expectedY, 'S');

        rover.followInstructions("M");

        assertPositionRover(rover, expectedX, expectedY, 'S');
    }

    @Test
    public void shouldTurnEast() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, 'N');

        rover.followInstructions("R");

        assertPositionRover(rover, expectedX, expectedY, 'E');
    }

    @Test
    public void shouldTurnSouth() {
        int expectedX = getRandomInt();
        int expectedY = getRandomInt();
        Rover rover = new Rover(expectedX, expectedY, 'E');

        rover.followInstructions("R");

        assertPositionRover(rover, expectedX, expectedY, 'S');
    }

//    @Test
//    public void shouldTurnWest() {
//        int expectedX = getRandomInt();
//        int expectedY = getRandomInt();
//        Rover rover = new Rover(expectedX, expectedY, 'S');
//
//        rover.followInstructions("R");
//
//        assertPositionRover(rover, expectedX, expectedY, 'W');
//    }

    private void assertPositionRover(Rover actualRover, int expectedX, int expectedY, char expectedDirection){
        assertEquals(actualRover.getX(), expectedX);
        assertEquals(actualRover.getY(), expectedY);
        assertEquals(actualRover.getDirection(), expectedDirection);
    }

    private int getRandomInt() {
        Random random = new Random();
        return random.nextInt();
    }
}