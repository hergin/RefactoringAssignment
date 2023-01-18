import java.util.TreeMap;

public class InsuranceCalculator {

    private final TreeMap<Double, InsuranceStrategy> treeMap;

    public InsuranceCalculator() {
        this.treeMap = configureInsuranceStrategyBrackets();
    }

    private TreeMap<Double, InsuranceStrategy> configureInsuranceStrategyBrackets() {
        TreeMap<Double, InsuranceStrategy> tm = new TreeMap<>();
        tm.put(10_000.0, new InsuranceStrategyLow());
        tm.put(30_000.0, new InsuranceStrategyMedium());
        tm.put(60_000.0, new InsuranceStrategyHigh());
        tm.put(Double.MAX_VALUE, new InsuranceStrategyVeryHigh());
        return tm;
    }

    private InsuranceStrategy getInsuranceStrategy(double income) {
        double ceiling = treeMap.ceilingKey(income);
        return treeMap.get(ceiling);
    }

    public double calculateInsurance(double income) {
        return getInsuranceStrategy(income).calculateInsurance(income);
    }
}
