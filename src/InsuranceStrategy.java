public abstract class InsuranceStrategy {
    static double calculateInsuranceVeryHigh(double income) {
        return (income - InsuranceStrategy.getAdjustment()) * InsuranceStrategy.getWeight() + InsuranceStrategy.getConstant();
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
