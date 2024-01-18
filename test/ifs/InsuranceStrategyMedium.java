package ifs;

public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 35600;
    }
//)*+10000)*0.2+35600
    @Override
    public double getWeight() {
        return 0.2;
    }

    @Override
    public int getAdjustment() {
        return 10000;
    }
}
