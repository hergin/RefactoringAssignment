public abstract class InsuranceStrategy {
    double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    abstract int getAdjustment();

    abstract double getWeight();

    abstract int getConstant();
}
