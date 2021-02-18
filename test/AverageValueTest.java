import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageValueTest {

    AverageValue averageValueObject;
    @BeforeEach
    void setUp() {
        averageValueObject = new AverageValue();
    }

    @Test
    void averageValueOfAListOfValues_CanBeFound(){
        List<Integer> listOfNumbers = Arrays.asList(10,20,30,40,50);

        assertEquals(30,averageValueObject.findAverageValue(listOfNumbers));
    }
}