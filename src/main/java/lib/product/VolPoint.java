package lib.product;

import java.util.Date;

public class VolPoint {

    private String symbol;

    private double vol;

    private double strike;

    private Date expiry;

    public VolPoint(String symbol, double vol, double strike, Date expiry) {
        this.symbol = symbol;
        this.vol = vol;
        this.strike = strike;
        this.expiry = expiry;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }

    public double getStrike() {
        return strike;
    }

    public void setStrike(double strike) {
        this.strike = strike;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
