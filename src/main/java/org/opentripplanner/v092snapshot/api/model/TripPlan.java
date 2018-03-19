package org.opentripplanner.v092snapshot.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripPlan {
    public Date date = null;
    public Place from = null;
    public Place to = null;
    @JsonProperty("itineraries")
    public List<Itinerary> itinerary = new ArrayList();

    public TripPlan() {
    }

    public TripPlan(Place from, Place to, Date date) {
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public void addItinerary(Itinerary itinerary) {
        this.itinerary.add(itinerary);
    }

    public List<Itinerary> getItinerary() {
        return this.itinerary;
    }

    public void setItinerary(List<Itinerary> itinerary) {
        this.itinerary = itinerary;
    }
}
