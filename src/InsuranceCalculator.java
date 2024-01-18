import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        strategy = getStrategy(income);
        return strategy.calculate(income);
    }

    List<InsuranceStrategy> strategies = Arrays.asList(new InsuranceStrategyLow(),
            new InsuranceStrategyMedium(), new InsuranceStrategyMedium(),
            new InsuranceStrategyHigh(), new InsuranceStrategyHigh(), new InsuranceStrategyHigh(),
            new InsuranceStrategyVeryHigh());

    private InsuranceStrategy getStrategy(double income){
        double dividing = income/10000.00001;
        int result = (int) dividing;
        int index = Math.min(result, 6);
        return strategies.get(index);
    }
}
