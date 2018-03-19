package org.opentripplanner.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

public class Place implements Serializable {
    private static final long serialVersionUID = 6464934892065481936L;
    protected static final Logger LOGGER = Logger.getLogger(Place.class.getCanonicalName());
    private static final String TAG = "OTP";
    public String name;
    public AgencyAndId stopId;
    public String stopCode;
    public String platformCode;
    public Double lon;
    public Double lat;
    public String arrival;
    public String departure;
    public String orig;
    public String zoneId;
    public Integer stopIndex;
    public Integer stopSequence;
    public VertexType vertexType;
    public String bikeShareId;
    public String geometry;

    String getGeometry() {
        return "{\"type\": \"Point\", \"coordinates\": [" + this.lon + "," + this.lat + "]}";
    }

    public Place() {
        this.name = null;
        this.stopId = null;
        this.stopCode = null;
        this.platformCode = null;
        this.lon = null;
        this.lat = null;
        this.arrival = null;
        this.departure = null;
        this.geometry = "";
    }

    public Place(Double lon, Double lat, String name) {
        this.name = null;
        this.stopId = null;
        this.stopCode = null;
        this.platformCode = null;
        this.lon = null;
        this.lat = null;
        this.arrival = null;
        this.departure = null;
        this.geometry = "";
        this.lon = lon;
        this.lat = lat;
        this.name = name;
    }

    public Place(Double lon, Double lat, String name, AgencyAndId stopId) {
        this(lon, lat, name);
        this.stopId = stopId;
    }

    public Place(Double lon, Double lat, String name, Date time) {
        this(lon, lat, name);
        this.arrival = this.departure = time.toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgencyAndId getStopId() {
        return this.stopId;
    }

    public void setStopId(AgencyAndId stopId) {
        this.stopId = stopId;
    }

    public String getStopCode() {
        return this.stopCode;
    }

    public void setStopCode(String stopCode) {
        this.stopCode = stopCode;
    }

    public String getPlatformCode() {
        return this.platformCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public Double getLon() {
        return this.lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return this.lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getArrival() {
        return this.arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return this.departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getOrig() {
        return this.orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getStopIndex() {
        return this.stopIndex;
    }

    public void setStopIndex(Integer stopIndex) {
        this.stopIndex = stopIndex;
    }

    public Integer getStopSequence() {
        return this.stopSequence;
    }

    public void setStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
    }

    public VertexType getVertexType() {
        return this.vertexType;
    }

    public void setVertexType(VertexType vertexType) {
        this.vertexType = vertexType;
    }

    public String getBikeShareId() {
        return this.bikeShareId;
    }

    public void setBikeShareId(String bikeShareId) {
        this.bikeShareId = bikeShareId;
    }
}
