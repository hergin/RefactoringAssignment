import ifs.*;

public class InsuranceCalculator {
    private final InsuranceConditionFactory insuranceConditionFactory = new InsuranceConditionFactory();

    public double calculateInsurance(double income) {
        InsuranceStrategy strategy = insuranceConditionFactory.getStrategy(income);
        return strategy.calculate(income);
    }
}
