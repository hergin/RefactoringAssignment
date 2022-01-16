public abstract class InsuranceStrategy {
    double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    abstract boolean incomeWithinTolerance(double income);

    abstract int getConstant();

    abstract double getWeight();

    abstract int getAdjustment();
}
