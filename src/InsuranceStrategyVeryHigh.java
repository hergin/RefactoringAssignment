public class InsuranceStrategyVeryHigh {
    public static double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public static int getConstant() {
        return 105600;
    }

    public static double getWeight() {
        return 0.02;
    }

    public static int getAdjustment() {
        return 60000;
    }
}