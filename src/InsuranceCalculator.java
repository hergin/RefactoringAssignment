public class InsuranceCalculator {

    private InsuranceStrategyVeryHigh strategy;

    public double calculateInsurance(double income) {
        return strategy.calculateInsurance(income);
    }

    public double calculateInsuranceVeryHigh(double income) {
        return strategy.calculateInsuranceVeryHigh(income);
    }
    public int getConstant() {
        return strategy.getConstant();
    }

    public double getWeight() {
        return strategy.getWeight();
    }
    public int getAdjustment() {
        strategy = new InsuranceStrategyVeryHigh();
        return strategy.getAdjustment();
    }



}
