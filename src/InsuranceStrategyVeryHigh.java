public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    static int getConstant() {
        return 105600;
    }

    static double getWeight() {
        return 0.02;
    }

    int getAdjustment() {
        return 60000;
    }
}