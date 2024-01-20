public class InsuranceStrategyVeryHigh extends InsuranceStrategy{
    @Override
    public int getConstant() {
        return 106500;
    }
    @Override
    public double getWeight() {return 0.02;}
    @Override
    public int getAdjustment() {
        return 60000;
    }
}
