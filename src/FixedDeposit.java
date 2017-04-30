/**
 * Created by Xorcist on 30-04-2017.
 */
public class FixedDeposit {

    public static double ROICalculator(double principle, int maturityValue, int numberOfMonths, int timesCompoundedPerYear) {
        double time = numberOfMonths / 12;
        double exp = 1 / (timesCompoundedPerYear * time);
        double base = (maturityValue / principle);
        return (Math.pow(base, exp) - 1) * timesCompoundedPerYear;
    }

    public static double maturityCalculator(double principle, double interestRate, int numberOfMonths, int timesCompoundedPerYear) {
        double base = ((interestRate / 100) / timesCompoundedPerYear) + 1;
        double exp = (double) timesCompoundedPerYear * (double) numberOfMonths / 12.0;
        double multiplicand = Math.pow(base, exp);
        return multiplicand * principle;
    }

    public static double maturityOfRecurringFD(double principlePerMonth, double interestRate, int numberOfMonths, int timesCompoundedPerYear) {
        double ret = 0.0;
        for (int n = 0; n < numberOfMonths; n++) {
            ret += maturityCalculator(principlePerMonth, interestRate, numberOfMonths - n, timesCompoundedPerYear);
        }
        return ret;
    }
}
