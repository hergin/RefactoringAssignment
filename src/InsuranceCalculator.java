public class InsuranceCalculator {

    private static InsuranceStrategy strategy;

    public static double calculateInsurance(double income) {
        switch ((int) income / 10000) {
            case 0:
            case 1:
                strategy = new InsuranceStrategyLow();
                return strategy.calculate(income);
            case 2:
            case 3:
                strategy = new InsuranceStrategyMedium();
                return strategy.calculate(income);
            case 4:
            case 5:
                strategy = new InsuranceStrategyHigh();
                return strategy.calculate(income);
            default:
                strategy = new InsuranceStrategyVeryHigh();
                return strategy.calculate(income);
        }
    }
}
