import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        Map<InsuranceType, Rule<Double>> rules = createRules(income);
        return Stream.of(InsuranceType.values())
                .filter(insuranceType -> rules.get(insuranceType).condition.get())
                .map(insuranceType -> rules.get(insuranceType).process.get())
                .findFirst()
                .orElse(-1.0);
    }

    Map<InsuranceType, Rule<Double>> createRules(double income) {
        Map<InsuranceType, Rule<Double>> createRules = new HashMap<>();
        createRules.put(InsuranceType.LOW, createRuleForLowInsurance(income));
        createRules.put(InsuranceType.MEDIUM, createRuleForMediumInsurance(income));
        createRules.put(InsuranceType.HIGH, createRuleForHighInsurance(income));
        createRules.put(InsuranceType.VERY_HIGH, createRuleForVeryHighInsurance(income));

        return createRules;
    }

    Rule<Double> createRuleForVeryHighInsurance(double income) {
        return createRule(
                ()->(true),
                ()-> new InsuranceStrategyVeryHigh().calculate(income)
        );
    }

    Rule<Double> createRuleForHighInsurance(double income) {
        return createRule(
                ()->(income <= 60000),
                ()-> new InsuranceStrategyHigh().calculate(income)
        );
    }

    Rule<Double> createRuleForMediumInsurance(double income) {
        return createRule(
                ()->(income <= 30000),
                ()-> new InsuranceStrategyMedium().calculate(income)
        );
    }

    Rule<Double> createRuleForLowInsurance(double income) {
        return createRule(
                ()->(income <= 10000),
                ()-> new InsuranceStrategyLow().calculate(income)
        );
    }

    Rule<Double> createRule(Supplier<Boolean> condition, Supplier<Double> process) {
        return new Rule<>(condition, process);
    }
}
