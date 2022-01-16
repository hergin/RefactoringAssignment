import java.util.List;

public class InsuranceCalculator {

    private final List<InsuranceStrategy> strategies;

    public InsuranceCalculator(List<InsuranceStrategy> strategies){
        this.strategies = strategies;
    }

    public double calculateInsurance(double income) {
        InsuranceStrategy selectedStrategy = new InsuranceStrategyVeryHigh();
        for (InsuranceStrategy strategy: strategies) {
            if(strategy.incomeWithinTolerance(income)) {
                selectedStrategy = strategy;
            }
        }
        return selectedStrategy.calculate(income);
    }
}
