public class InsuranceCalculator {

    private final InsuranceStrategy[] strategies;

    public InsuranceCalculator() {
        // Initialize the strategies array - Each value in the array should account for a 10k range
        // Only accounts for incomes up to 150000k inclusive
        strategies = new InsuranceStrategy[]{
                new InsuranceStrategyLow(), // <= 10000
                new InsuranceStrategyMedium(),  // <= 20000
                new InsuranceStrategyMedium(),  // etc...
                new InsuranceStrategyHigh(),
                new InsuranceStrategyHigh(),
                new InsuranceStrategyHigh(),
                new InsuranceStrategyVeryHigh(),    // <= 70000
                new InsuranceStrategyVeryHigh(),    // <= 80000
                new InsuranceStrategyVeryHigh(),    // <= 90000
                new InsuranceStrategyVeryHigh(),    // <= 100000
                new InsuranceStrategyVeryHigh(),    // <= 110000
                new InsuranceStrategyVeryHigh(),    // <= 120000
                new InsuranceStrategyVeryHigh(),    // <= 130000
                new InsuranceStrategyVeryHigh(),    // <= 140000
                new InsuranceStrategyVeryHigh()     // <= 150000

        };
    }

    public double calculateInsurance(double income) {
        int strategyIndex = findStrategyIndex(income);
        InsuranceStrategy strategy = strategies[strategyIndex];
        return strategy.calculate(income);
    }

    private int findStrategyIndex(double income) {
        return (int) (Math.ceil(income / 10000.0) - 1);
    }
}
