package org.opentripplanner.api.model;

import java.io.Serializable;

public enum RelativeDirection implements Serializable {
    DEPART,
    HARD_LEFT,
    LEFT,
    SLIGHTLY_LEFT,
    CONTINUE,
    SLIGHTLY_RIGHT,
    RIGHT,
    HARD_RIGHT,
    CIRCLE_CLOCKWISE,
    CIRCLE_COUNTERCLOCKWISE,
    ELEVATOR,
    UTURN_LEFT,
    UTURN_RIGHT;

    private RelativeDirection() {
    }
}
