public abstract class InsuranceStrategy {
    public double calculateVeryHighInsurance(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public abstract int getConstant();

    public abstract double getWeight();

    public abstract int getAdjustment();
}
