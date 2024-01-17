public class InsuranceStrategyVeryHigh {
    static double calculateInsuranceVeryHigh(double income) {
        return (income - getConstant()) * getWeight() + getAdjustment();
    }

    static int getConstant() {
        return 60000;
    }

    static double getWeight() {
        return 0.02;
    }

    static int getAdjustment() {
        return 105600;
    }
}