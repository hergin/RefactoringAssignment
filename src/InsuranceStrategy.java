public abstract class InsuranceStrategy {
    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public abstract int getAdjustment();

    public abstract double getWeight();

    public abstract int getConstant();
}
