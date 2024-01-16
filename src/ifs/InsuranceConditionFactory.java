package ifs;

import java.util.HashMap;
import java.util.Map;

public class InsuranceConditionFactory {
    private final Map<Double, InsuranceStrategy> strategies = new HashMap<>();

    public InsuranceConditionFactory() {
        strategies.put(10000.0, new InsuranceStrategyLow());
        strategies.put(30000.0, new InsuranceStrategyMedium());
        strategies.put(60000.0, new InsuranceStrategyHigh());
    }

    public InsuranceStrategy getStrategy(double income) {
        for(Map.Entry<Double, InsuranceStrategy> strategy : strategies.entrySet()) {
            if(income < strategy.getKey()) {
                return strategy.getValue();
            }
        }
        return new InsuranceStrategyVeryHigh();
    }
}
