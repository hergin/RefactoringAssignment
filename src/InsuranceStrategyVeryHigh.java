public class InsuranceStrategyVeryHigh {
    static double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    static double getWeight() {
        return 0.02;
    }

    static int getAdjustment() {
        return 60000;
    }

    static int getConstant() {
        return 105600;
    }
}