public class Factorial {

    public int findFactorial(int number){
        int factorial = 1;
        for(int count = 1; count<=number; count++){
            factorial = factorial * count;
        }
        return factorial;
    }

}
