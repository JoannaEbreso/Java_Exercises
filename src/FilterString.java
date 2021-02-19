import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterString {

    public List<String> filterList(List<String> listOfStrings) {

        Predicate<String> containsLetterAAndThreeCharacters =
                word -> (word.startsWith("a") && word.length() == 3);

        return listOfStrings.stream()
                .filter(containsLetterAAndThreeCharacters)
                .collect(Collectors.toList());
    }
}
