public abstract class calculate {

    public double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    public abstract int getConstant();

    public abstract double getWeight();

    public abstract int getAdjustment();
}