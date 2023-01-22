public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    public double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public int getConstant() {
        return 105600;
    }

    double getWeight() {
        return 0.02;
    }

    public int getAdjustment() {
        return 60000;
    }
}