public class InsuranceCalculator {

    public double calculateInsurance(double income, InsuranceStrategy strat) {
        return strat.calculate(income);
    }
}
