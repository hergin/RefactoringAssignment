public class InsuranceCalculator {

    private final InsuranceStructure structure = new InsuranceStructure();

    public double calculateInsurance(double income) {
        InsuranceStrategy strategy = structure.getStrategy(income);
        return strategy.calculateInsurance(income);
    }

}
