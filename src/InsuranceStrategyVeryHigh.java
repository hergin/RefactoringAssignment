public class InsuranceStrategyVeryHigh {
    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    int getAdjustment() {
        return 60000;
    }

    double getWeight() {
        return 0.02;
    }

    int getConstant() {
        return 105600;
    }
}