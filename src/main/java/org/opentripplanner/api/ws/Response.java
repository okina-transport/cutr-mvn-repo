package org.opentripplanner.api.ws;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.opentripplanner.api.model.TripPlan;
import org.opentripplanner.api.model.error.PlannerError;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class Response {
    private TripPlan plan;
    private PlannerError error = null;

    public Response() {
    }

    public TripPlan getPlan() {
        return this.plan;
    }

    public void setPlan(TripPlan plan) {
        this.plan = plan;
    }

    public PlannerError getError() {
        return this.error;
    }

    public void setError(PlannerError error) {
        this.error = error;
    }
}
