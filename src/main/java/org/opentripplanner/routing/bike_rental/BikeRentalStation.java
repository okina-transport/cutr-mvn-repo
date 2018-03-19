package org.opentripplanner.routing.bike_rental;

import java.io.Serializable;

public class BikeRentalStation implements Serializable {
    private static final long serialVersionUID = 8311460609708089384L;
    public String id;
    public String name;
    public double x;
    public double y;
    public int bikesAvailable = 2147483647;
    public int spacesAvailable = 2147483647;
    public boolean allowDropoff = true;
    public boolean isFloatingBike = false;
    public boolean realTimeData = true;

    public BikeRentalStation() {
    }

    public void setRealTimeData(String value) {
        if (value.contains("true")) {
            this.realTimeData = true;
        } else if (value.contains("false")) {
            this.realTimeData = false;
        } else if (value.contains("yes")) {
            this.realTimeData = true;
        } else {
            this.realTimeData = false;
        }

    }

    public boolean equals(Object o) {
        if (!(o instanceof BikeRentalStation)) {
            return false;
        } else {
            BikeRentalStation other = (BikeRentalStation)o;
            return other.id.equals(this.id);
        }
    }

    public int hashCode() {
        return this.id.hashCode() + 1;
    }
}
