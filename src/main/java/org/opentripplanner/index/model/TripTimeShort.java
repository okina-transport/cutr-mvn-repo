package org.opentripplanner.index.model;

public class TripTimeShort {
    public static final int UNDEFINED = -1;
    public String stopId;
    public int scheduledArrival = -1;
    public int scheduledDeparture = -1;
    public int realtimeArrival = -1;
    public int realtimeDeparture = -1;
    public int arrivalDelay = -1;
    public int departureDelay = -1;
    public boolean timepoint = false;

    public TripTimeShort() {
    }
}
