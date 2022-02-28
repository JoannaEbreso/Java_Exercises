import java.util.Scanner;

public class VariableArgumentsList {
    public static void main(String[] args) {
        System.out.println(product(10,20,40,100));
        System.out.println(product(100,15,6,12,40,38,22));
    }

    public static int product(int... numbers){
        int result = 1;

        for (int i = 0; i < numbers.length ; i++) {
            result *= numbers[i];
        }

        return result;
    }
}
