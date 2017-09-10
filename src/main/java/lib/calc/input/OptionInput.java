package lib.calc.input;

public abstract class OptionInput {

    final private double underlyingPrice;
    final private double strikePrice;

    final private double riskFreeRate;
    final private double volatility;

    final private double timeToMaturity;

    final private PutCall putCall;
    final private OptionType optionType;

    public OptionInput(double underlyingPrice,
                       double strikePrice,
                       double riskFreeRate,
                       double volatility,
                       double timeToMaturity,
                       PutCall putCall,
                       OptionType optionType) {
        this.underlyingPrice = underlyingPrice;
        this.strikePrice = strikePrice;
        this.riskFreeRate = riskFreeRate;
        this.volatility = volatility;
        this.timeToMaturity = timeToMaturity;
        this.putCall = putCall;
        this.optionType = optionType;
    }

    public double getUnderlyingPrice() {
        return underlyingPrice;
    }

    public double getStrikePrice() {
        return strikePrice;
    }

    public double getRiskFreeRate() {
        return riskFreeRate;
    }

    public double getVolatility() {
        return volatility;
    }

    public double getTimeToMaturity() {
        return timeToMaturity;
    }

    public PutCall getPutCall() {
        return putCall;
    }

    public OptionType getOptionType() {
        return optionType;
    }

    public abstract double getCostOfCarry();
}
