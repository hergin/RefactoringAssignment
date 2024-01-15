public class InsuranceStructure {

    public InsuranceStrategy getStrategy(double income) {
        int ikey = Math.min((int)Math.ceil(income/10000), 7);
        return new InsuranceStrategy[] {
                new InsuranceStrategyLow(),
                new InsuranceStrategyLow(),
                new InsuranceStrategyMedium(),
                new InsuranceStrategyMedium(),
                new InsuranceStrategyHigh(),
                new InsuranceStrategyHigh(),
                new InsuranceStrategyHigh(),
                new InsuranceStrategyVeryHigh()
        }[ikey];
    }
}
