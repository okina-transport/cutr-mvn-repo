package org.opentripplanner.api.ws;

import java.util.Date;
import org.opentripplanner.routing.core.OptimizeType;
import org.opentripplanner.routing.core.TraverseMode;
import org.opentripplanner.routing.core.TraverseModeSet;

public interface RequestInf {
    String FROM = "fromPlace";
    String TO = "toPlace";
    String INTERMEDIATE_PLACES = "intermediatePlaces";
    String DATE = "date";
    String TIME = "time";
    String MAX_WALK_DISTANCE = "maxWalkDistance";
    String OPTIMIZE = "optimize";
    String MODE = "mode";
    String NUMBER_ITINERARIES = "numItineraries";
    String SHOW_INTERMEDIATE_STOPS = "showIntermediateStops";
    String TRIANGLE_TIME_FACTOR = "triangleTimeFactor";
    String TRIANGLE_SLOPE_FACTOR = "triangleSlopeFactor";
    String TRIANGLE_SAFETY_FACTOR = "triangleSafetyFactor";
    String PREFERRED_ROUTES = "preferredRoutes";
    String UNPREFERRED_ROUTES = "unpreferredRoutes";
    String ARRIVE_BY = "arriveBy";
    String WALK_SPEED = "walkSpeed";
    String WHEELCHAIR = "wheelchair";
    String MIN_TRANSFER_TIME = "minTransferTime";

    String getFrom();

    void setFrom(String var1);

    String getTo();

    void setTo(String var1);

    Double getMaxWalkDistance();

    void setMaxWalkDistance(Double var1);

    TraverseModeSet getModes();

    void addMode(TraverseMode var1);

    void setModes(TraverseModeSet var1);

    OptimizeType getOptimize();

    void setOptimize(OptimizeType var1);

    Date getDateTime();

    void setDateTime(Date var1);

    void setDateTime(String var1, String var2);

    boolean isArriveBy();

    void setArriveBy(boolean var1);

    Integer getNumItineraries();

    void setNumItineraries(Integer var1);

    void removeMode(TraverseMode var1);

    void setShowIntermediateStops(boolean var1);

    boolean getShowIntermediateStops();

    double getTriangleTimeFactor();

    void setTriangleTimeFactor(double var1);

    double getTriangleSlopeFactor();

    void setTriangleSlopeFactor(double var1);

    double getTriangleSafetyFactor();

    void setTriangleSafetyFactor(double var1);
}
