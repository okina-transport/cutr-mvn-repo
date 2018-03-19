package org.opentripplanner.v092snapshot.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import org.opentripplanner.api.model.RelativeDirection;
import org.opentripplanner.routing.patch.Alerts;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class WalkStep implements Serializable {
    private static final long serialVersionUID = 4318821610981183969L;
    public double distance = 0.0D;
    public RelativeDirection relativeDirection;
    public String streetName;
    public AbsoluteDirection absoluteDirection;
    public String exit;
    public Boolean stayOn = false;
    public Boolean area = false;
    public Boolean bogusName = false;
    public double lon;
    public double lat;
    public List<Alerts> alerts;
    public transient double angle;

    public WalkStep() {
    }

    public String toString() {
        String direction = this.absoluteDirection.toString();
        if (this.relativeDirection != null) {
            direction = this.relativeDirection.toString();
        }

        return "WalkStep(" + direction + " on " + this.streetName + " for " + this.distance + ")";
    }

    public String streetNameNoParens() {
        int idx = this.streetName.indexOf(40);
        return idx < 0 ? this.streetName : this.streetName.substring(0, idx - 1);
    }

    public RelativeDirection getRelativeDirection() {
        return this.relativeDirection;
    }

    public void setRelativeDirection(RelativeDirection relativeDirection) {
        this.relativeDirection = relativeDirection;
    }

    public AbsoluteDirection getAbsoluteDirection() {
        return this.absoluteDirection;
    }

    public void setAbsoluteDirection(AbsoluteDirection absoluteDirection) {
        this.absoluteDirection = absoluteDirection;
    }
}