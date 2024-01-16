package ifs;

public abstract class InsuranceStrategy {
    public abstract double getWeight();

    public abstract int getConstant();

    public abstract int getAdjustment();

    public double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
}
