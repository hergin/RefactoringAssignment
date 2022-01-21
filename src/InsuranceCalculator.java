public class InsuranceCalculator {

    private final InsuranceStrategyVeryHigh insuranceStrategyVeryHigh = new InsuranceStrategyVeryHigh();

    public double calculateInsurance(double income) {
        return insuranceStrategyVeryHigh.calculateInsurance(income);
    }

    public double calculateInsuranceVeryHigh(double income) {
        return insuranceStrategyVeryHigh.calculateInsuranceVeryHigh(income);
    }
    public int getConstant() {
        return insuranceStrategyVeryHigh.getConstant();
    }

    public double getWeight() {
        return insuranceStrategyVeryHigh.getWeight();
    }
    public int getAdjustment() {
        return insuranceStrategyVeryHigh.getAdjustment();
    }



}
