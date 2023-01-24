public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income * 0.365;
        } else if (income <= 30000) {
            return (income - 10000) * 0.2 + 35600;
        } else if (income <= 60000) {
            return (income - 30000) * 0.1 + 76500;
        } else {
            return getaDouble(income);
        }
    }

    public static double getaDouble(double income) {
        return (income - getAdjustment()) * getaDouble() + getAnInt();
    }

    public static int getAnInt() {
        return 105600;
    }

    public static double getaDouble() {
        return 0.02;
    }

    public static int getAdjustment() {
        return 60000;
    }
}