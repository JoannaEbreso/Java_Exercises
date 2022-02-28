import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] possibleSums = {2,3,4,5,6,7,8,9,10,11,12};
        int[] frequency = new int[11];

        for(int i = 0; i<36000000; i++){
            //Roll die one
            int dieOneValue = rand.nextInt(6)+1;
//            System.out.println(dieOneValue);
            // Roll die two
            int dieTwoValue = rand.nextInt(6)+1;
//            System.out.println(dieTwoValue);


            int total = dieOneValue + dieTwoValue;
//
//            System.out.println("thifuihioijojjioijooi");
//
//            System.out.println(total);
            ++frequency[total - 2];
        }


        for (int x = 0; x<possibleSums.length; x++){
            System.out.print(possibleSums[x]);
            System.out.print("     ");
            System.out.println(frequency[x]);
        }
    }
}
