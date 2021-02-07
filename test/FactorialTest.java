import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testThatWeCanFindFactorialOfANumber(){
        Factorial objOfFactorial = new Factorial();
        assertEquals(120,objOfFactorial.findFactorial(5));
    }
}