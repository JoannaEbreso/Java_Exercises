
import java.util.ArrayList;
import java.util.Arrays;

public class Eratosthenes {

    public ArrayList<Integer> getAllPrimeNumbers(boolean[] anArray){
        Arrays.fill(anArray, true);
        ArrayList<Integer> arrayOfPrimeNumbers = new ArrayList<>();
        for(int processingIndex = 2; processingIndex<anArray.length; processingIndex++){
            for(int otherIndex = processingIndex+1; otherIndex<anArray.length; otherIndex++){
                if(otherIndex % processingIndex == 0 && anArray[otherIndex]){
                    anArray[otherIndex] = false;
                }
            }
        }

        for(int index = 2; index<anArray.length; index++){
            if(anArray[index]){
                arrayOfPrimeNumbers.add(index);
            }
        }

        return arrayOfPrimeNumbers;
    }


    public static void main(String[] args) {

        Eratosthenes eratosthenes = new Eratosthenes();
        boolean[] anArrayOfNumbers = new boolean[1000];

        ArrayList<Integer> allPrimeNumbersInArray = eratosthenes.getAllPrimeNumbers(anArrayOfNumbers);

        for(Integer element: allPrimeNumbersInArray){
            System.out.println(element);
        }

    }
}
