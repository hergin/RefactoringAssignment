public abstract class InsuranceStrategy {
    public double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
    public double calculateInsuranceHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
    public double calculateInsuranceMedium(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
    public double calculateInsuranceLow(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public abstract int getConstant();

    public abstract double getWeight();

    public abstract int getAdjustment();
}
