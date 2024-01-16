public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    public double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
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