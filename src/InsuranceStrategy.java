public abstract class InsuranceStrategy {
    double calculate(double income) {
        int withinTolerance = incomeWithinTolerance(income) ? 1 : 0; // technically not an if just converts a boolean
        return withinTolerance * ((income - getAdjustment()) * getWeight() + getConstant());
    }

    abstract boolean incomeWithinTolerance(double income);

    abstract int getConstant();

    abstract double getWeight();

    abstract int getAdjustment();
}
