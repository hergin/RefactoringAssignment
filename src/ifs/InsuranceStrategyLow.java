package ifs;

public class InsuranceStrategyLow extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 2825;
    }

    @Override
    public double getWeight() {
        return 0.2;
    }

    @Override
    public int getAdjustment() {
        return 10000;
    }
//comment so I can commit
}
