public class InsuranceCalculator {

    private strategy strategy;


    public double calculateInsurance(double income) {
        strategy = new strategy();
        return strategy.calculateInsurance(income);
    }

}
