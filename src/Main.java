import java.util.Scanner;

/**
 * Created by Xorcist on 30-04-2017.
 */
public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            double principlePerMonth = in.nextDouble();
            double interestRate = in.nextDouble();
            int numberOfMonths = in.nextInt();
            int timesCompoundedPerYear = in.nextInt();
            System.out.println(String.format("%.2f", FixedDeposit.maturityOfRecurringFD(principlePerMonth, interestRate, numberOfMonths, timesCompoundedPerYear)));
        }
    }
}
