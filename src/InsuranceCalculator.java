public class InsuranceCalculator {

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income*0.365;
        } else if (income <= 30000) {
            return (income-10000)*0.2+35600;
        } else if (income <= 60000) {
            return (income-30000)*0.1+76500;
        } else {
            return getaDouble(income);
        }
    }

    private static double getaDouble(double income) {
        return (income - getAnInt()) * getaDouble() + getAdjustment();
    }

    private static int getAdjustment() {
        return 105600;
    }

    private static double getaDouble() {
        return 0.02;
    }

    private static int getAnInt() {
        return 60000;
    }

}
