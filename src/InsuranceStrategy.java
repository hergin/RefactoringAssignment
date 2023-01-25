public abstract class InsuranceStrategy {
    double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public abstract int getAdjustment();

    public abstract double getWeight();

    public abstract int getConstant();
}
