package org.opentripplanner.routing.core;

import java.io.Serializable;
import java.util.Currency;
import java.util.Locale;

public class WrappedCurrency implements Serializable {
    private static final long serialVersionUID = -7887233247171375107L;
    private Currency currency;
    private String currencyCode;
    String symbol;
    int defaultFractionDigits;

    public WrappedCurrency() {
        this.currency = null;
    }

    public WrappedCurrency(Currency value) {
        this.currency = value;
    }

    public WrappedCurrency(String name) {
        this.currency = Currency.getInstance(name);
    }

    public String getSymbol(Locale l) {
        return this.currency.getSymbol(l);
    }

    public String toString() {
        return this.currency.toString();
    }

    public boolean equals(Object o) {
        if (o instanceof Currency) {
            return this.currency.equals(o);
        } else {
            WrappedCurrency c = (WrappedCurrency)o;
            return this.currency.equals(c.currency);
        }
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getDefaultFractionDigits() {
        return this.defaultFractionDigits;
    }

    public void setDefaultFractionDigits(int defaultFractionDigits) {
        this.defaultFractionDigits = defaultFractionDigits;
    }
}
