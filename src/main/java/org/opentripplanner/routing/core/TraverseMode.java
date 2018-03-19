package org.opentripplanner.routing.core;

public enum TraverseMode {
    WALK,
    BICYCLE,
    CAR,
    TRAM,
    SUBWAY,
    RAIL,
    BUS,
    FERRY,
    CABLE_CAR,
    GONDOLA,
    FUNICULAR,
    TRANSIT,
    TRAINISH,
    BUSISH,
    BOARDING,
    ALIGHTING,
    TRANSFER;

    private TraverseMode() {
    }

    public boolean isTransit() {
        return this == TRAM || this == SUBWAY || this == RAIL || this == BUS || this == FERRY || this == CABLE_CAR || this == GONDOLA || this == FUNICULAR || this == TRANSIT || this == TRAINISH || this == BUSISH;
    }

    public boolean isOnStreetNonTransit() {
        return this == WALK || this == BICYCLE || this == CAR;
    }
}
