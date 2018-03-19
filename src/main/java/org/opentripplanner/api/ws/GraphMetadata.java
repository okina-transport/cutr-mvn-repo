package org.opentripplanner.api.ws;

import java.io.Serializable;
import java.util.HashSet;
import org.opentripplanner.routing.core.TraverseMode;

public class GraphMetadata implements Serializable {
    private static final long serialVersionUID = 4087543218027129527L;
    private double lowerLeftLatitude;
    private double lowerLeftLongitude;
    private double upperRightLatitude;
    private double upperRightLongitude;
    private HashSet<TraverseMode> transitModes = new HashSet();
    private double centerLatitude;
    private double centerLongitude;

    public GraphMetadata() {
    }

    public void setLowerLeftLatitude(double lowerLeftLatitude) {
        this.lowerLeftLatitude = lowerLeftLatitude;
    }

    public double getLowerLeftLatitude() {
        return this.lowerLeftLatitude;
    }

    public void setUpperRightLatitude(double upperRightLatitude) {
        this.upperRightLatitude = upperRightLatitude;
    }

    public double getUpperRightLatitude() {
        return this.upperRightLatitude;
    }

    public void setUpperRightLongitude(double upperRightLongitude) {
        this.upperRightLongitude = upperRightLongitude;
    }

    public double getUpperRightLongitude() {
        return this.upperRightLongitude;
    }

    public void setLowerLeftLongitude(double lowerLeftLongitude) {
        this.lowerLeftLongitude = lowerLeftLongitude;
    }

    public double getLowerLeftLongitude() {
        return this.lowerLeftLongitude;
    }

    /** @deprecated */
    public void setMinLatitude(double minLatitude) {
        this.lowerLeftLatitude = minLatitude;
    }

    /** @deprecated */
    public double getMinLatitude() {
        return this.lowerLeftLatitude;
    }

    /** @deprecated */
    public void setMinLongitude(double minLongitude) {
        this.lowerLeftLongitude = minLongitude;
    }

    /** @deprecated */
    public double getMinLongitude() {
        return this.lowerLeftLongitude;
    }

    /** @deprecated */
    public void setMaxLatitude(double maxLatitude) {
        this.upperRightLatitude = maxLatitude;
    }

    /** @deprecated */
    public double getMaxLatitude() {
        return this.upperRightLatitude;
    }

    /** @deprecated */
    public void setMaxLongitude(double maxLongitude) {
        this.upperRightLongitude = maxLongitude;
    }

    /** @deprecated */
    public double getMaxLongitude() {
        return this.upperRightLongitude;
    }

    public HashSet<TraverseMode> getTransitModes() {
        return this.transitModes;
    }

    public void setTransitModes(HashSet<TraverseMode> transitModes) {
        this.transitModes = transitModes;
    }

    public double getCenterLongitude() {
        return this.centerLongitude;
    }

    public void setCenterLongitude(double centerLongitude) {
        this.centerLongitude = centerLongitude;
    }

    public double getCenterLatitude() {
        return this.centerLatitude;
    }

    public void setCenterLatitude(double centerLatitude) {
        this.centerLatitude = centerLatitude;
    }
}