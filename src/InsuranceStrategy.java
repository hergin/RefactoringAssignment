public abstract class InsuranceStrategy {
    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    abstract int getAdjustment();

    abstract double getWeight();

    abstract int getConstant();
}
