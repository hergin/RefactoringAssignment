public abstract class InsuranceStrategy {

    public double calculate(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
    public double getWeight() {
        return 0.02;
    }

    public int getAdjustment() {
        return 60000;
    }

    public int getConstant() {
        return 105600;
    }
}
