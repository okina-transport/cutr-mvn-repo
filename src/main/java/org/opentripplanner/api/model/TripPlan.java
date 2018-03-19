package org.opentripplanner.api.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripPlan {
    private static final String TAG = "OTP";
    public String date;
    public Date formatted_date;
    public Place from = null;
    public Place to = null;
    public List<Itinerary> itineraries = new ArrayList();

    public void setDate(String d) {
        this.date = d;
    }

    public String getDate() {
        return this.date;
    }

    public TripPlan() {
    }

    public TripPlan(Place from, Place to, Date date) {
        this.from = from;
        this.to = to;
        this.formatted_date = date;
    }

    public void addItinerary(Itinerary itinerary) {
        this.itineraries.add(itinerary);
    }

    public Date getFormatted_date() {
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZ");

        try {
            this.formatted_date = parser.parse(this.date);
        } catch (ParseException var3) {
            var3.printStackTrace();
        }

        return this.formatted_date;
    }

    public List<Itinerary> getItinerary() {
        return this.itineraries;
    }

    public void setItinerary(List<Itinerary> itinerary) {
        this.itineraries = itinerary;
    }
}
