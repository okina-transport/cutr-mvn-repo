package org.opentripplanner.api.model;

import java.io.Serializable;

public enum AbsoluteDirection implements Serializable {
    NORTH,
    NORTHEAST,
    EAST,
    SOUTHEAST,
    SOUTH,
    SOUTHWEST,
    WEST,
    NORTHWEST;

    private AbsoluteDirection() {
    }
}
