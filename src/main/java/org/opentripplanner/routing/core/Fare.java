package org.opentripplanner.routing.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.opentripplanner.routing.core.Fare.FareType;

public class Fare implements Serializable {
    private static final long serialVersionUID = 2979309709691997235L;
    protected static final Logger LOGGER = Logger.getLogger(Fare.class.getCanonicalName());
    private static final String TAG = "OTP";
    public FareType key = null;
    public Money regular = null;
    public ArrayList<Fare> fare;

    public Fare() {
    }

    public FareType getKey() {
        return this.key;
    }

    public void setKey(FareType key) {
        this.key = key;
    }

    public Money getRegular() {
        return this.regular;
    }

    public void setRegular(Money regular) {
        this.regular = regular;
    }

    public ArrayList<Fare> getFare() {
        return this.fare;
    }

    public void setFare(ArrayList<Fare> fare) {
        this.fare = fare;
    }
}
