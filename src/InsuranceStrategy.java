public abstract class InsuranceStrategy {
    public static double calculateInsuranceVeryHigh(double income) {
        return (income - InsuranceStrategy.getAdjustment()) * InsuranceStrategy.getWeight() + InsuranceStrategy.getConstant();
    }

    static int getConstant() {
        return 105600;
    }

    static double getWeight() {
        return 0.02;
    }

    static int getAdjustment() {
        return 60000;
    }
}
