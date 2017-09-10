package lib.calc.input;

public class CommodityOptionInput extends OptionInput {

    final private double storageCost;
    final private double convenienceYield;

    public CommodityOptionInput(double underlyingPrice,
                                double strikePrice,
                                double riskFreeRate,
                                double storageCost,
                                double convenienceYield,
                                double volatility,
                                double timeToMaturity,
                                PutCall putCall,
                                OptionType optionType) {
        super(underlyingPrice, strikePrice, riskFreeRate, volatility, timeToMaturity, putCall, optionType);
        this.storageCost = storageCost;
        this.convenienceYield = convenienceYield;
    }

    public double getStorageCost() {
        return storageCost;
    }

    public double getConvenienceYield() {
        return convenienceYield;
    }

    @Override
    public double getCostOfCarry() {
        return getRiskFreeRate() + storageCost - convenienceYield;
    }
}
