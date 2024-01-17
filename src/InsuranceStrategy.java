public abstract class InsuranceStrategy {
    double calculate(double income) {
        // Terrible, but no conditional statements
        return ((income - getAdjustment()) * getWeight() + getConstant()) * Boolean.compare(inRange(income), false);
    }

    boolean inRange(double income) {
        return income > getMinimum() && (getMaximum() < 0 || income <= getMaximum());
    }

    abstract int getAdjustment();

    abstract double getWeight();

    abstract int getConstant();

    abstract double getMinimum();

    abstract double getMaximum();
}
