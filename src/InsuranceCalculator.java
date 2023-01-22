public class InsuranceCalculator {

    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {
        return insuranceStrategyVeryHigh.calculateInsurance(income);
    }
    public static double extracted(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    private static int getAdjustment() {
        return 60000;
    }

    private static double getWeight() {
        return 0.02;
    }

    private static int getConstant() {
        return 105600;
    }


}
