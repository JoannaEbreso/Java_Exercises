import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testNumberThatIsNotInTheArrayCannotBeFound_WithBinarySearch(){
        BinarySearch objOfBinarySearch = new BinarySearch();
        int[] newArray = {10,19,26,14,42,44,33,35,27,31};
        assertEquals("Number not found!", objOfBinarySearch.performBinarySearch(newArray, 100));
    }

    @Test
    void testNumberThatIsInTheArrayCanBeFound_WithBinarySearch(){
        BinarySearch objOfBinarySearch = new BinarySearch();
        int[] newArray = {10,19,26,14,42,44,33,35,27,31};
        assertEquals("Number found!", objOfBinarySearch.performBinarySearch(newArray, 33));
    }
}