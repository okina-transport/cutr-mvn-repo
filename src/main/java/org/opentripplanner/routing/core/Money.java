package org.opentripplanner.routing.core;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Currency;

public class Money implements Comparable<Money>, Serializable {
    private static final long serialVersionUID = 4741816148450653508L;
    private WrappedCurrency currency = null;
    private int cents;

    public Money() {
    }

    public Money(WrappedCurrency currency, int cents) {
        this.currency = currency;
        this.cents = cents;
    }

    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Currency cur = this.currency.getCurrency();
        if (cur == null) {
            return "Money()";
        } else {
            nf.setCurrency(cur);
            String c = nf.format((double)this.cents / Math.pow(10.0D, (double)this.currency.getDefaultFractionDigits()));
            return "Money(" + c + ")";
        }
    }

    public boolean equals(Object other) {
        Money m = (Money)other;
        return m.currency.equals(this.currency) && m.cents == this.cents;
    }

    public int compareTo(Money m) {
        if (m.currency != this.currency) {
            throw new RuntimeException("Can't compare " + m.currency + " to " + this.currency);
        } else {
            return this.cents - m.cents;
        }
    }

    public void setWrappedCurrency(WrappedCurrency currency) {
        this.currency = currency;
    }

    public WrappedCurrency getWrappedCurrency() {
        return this.currency;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public int getCents() {
        return this.cents;
    }

    public WrappedCurrency getCurrency() {
        return this.currency;
    }

    public void setCurrency(WrappedCurrency currency) {
        this.currency = currency;
    }
}
