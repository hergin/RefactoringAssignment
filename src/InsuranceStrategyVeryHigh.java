public class InsuranceStrategyVeryHigh {
    static double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
    private static int getConstant() {
        return 105600;
    }

    private static double getWeight() {
        return 0.02;
    }

    private static int getAdjustment() {
        return 60000;
    }
}