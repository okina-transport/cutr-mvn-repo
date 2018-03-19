package org.opentripplanner.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.opentripplanner.routing.patch.Alerts;

public class WalkStep implements Serializable {
    private static final long serialVersionUID = 2461090829521531602L;
    public double distance = 0.0D;
    public RelativeDirection relativeDirection;
    public String streetName;
    public AbsoluteDirection absoluteDirection;
    public String exit;
    public Boolean stayOn = false;
    public Boolean bogusName = false;
    public double lon;
    public double lat;
    public List<Alerts> alerts;

    public WalkStep() {
    }

    public void addAlerts(Collection<Alerts> newAlerts) {
        if (newAlerts != null) {
            if (this.alerts == null) {
                this.alerts = new ArrayList(newAlerts);
            } else {
                Iterator var2 = newAlerts.iterator();

                while(var2.hasNext()) {
                    Alerts alert = (Alerts)var2.next();
                    if (!this.alerts.contains(alert)) {
                        this.alerts.add(alert);
                    }
                }

            }
        }
    }

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public RelativeDirection getRelativeDirection() {
        return this.relativeDirection;
    }

    public void setRelativeDirection(RelativeDirection relativeDirection) {
        this.relativeDirection = relativeDirection;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public AbsoluteDirection getAbsoluteDirection() {
        return this.absoluteDirection;
    }

    public void setAbsoluteDirection(AbsoluteDirection absoluteDirection) {
        this.absoluteDirection = absoluteDirection;
    }

    public String getExit() {
        return this.exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public Boolean getStayOn() {
        return this.stayOn;
    }

    public void setStayOn(Boolean stayOn) {
        this.stayOn = stayOn;
    }

    public Boolean getBogusName() {
        return this.bogusName;
    }

    public void setBogusName(Boolean bogusName) {
        this.bogusName = bogusName;
    }

    public double getLon() {
        return this.lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public List<Alerts> getAlerts() {
        return this.alerts;
    }

    public void setAlerts(List<Alerts> alerts) {
        this.alerts = alerts;
    }
}
