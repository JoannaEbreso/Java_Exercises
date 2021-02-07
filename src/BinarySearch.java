import java.util.Arrays;

public class BinarySearch {
    public String performBinarySearch(int[] arrayOfNumbers, int numberToBeFound) {
        Arrays.sort(arrayOfNumbers);
        int low = 0;
        int high = (arrayOfNumbers.length) - 1;
        int count = 1;
        int middle;

        while(count < arrayOfNumbers.length) {
            middle = (low + high) / 2;

            if (arrayOfNumbers[middle] != numberToBeFound) {
                if (numberToBeFound < arrayOfNumbers[middle]) {
                    //change the high
                    high = middle - 1;
                }
                if (numberToBeFound > arrayOfNumbers[middle]) {
                    //change the low
                    low = middle + 1;
                }
            }

            else if(arrayOfNumbers[middle] == numberToBeFound){
                return "Number found!";
            }
            count++;
        }
        return "Number not found!";
    }
}
