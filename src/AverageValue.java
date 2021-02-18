import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AverageValue {
    public double findAverageValue(List<Integer> listOfNumbers) {

        return listOfNumbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }
}
