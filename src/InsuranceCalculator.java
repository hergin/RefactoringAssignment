import java.util.NavigableMap;
import java.util.TreeMap;

public class InsuranceCalculator {
    private final NavigableMap<Double, InsuranceStrategy> strategies = new TreeMap<>();

    public InsuranceCalculator() {
        strategies.put(0.0, new InsuranceStrategyLow());
        strategies.put(10000.0, new InsuranceStrategyMedium());
        strategies.put(30000.0, new InsuranceStrategyHigh());
        strategies.put(60000.0, new InsuranceStrategyVeryHigh());
    }

    public double calculateInsurance(double income) {
        return strategies.floorEntry(income).getValue().calculate(income);
    }
}

/*
    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculate(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyMedium();
            return strategy.calculate(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
            return strategy.calculate(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculate(income);
        }
    }
}

 */
