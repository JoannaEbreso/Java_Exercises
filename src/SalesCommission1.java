import java.util.Scanner;

public class SalesCommission1 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        String[] salaryRanges = {"$200 - 299","$300 - 399", "$400 - 499", "$500 - 599", "$600 - 699", "$700 -799", "$800 - 899", "$900 - 999", "$1000+"};
        int[] frequencyList = new int[9];
        System.out.println("Enter total sales for each sales person in your organization. Press -1 to stop entering");
        System.out.println("Total sales: ");

        int totalSales = newScanner.nextInt();

        while(totalSales!=-1){

            int salary = ((int) (200 + ((9.0 / 100.0) * totalSales)));
            ++frequencyList[(salary/100) - 2];

            System.out.println("Total sales: ");
            totalSales = newScanner.nextInt();
        }

        for(int i = 0; i<salaryRanges.length; i++){
            System.out.println(salaryRanges[i] +": " + frequencyList[i]);
        }
        // 9% of gross sale + 200 = Salary
    }
}
