package ifs;

public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 70500;
    }

    @Override
    public double getWeight() {
        return 0.2;
    }

    @Override
    public int getAdjustment() {
        return 10000;
    }
}
