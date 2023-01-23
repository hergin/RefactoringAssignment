public class InsuranceStrategyVeryHigh {
    static double calculateVeryHighInsurance(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    static int getAdjustment() {
        return 60000;
    }

    static double getWeight() {
        return 0.02;
    }

    static int getConstant() {
        return 105600;
    }
}