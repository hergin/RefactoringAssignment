package ifs;

public abstract class InsuranceStrategy {
    public double calculateInsuranceVeryHigh(double income) {
        return (income - InsuranceStrategy.getAdjustment()) * InsuranceStrategy.getWeight() + InsuranceStrategy.getConstant();
    }

    public abstract int getConstant() {
        return 105600;
    }

    public abstract double getWeight() {
        return 0.02;
    }

    public abstract int getAdjustment() {
        return 60000;
    }
}
