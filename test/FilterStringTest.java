import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterStringTest {

    FilterString filterStringObject;
    @BeforeEach
    void setUp() {
        filterStringObject = new FilterString();
    }

    @Test
    void testThatWeCanFilterAListOfStrings(){
        List<String> listOfStrings = Arrays.asList("and","guy","any","app");
        List<String> filteredList = filterStringObject.filterList(listOfStrings);
        assertEquals(3,filteredList.size());
    }
}