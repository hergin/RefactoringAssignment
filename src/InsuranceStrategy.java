public abstract class InsuranceStrategy {
    public double calculateInsuranceVeryHigh(double income) {
        return (income - 60000) * 0.02 + 105600;
    }

    public abstract int getConstant();

    public abstract double getWeight();

    public abstract int getAdjustment();
}
