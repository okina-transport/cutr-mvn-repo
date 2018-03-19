package org.opentripplanner.v092snapshot.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import org.opentripplanner.routing.core.Fare;

public class Itinerary implements Serializable {
    private static final long serialVersionUID = 8579533939962545543L;
    public long duration = 0L;
    public Calendar startTime = null;
    public Calendar endTime = null;
    public long walkTime = 0L;
    public long transitTime = 0L;
    public long waitingTime = 0L;
    public Double walkDistance = 0.0D;
    public Double elevationLost = 0.0D;
    public Double elevationGained = 0.0D;
    public Integer transfers = 0;
    public Fare fare;
    public List<Leg> legs = new ArrayList();
    public boolean tooSloped = false;

    public Itinerary() {
    }

    public void addLeg(Leg leg) {
        if (leg != null) {
            this.legs.add(leg);
        }

    }

    public void removeLeg(Leg leg) {
        if (leg != null) {
            this.legs.remove(leg);
        }

    }

    public void removeBogusLegs() {
        Iterator it = this.legs.iterator();

        while(it.hasNext()) {
            Leg leg = (Leg)it.next();
            if (leg.isBogusNonTransitLeg()) {
                it.remove();
            }
        }

    }

    public Fare getFare() {
        return this.fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }
}
