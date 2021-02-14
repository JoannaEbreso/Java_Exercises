package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    Turtle turtle;

    @BeforeEach
    void setUp() {
        turtle = new Turtle();
    }

    @Test
    void testThatTurtleHasAPen(){
        assertNotNull(turtle.getPen());
    }

    @Test
    void testThatTurtleDirection_IsFrontUponCreation(){
        assertEquals(Direction.front,turtle.getDirection());
    }

    @Test
    void testThatTurtleIsAtStartPositionUponCreation(){
        assertEquals(0,turtle.getTurtlePosition().getxCoordinate());
        assertEquals(0,turtle.getTurtlePosition().getyCoordinate());
    }

    @Test
    void testThatTurtlePenPositionCanBeSetToDown(){
        turtle.penDown();

        assertEquals(PenPosition.down, turtle.getPen().getPosition());
    }

    @Test
    void testThatTurtlePenPositionCanBeSetToUp(){
        turtle.penUp();

        assertEquals(PenPosition.up, turtle.getPen().getPosition());
    }

    @Test
    void testThatTurtleDirectionCanBeSetToRight(){
        turtle.setDirection(Direction.right);

        assertEquals(Direction.right, turtle.getDirection());
    }

    @Test
    void testThatTurtleDirectionCanBeSetToLeft(){
        turtle.setDirection(Direction.left);

        assertEquals(Direction.left, turtle.getDirection());
    }


}