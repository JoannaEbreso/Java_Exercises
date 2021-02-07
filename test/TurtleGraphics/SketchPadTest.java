package TurtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SketchPadTest {

    SketchPad sketchPad;

    @BeforeEach
    void setUp() {
        sketchPad = new SketchPad();
    }

    @Test
    void testThatSketchPadIsOfSize20By20(){
        assertEquals(20,sketchPad.getFloor().length);
    }
}