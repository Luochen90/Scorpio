package lib.calc.input;

public class EquityOptionInput extends OptionInput {

    final private double dividendRate;

    public EquityOptionInput(double underlyingPrice,
                             double strikePrice,
                             double riskFreeRate,
                             double dividendRate,
                             double volatility,
                             double timeToMaturity,
                             PutCall putCall,
                             OptionType optionType) {
        super(underlyingPrice, strikePrice, riskFreeRate, volatility, timeToMaturity, putCall, optionType);
        this.dividendRate = dividendRate;
    }

    public double getDividendRate() {
        return dividendRate;
    }

    @Override
    public double getCostOfCarry() {
        return getRiskFreeRate() - dividendRate;
    }
}
