public class InsuranceCalculator {

    private final InsuranceStrategy[] strategies;

    public InsuranceCalculator() {
        // Initialize the strategies array
        strategies = new InsuranceStrategy[]{
                new InsuranceStrategyLow(),
                new InsuranceStrategyMedium(),
                new InsuranceStrategyHigh(),
                new InsuranceStrategyVeryHigh()
        };
    }

    public double calculateInsurance(double income) {
        int strategyIndex = findStrategyIndex(income);
        InsuranceStrategy strategy = strategies[strategyIndex];
        return strategy.calculate(income);
    }

    private int findStrategyIndex(double income) {
        // This function maps the given income value to an index value depending on the range the income falls within.
        // In other words, for each range the given income is greater than, a 1 gets added to the index value.
        int strategyIndex;

        // These next lines effectively increment the index value when income is greater than the given rangeMax, without actually using any conditional statements
        strategyIndex = checkIncomeRange(income, 10000);
        strategyIndex += checkIncomeRange(income, 30000);
        strategyIndex += checkIncomeRange(income, 60000);
        return strategyIndex;
    }

    private int checkIncomeRange(double income, double rangeMax) {
        // Results in either 0 or a whole number greater than 0.
        // 0 means the income is less than the current range max, everything else means it is higher.
        int indexPart = (int) (Math.ceil(income / rangeMax) - 1);

        // Divides the base index by an arbitrary large float number, and takes the ceiling of that.
        // This ensures any non-zero index will get rounded to 1, while zero remains zero.
        indexPart = (int) Math.ceil(indexPart / 100000.0);

        // O is returned when income <= rangeMax and 1 is returned if income > rangeMax.
        return indexPart;
    }
}
