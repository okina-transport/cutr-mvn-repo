package org.opentripplanner.v092snapshot.api.model;

import java.io.Serializable;
import java.util.Calendar;
import org.opentripplanner.api.model.AgencyAndId;

public class Place implements Serializable {
    private static final long serialVersionUID = 2731076807632135897L;
    public String name;
    public AgencyAndId stopId;
    public String stopCode;
    public Double lon;
    public Double lat;
    public Calendar arrival;
    public Calendar departure;
    public String orig;
    public String zoneId;
    public String geometry;

    public Place() {
        this.name = null;
        this.stopId = null;
        this.stopCode = null;
        this.lon = null;
        this.lat = null;
        this.arrival = null;
        this.departure = null;
    }

    public Place(Double lon, Double lat, String name) {
        this.name = null;
        this.stopId = null;
        this.stopCode = null;
        this.lon = null;
        this.lat = null;
        this.arrival = null;
        this.departure = null;
        this.lon = lon;
        this.lat = lat;
        this.name = name;
    }

    public Place(Double lon, Double lat, String name, Calendar timeAtState) {
        this(lon, lat, name);
        this.arrival = this.departure = timeAtState;
    }

    public String getGeometry() {
        return this.geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }
}
