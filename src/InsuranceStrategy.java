public class InsuranceStrategy {
    static double calculateVeryHighInsurance(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }
    public abstract int getConstant();

    public abstract int getWeight();

    public abstract int getAdjustment();
}
