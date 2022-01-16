import java.util.List;

public class InsuranceCalculator {

    private final List<InsuranceStrategy> strategies;

    public InsuranceCalculator(List<InsuranceStrategy> strategies){
        this.strategies = strategies;
    }

    public double calculateInsurance(double income) {
        int insurance = 0;
        for (InsuranceStrategy strategy: strategies) {
            insurance += strategy.calculate(income);
        }
        return insurance;
    }
}
